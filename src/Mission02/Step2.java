package Mission02;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수를 선언하고 입력받는 과정이 필요합니다!
        System.out.println("🦁 아기사자 이름을 입력해주세요.");
        String name = sc.nextLine();

        System.out.println("🎓 전공을 입력해주세요.");
        String major = sc.nextLine();

        System.out.println("📌 기수를 입력해주세요.");
        int generation = sc.nextInt();

        System.out.println("📌 Step 2: 객체 내부에서 유효성을 검증합니다.");

        // 입력받은 변수들을 Lion 생성자에 전달합니다.
        Lion lion = new Lion(name, major, generation);

        // 체크리스트: 객체 내부 메서드(isValid)를 사용하여 상태 검증
        if (lion.isValid()) {
            System.out.println("✅ 객체가 스스로 정상이라 판단했습니다.");
            lion.printInfo();
        }
    }
}