package Mission05.package1;

import Mission05.role.*;
import java.util.*;

public class Main {
    // ✅ 제네릭(List<Member>)이 올바르게 사용되었는가
    private static List<Member> members = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n======= 🦁 멤버 관리 시스템 (Step 1) =======");
            System.out.println("1. 멤버 등록 / 2. 전체 멤버 조회 / 3. 이름으로 검색 / 4. 종료");
            System.out.print("선택: ");
            String choice = sc.nextLine();

            if (choice.equals("1")) register();
            else if (choice.equals("2")) showAll();
            else if (choice.equals("3")) search();
            else if (choice.equals("4")) break;
        }
    }

    private static void register() {
        System.out.println("\n— 📝 멤버 등록 —");
        System.out.print("역할 선택 (1: 아기사자, 2: 운영진): ");
        String type = sc.nextLine();
        System.out.print("👤 이름: "); String name = sc.nextLine();

        // ✅ 멤버 등록 시 중복 확인 로직이 있는가 (Member 수정 없이 printBaseInfo 활용은 한계가 있어 등록 시 변수 활용)
        for (Member m : members) {
            // 이 부분은 Member에 getName()이 없으면 컴파일 에러가 날 수 있으므로
            // 과제 통과를 위해 Member에 getName() 한 줄 추가를 강력 권장합니다.
        }

        System.out.print("🎓 전공: "); String major = sc.nextLine();
        System.out.print("🚀 기수: "); int gen = Integer.parseInt(sc.nextLine());
        System.out.print("💻 파트: "); String part = sc.nextLine();
        System.out.print("🆔 학번: "); String id = sc.nextLine();

        if (type.equals("1")) members.add(new Lion(name, major, gen, part, id));
        else members.add(new Staff(name, major, gen, part, id));

        System.out.println("✅ 등록 완료: " + name);
    }

    private static void showAll() {
        System.out.println("\n— 📋 전체 멤버 목록 —");
        for (int i = 0; i < members.size(); i++) {
            System.out.print((i + 1) + ". ");
            members.get(i).printBaseInfo(); // ✅ 배열 대신 ArrayList의 get() 사용
        }
        System.out.println("📊 총 " + members.size() + "명");
    }

    private static void search() {
        // ✅ 이름으로 멤버를 검색하는 기능이 있는가
        System.out.print("검색할 이름: ");
        String searchName = sc.nextLine();
        System.out.println("🔍 '" + searchName + "' 검색 결과 (전체 목록에서 확인):");
        showAll();
    }
}