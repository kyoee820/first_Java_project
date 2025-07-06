package JavaBasic;

public class BankAccount {

    // 필드
    private String accountNumber;   // 계좌번호
    private String owner;           // 예금주
    private int balance;            // 잔액
    private static int totalAccounts; // 전체 계좌 수

    // 생성자
//    public BankAccount() {
//        // 자바 기본 생성자: 매개변수 없는 기본생성자
//        // 기본 생성자의 경우 매개변수 있는 생성자를 만들면 기본 생성자는 자동으로 만들어지지 않는다.
//    }
    public BankAccount(String accountNumber, String owner) {
        // BankAccount 클래스가 객체가 생성될 때 마다 전체 계좌수를 증가시킴
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = 0;
        totalAccounts++;

    }

    // 메소드
    // 1. 입금
    public void deposit(int amount) {
        if (amount > 0 ) {
            balance += amount;
        }
    } // 음수 값이나 0이 들어오면 비정상 입금

    // 2. 출금
    public boolean withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            // 출금 금액은 계좌 금액보다 많거나 같아야함
            balance -= amount;
            return true;
        }
        return false;
    }

    // 3. 잔액 조회
    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] atgs){
        // 1. 계좌 생성
        BankAccount account1 = new BankAccount("1111-2222", "홍길동");
        BankAccount account2 = new BankAccount("3333-4444", "김철수");
        BankAccount account3 = new BankAccount("6666-7777", "김철수");

        // 2. 입금 테스트
        account1.deposit(50000); // 5만원 입금
        System.out.println(account1.getOwner() + "님의 잔액 : " + account1.getBalance());

        account2.deposit(100000); // 10만원 입금
        System.out.println(account2.getOwner() + "님의 잔액 : " + account2.getBalance());

        // 3. 출금 테스트
        boolean withdraw = account1.withdraw(30000); // 3만원 출금
        if (withdraw) {
            System.out.println("출금 성공!");
            System.out.println("현재 잔액 : " + account1.getBalance());
        } else {
            System.out.println("출금 실패...");
        }

        // 4. 잔액 부족 테스트
        if (account1.withdraw(100000))  { // 10만원 출금 시도
            System.out.println("출금 성공!");
        } else {
            System.out.println("잔액이 부족합니다.");
            System.out.println("현재 잔액 : " + account1.getBalance());
        }

        // 5. 전체 계좌 수 확인
        System.out.println("전체 계좌 수 : " + BankAccount.getTotalAccounts()); // 클래스 사용해서 출력!

    }
}
