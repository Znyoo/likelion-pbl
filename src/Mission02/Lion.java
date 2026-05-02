package Mission02;

public class Lion {
    // 체크리스트: public, default, private를 각각 다르게 적용
    public String name;
    String major;         // default (접근 제어자 생략)
    private int generation;

    // 체크리스트: 3개 필드를 모두 초기화하는 생성자
    public Lion(String name, String major, int generation) {
        this.name = name;
        this.major = major;
        this.generation = generation;
    }

    // Step 2: 객체 스스로 상태를 검증하는 메서드
    // 체크리스트: 이름/전공 빈값, 기수 1 미만 조건 적용
    public boolean isValid() {
        if (name == null || name.isEmpty()) {
            System.out.println("❌ 이름은 비어 있을 수 없습니다.");
            return false;
        }
        if (major == null || major.isEmpty()) {
            System.out.println("❌ 전공은 비어 있을 수 없습니다.");
            return false;
        }
        if (generation < 1) {
            System.out.println("❌ 잘못된 아기사자 정보입니다.");
            return false;
        }
        return true;
    }

    public void printInfo() {
        System.out.println("👤 이름: " + name + " | 🎓 전공: " + major + " | 📌 기수: " + generation);
    }
}