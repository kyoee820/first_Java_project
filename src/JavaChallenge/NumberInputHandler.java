package JavaChallenge;

import java.util.Scanner;

public class NumberInputHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요. (종료: exit)");      // 입력할 숫자를 받음

        while (true) {              // 무한 루프를 만듦
            System.out.print("입력: ");          // 입력 값을 받음
            String input = scanner.nextLine() .trim();      // 입력받은 값을 input에 저장하고, scanner로 받아옴.

            if(input.equals("exit")) {
                System.out.println("프로그램 종료");
                break;
            }

            try {
                int number = Integer.parseInt(input);       // number를 변환을 하고, 에러 발생하지 않는다면 변환성공!
                System.out.println("변환 성공: 입력한 숫자는" + number + "입니다.");
            } catch (NumberFormatException e) {     // 예외가 발생한다면 NumberFormatException을 catch해서
                System.out.println("숫자가 아닙니다. 올바른 숫자를 입력하세요.");
            } finally {
                System.out.println("finally");
            }
        }
        scanner.close();            // while루프를 닫아줌
    }
}
