package Mission04;

import Mission04.role.Lion;
import Mission04.role.Member;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 아기사자 정보 입력받기
        System.out.println("=== 아기사자 정보 입력 ===");
        System.out.print("이름: "); String lName = sc.nextLine();
        System.out.print("전공: "); String lMajor = sc.nextLine();
        System.out.print("기수: "); int lGen = Integer.parseInt(sc.nextLine());
        System.out.print("파트: "); String lPart = sc.nextLine();
        System.out.print("학번: "); String lId = sc.nextLine();

        Member lion = new Lion(lName, lMajor, lGen, lPart, lId);

        // 2. 결과 출력 (추상 클래스 타입으로 다룸)
        System.out.println("\n========== 결과 출력 ==========");
        printMemberInfo(lion);
    }

    private static void printMemberInfo(Member m) {
        System.out.println("🎭 역할: " + m.getRoleName());
        m.printBaseInfo();
        m.printExtraInfo();

        // 다형성을 통한 제출 여부 확인 (3번 항목)
        String status = m.checkAssignment() ? "✅ 가능" : "❌ 불가능";
        System.out.println("📝 과제 제출 가능 여부: " + status);
    }
}