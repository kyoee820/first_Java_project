package JavaBasic;

import org.w3c.dom.ls.LSOutput;

public class IfElseExample {
    public static void main(String[] args) {
        // 1. if-else
        // 1. 합격/불합격 판단
//        int score = 85;
//
//        if (score >= 60) { // 점수가 60 이상이면 합격
//            System.out.println("합격");
//        } else { // 그렇지 않은 경우에는 불합격으로 판단
//            System.out.println("불합격");
//        }
//
//        // 2. 학점 계산
//        int grade = 87;
//
//        if (grade >= 90) {
//            System.out.println("A");
//        } else if (grade >= 80) {
//            System.out.println("B");
//        } else if (grade >= 70) {
//            System.out.println("C");
//        } else {
//            System.out.println("F");
//        } //grade는 87점이기 때문에

        // 2. 중첩 조건문
//        int score = 85;
//        int attendance = 80;
//
//        if (score >= 60) {
//
//            if (attendance >= 75) {
//                System.out.println("최종 합격");
//
//            } else {
//                System.out.println("출석 미달로 불합격");
//            }
//
//        } else {
//            System.out.println("성적 미달로 불합격");
//            // score 값이 85로 초기화가 되어있고, 출석률의 경우 80으로 되어있어 75 이상이라 최종 합격
//        }

        // 3. switch
        // 1. 요일별 일정
//        int day = 3;
//        switch (day) {
//            case 1:
//                System.out.println("월요일 : 회의");
//                break;
//            case 2:
//                System.out.println("화요일 : 업무");
//                break;
//            case 3:
//                System.out.println("수요일 : 휴식");
//                break;
//            default:
//                System.out.println("다른 요일");
//        } // 수요일 : 휴식 출력 , day 변수 3이기 때문에
//
//        // 2. 계절 판별
//        String month = "January";
//
//        switch (month) {
//            case "December":
//            case "January":
//            case "February":
//                System.out.println("겨울");
//                break;
//            case "March":
//            case "April":
//            case "May":
//                System.out.println("봄");
//                break;
//                // 12월~2월 : 겨울 , 3월~5월 : 봄 , month값이 January라 겨울이 출력됨.
//    }

    // 문제: if-else문을 삼항 연산자로 바꿔보세요.
    int score = 85;

    if (score >= 60) {
        System.out.println("합격!");
    } else {
        System.out.println("불합격.");
    } // 3항연산자로 바꿔보면

    String result = score >= 60 ? "합격!" : "불합격.";
    // rdsult라는 string변수 만듦
    System.out.println("삼항 연산자 : " + result);

    } // 삼항 연산자 : 합격 if-else 60이상이니까 합격 , 삼항 연산자에서도 동일한 조건을 가지고 if-else 구문을 삼항 연산자 치환

}
 // 조건이 복잡해지거나, 중첩이 되는 부분이 생길시 삼항연산자보다는 if-else가 가독성이 더 좋음