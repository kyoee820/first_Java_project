package JavaChallenge.JavaChallengeExample;

import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
    int balance = 10000;  // 초기 잔액
    Scanner scanner = null;

    System.out.println("> Task :ATMSystem.main()");
    try {
        scanner = new Scanner(System.in);
        System.out.print("출금할 금액 입력: ");
        int withdraw = scanner.nextInt();  // 숫자가 아닌 입력은 예외 발생

        if (withdraw > balance) {
            throw new Exception("⚠ 잔액 부족!");
        }

        balance -= withdraw;
        System.out.println("✅ 출금 완료! 남은 잔액: " + balance);

    } catch (Exception e) {
        System.out.println(e.getMessage());  // 예외 메시지 출력
    } finally {
        System.out.println("💰 거래 기록이 저장되었습니다.");
        if (scanner != null) {
            scanner.close();  // finally에서 Scanner 자원 정리
        }
    }
}
}


