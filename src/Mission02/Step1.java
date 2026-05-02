package Mission02;

import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🦁 아기사자 이름을 입력해주세요.");
        String name = sc.nextLine();
        System.out.println("🎓 전공을 입력해주세요.");
        String major = sc.nextLine();
        System.out.println("📌 기수를 입력해주세요.");
        int generation = sc.nextInt();

        System.out.println("📌 Step 1: main에서 직접 유효성 검증을 진행합니다.");
        if (!name.isEmpty() && generation >= 1) {
            System.out.println("⏩ 검증 통과! 객체를 생성합니다.");
            Lion lion = new Lion(name, major, generation);
            lion.printInfo();
        } else {
            System.out.println("❌ 이름은 비어 있을 수 없습니다.");
        }
    }
}