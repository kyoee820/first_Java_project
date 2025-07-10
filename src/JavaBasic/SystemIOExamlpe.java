package JavaBasic;

import java.io.IOException;
import java.util.Scanner;

public class SystemIOExamlpe {

    public static void main(String[] args) throws IOException {

        // 1. System.out
        // print 줄바뀜 없이 출력
//        int number = 10;
//        String text = "자바";
//        System.out.print(number);
//        System.out.print(text);
//
//        // println 줄바뀜 포함 출력
//        System.out.println();
//        System.out.println("첫 번째 줄");
//        System.out.println("두 번째 줄");
//
//        // printf() 포멧팅된 출력
//        System.out.println();
//
//        String name = "홍길동";
//        int age = 20;
//        double height = 175.5;
//
//        System.out.printf("이름 : %s\n", name);        // format-'%[]'가 중요! 문자열은 's', 정수형은 'd'...
//        System.out.printf("나이 : %d\n", age);
//        System.out.printf("키 : %.1f\n", height);

        // 3. System.in
        // 한 바이트 읽기
//        System.out.print("문자(char) 입력 : ");
//        int input = System.in.read();  // 예외 처리를 해줘야함. try-catch , throws
//
//        // 읽은 값 출력
//        System.out.println("입력한 문자 : " + (char) input);
//        System.out.println("아스키 코드값 : " + input);

        // 3. Scanner
        // 학생 정보 입력 프로그램 만들기
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("학생 정보를 입력하세요.");
//        System.out.print("이름 : ");
//        String name = scanner.nextLine();   // 키보드 입력한 결과에 엔터를 통해서 구분이 됨
//
//        System.out.print("학년 : ");
//        int grade = scanner.nextInt();
//
//        scanner.nextLine();     // 버퍼 비우기(스캐너 값 초기화)
//
//        System.out.print("반 : ");
//        String className = scanner.nextLine();
//
//        // 입력 정보 출력
//        System.out.println("\n== 학생 정보 ==");
//        System.out.println("이름 : " + name);
//        System.out.println("학년 : " + grade);
//        System.out.println("반 : " + className);
//
//        scanner.close();

        // 4. 계산기 프로그램 개발
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 숫자 입력
        System.out.print("첫 번째 숫자 : ");
        int num1 = scanner.nextInt();

        // 연산자 입력
        System.out.print("연산자(+,-,*,/)");
        String op = scanner.next();

        // 두 번째 숫자 입력
        System.out.print("두 번째 숫자: ");
        int num2 = scanner.nextInt();

        // 결과 계산 및 출력
        if (op.equals("+")) {
            System.out.println("결과 : " + (num1 + num2));
        } else if (op.equals("-")) {
            System.out.println("결과 : " + (num1 - num2));
        } else if (op.equals("*")) {
            System.out.println("결과 : " + (num1 * num2));
        } else if (op.equals("/")) {

            if (num2 != 0) {
                System.out.println("결과 : " + (num1 / num2));
            } else {
                System.out.println("0으로 나눌 수 없습니다.");
            }
        } else {
            System.out.println("잘못된 연산자 입니다.");
        }

        scanner.close();

    }
}
