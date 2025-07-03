package JavaBasic;

public class VariableExample {

    static final int MAX_VALUE = 100; // 상수 static final 키워드

    public static void main(String[] args) {
        // 1. 변수 선언과 초기화
        int number; // 변수 선언
        number = 10; // 변수 초기화
        System.out.println(number);

        int score = 90; // 변수 선언과 초기화
        System.out.println(score);

        // 2. 변수 값 재정의
        number = 20; // 6번에서 초기화된 10이 13번에서 재정의 되어 14번에 출력
        System.out.println("number = " + number);

        // 3. 상수 선언과 초기화
        //MAX_VALUE = 200; // 컴파일 에러 : 상수는 값 재정의 불가

        // 4. 잘못된 변수 선언 예시
        //int 1number; // 숫자로 시작 불가
        //int class; // 예약어 사용 불가
        //int my score; // 변수 내 공백 불가
        //int #number; // 특수문자 사용 불가 ($, _ 허용)

        // 5. 올바른 변수명 예시
        int age = 25;
        int myAge = 30;
        int number1 = 40;
        int _temp = 50;
        int $price = 60;


        
    }
}
