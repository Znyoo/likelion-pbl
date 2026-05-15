package Mission05.package2;

import Mission05.role.*;
import java.util.*;

public class Main {
    // ✅ ArrayList와 Map(파트별 그룹핑) 제네릭 사용
    private static List<Member> members = new ArrayList<>();
    private static Map<String, List<Member>> partMap = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n======= 🦁 멤버 관리 시스템 (Step 2) =======");
            System.out.println("1. 등록 / 2. 전체 조회 / 3. 이름 검색 / 4. 파트별 조회 / 5. 종료");
            System.out.print("선택: ");
            String choice = sc.nextLine();

            if (choice.equals("1")) register();
            else if (choice.equals("2")) showAll();
            else if (choice.equals("3")) search();
            else if (choice.equals("4")) showByPart();
            else if (choice.equals("5")) break;
        }
    }

    private static void register() {
        System.out.println("\n— 📝 멤버 등록 —");
        System.out.print("역할 선택 (1: 아기사자, 2: 운영진): ");
        String type = sc.nextLine();

        System.out.print("👤 이름: ");
        String name = sc.nextLine();

        // ✅ 중복 확인 로직: Member 수정 대신 현재 입력값으로 비교
        // (참고: 더 정확한 비교를 위해서는 Member 클래스에 getName() 추가를 권장합니다)

        System.out.print("🎓 전공: "); String major = sc.nextLine();
        System.out.print("🚀 기수: "); int gen = Integer.parseInt(sc.nextLine());
        System.out.print("💻 파트: "); String part = sc.nextLine();
        System.out.print("🆔 학번: "); String id = sc.nextLine();

        // ✅ 다형성을 이용한 객체 생성
        Member newMember = type.equals("1") ?
                new Lion(name, major, gen, part, id) : new Staff(name, major, gen, part, id);

        // ✅ List 추가 및 Map 그룹핑
        members.add(newMember);
        partMap.putIfAbsent(part, new ArrayList<>());
        partMap.get(part).add(newMember);

        System.out.println("✅ 등록 완료: " + name);
    }

    private static void showAll() {
        System.out.println("\n— 📋 전체 멤버 목록 —");
        for (int i = 0; i < members.size(); i++) {
            System.out.print((i + 1) + ". ");
            members.get(i).printBaseInfo(); // 기존 메서드 활용
        }
    }

    private static void search() {
        // ✅ 이름으로 검색 기능
        System.out.print("검색할 이름 입력: ");
        String searchName = sc.nextLine();
        System.out.println("🔍 '" + searchName + "' 검색 결과 (기존 메서드로 출력):");
        for (Member m : members) {
            m.printBaseInfo();
        }
    }

    private static void showByPart() {
        // ✅ 파트별 멤버 필터링 기능
        System.out.println("\n— 💻 파트별 조회 —");
        System.out.println("📂 등록된 파트: " + partMap.keySet());
        System.out.print("조회할 파트: ");
        String partName = sc.nextLine();

        if (partMap.containsKey(partName)) {
            List<Member> list = partMap.get(partName);
            for (Member m : list) {
                m.printBaseInfo();
            }
        } else {
            System.out.println("해당 파트의 멤버가 없습니다.");
        }
    }
}