import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); #
        int count = 0;

        while (true) {
            System.out.println("🦁 저장할 아기사자 수를 5 이상 입력해주세요.");

            if (sc.hasNextInt()) {
                count = sc.nextInt();
                if (count >= 5) {
                    break;
                } else {
                    System.out.println("❗ [오류] 5 이상 입력해주세요.");
                }
            } else {
                System.out.println("❗ [오류] 숫자로만 입력해주세요.");
            }
        }

        String[] names = new String[count];
        sc.nextLine();

        System.out.println("✏️ 아기사자 이름을 입력해주세요.");
        for (int i = 0; i < count; i++) {
            names[i] = sc.nextLine();
        }

        System.out.println("\n📋 아기사자 명단을 최종적으로 출력합니다.");
        for (int i = 0; i < names.length; i++) {
            System.out.println("🦁 " + (i + 1) + ". " + names[i]);
        }
    }
}