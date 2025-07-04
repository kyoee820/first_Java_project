package JavaBasic;

public class forExample {
    private static int i;

    public static void main(String[] args) {

//        // 1. 구구단 2단을 출력
//        for (int i = 1; i <= 9; i++) {
//            // int i 를 1로 초기화 후 조건식으로 i가 9보다 작거나 같을 때(참일때만 반복문 수행), 반복하며 1씩 증가
//            System.out.println(" 2 X " + i + " = " + (2 * i));
//        }
//
//        // 2. 합계 구하기
//        // 1+2+3+4+5+6+7+8+9+10 = 55
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum += i;
//        }
//        System.out.println("1부터 10까지의 합 : " + sum);

        // 2.   while문
//        int num = 1; // 외부에서 초기화
//        while (num <= 5) {  // while 문에는 조건식만 들어갈 수 있기 때문에 -> 조건식
//            System.out.println(num);
//            num++; // 증감식
//        }

        // 2. 카운트 다운
//        int count = 5;
//
//        while (count > 0) {
//            System.out.println(count);
//            count--;
//        }
//        System.out.println("발사!"); // 0이되는 순간에 조건문에서 빠져나와 발사! 출력
//
//        // 3. 무한루프
//        int i = 0;
//
//        while (true) {
//            System.out.println("무한 반복!!! 위험함. 횟수 : " + i);
//            i++;
//        }

        // 3. break, continue

        // break
//        int sum = 0;
//        int num = 1;
//
//        while (true) {
//            sum += num;
//            if (sum > 100) {
//                break;
//            }
//            num++;
//        }
//        System.out.println("마지막에 더한 수 : " +num);
//        System.out.println("최종 합계 : " + sum);
//
//        // continue
//        int number = 0;
//        while (number < 10){
//            number++;
//            if (number % 2 != 0) { // 홀수인 경우
//                continue;
//            }
//            System.out.println(number); // 짝수
//        }

        // 4. 구구단 작성
//        for (int dan = 2; dan <= 9; dan++) { // 2단부터 9단까지 반복
//            // 단수 표시
//            System.out.println("\n" + dan + "단");
//
//            // 1부터 9까지 곱하기
//            for (int i = 1; i <=9; i++) {
//                System.out.println(dan + " x " + i + " = " + (dan * i));
//            }
//        }

    // 문제: 반복문을 사용해서 1부터 100까지의 합 구하기

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i; // sum = sum + 1
        }
        System.out.println("1부터 100까지의 합 : " + sum);

    }

}
