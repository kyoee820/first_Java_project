package JavaBasic;

public class ArryExample {

    public static void main(String[] args) {

        // 1. 배열
        // 배열이 없다면
//        int score1 = 90;
//        int score2 = 80;
//        int score3 = 85;
//        int score4 = 95;
//
//        // 배열 사용시
//        // int[] scores = {90, 80, 85, 95};
//
//        // 2. 배열의 선언과 생성
//        // 배열 선언
//        // int[] numbers; // 권장
//        // int scores[]; // 권장하지 않습니다.
//
//        // 배열 생성
//        // numbers = new int[5]; // 5개의 정수를 저장할 수 있는 배열 생성
//
//        // 선언과 생성을 동시에
//        int[] ages = new int[3];
//
//        // 선언과 동시에 초기화
//        int[] points = {95, 88, 76, 91, 85};
//
//        // 3. 배열의 사용
//        int[] numbers  = new int[5];
//
//        // 값 저장
//        numbers[0] = 10;
//        numbers[1] = 20;
//
//        // 값 읽기
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//
//        // 배열의 길이
//        System.out.println(numbers.length); // 배열에 할당된 공간인 5를 출력
//
//        // 배열은 반복문을 사용해 순회 가능
//        int[] scores = {90, 80, 85, 95};
//        for (int i = 0; i < scores.length; i++) { // 4번 반복
//            System.out.println(scores[i]); // 0, 1, 2, 3 // 순차적으로 순회
//        }
//
//        // for-each 사용
////        for (int score: scores) {
////            System.out.println(score);
////        }
//
//        // 주의 사항
//        int[] arr = new int[1];
//        // arr[2] = 3; // 배열의 범위를 넘어서서 값을 넣고 저장하거나, 조회하는 경우 '에러발생'
//
//        int[] nullArr;
//        nullArr[0] = 1; // nullArr 저장공간 초기화 안되어서 오류!
//


        // 문제 : 배열과 반복문을 활용한 로또 번호 생성기 만들어보기
        // 1. 로또 번호를 저장할 배열 생성 (6개의 숫자)
        int[] lotto = new int[6]; //

        // 2. 로또 번호 생성 (1~45)
        for (int i = 0; i < 6; i++) {
            // 1~45 사이의 랜덤한 숫자 생성
            int num = (int) (Math.random() * 45) + 1; // 0부터 시작하기 때문에 1~45까지 출력될 수 있도록!

            // 중복 검사
            boolean isDuplicated = false;

            // 이미 생성된 번호와 비교
            for (int j = 0; j < i; j++) {
                if (lotto[j] == num) {
                    isDuplicated = true;
                    i--; // 중복이면 이번 회차 다시
                    break;

                }
            }

            // 중복이 아닐 경우에만 배열에 저장 (정상출력 된것임으로)
            if (!isDuplicated) {
                lotto[i] = num;
            }
        }

        // 생성된 로또 번호를 출력
        System.out.println("로또 번호 : ");
        for (int i = 0; i < lotto.length; i++) {
            System.out.println(lotto[i] + " ");
        }

    }
}
