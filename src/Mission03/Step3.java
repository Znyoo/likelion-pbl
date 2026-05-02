package Mission03;

import Mission02.Lion; // 다른 패키지의 클래스를 가져옴

public class Step3 {
    public static void main(String[] args) {
        Lion lion = new Lion("김멋대", "컴퓨터공학과", 14);

        // 1. public 필드: 접근 성공
        lion.name = "홍길동";

        // 2. default 필드: 다른 패키지이므로 에러 발생 (주석 풀어서 확인)
        // lion.major = "소프트웨어융합학과";

        // 3. private 필드: 클래스 외부이므로 에러 발생 (주석 풀어서 확인)
        // lion.generation = 15;
    }
}