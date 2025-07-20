package JavaChallenge.JavaChallengeExample;


import java.util.ArrayList;
import java.util.Scanner;

// 사용자 정의 예외 클래스
class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}

public class AgeLimitSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userList = new ArrayList<>();

        while (true) {
            System.out.println("\uD83D\uDC64 사용자 등록 시스템 (register, list, exit)");
            System.out.print("명령 입력: ");
            String command = scanner.nextLine();

            if (command.equals("register")) {
                System.out.print("이름 입력: ");
                String name = scanner.nextLine();
                System.out.print("나이 입력: ");
                int age = Integer.parseInt(scanner.nextLine());

                try {
                    if (age < 18) {
                        throw new UnderageException("⚠ 미성년자는 등록할 수 없습니다.");
                    }
                    userList.add(name + " (나이: " + age + ")");
                    System.out.println("✅ 사용자 등록 완료!");
                    System.out.println();
                } catch (UnderageException e) {
                    System.out.println(e.getMessage());
                    System.out.println();
                }

            } else if (command.equals("list")) {
                System.out.println("\uD83D\uDCCB 등록된 사용자 목록:");
                for (String user : userList) {
                    System.out.println(user);
                    System.out.println();
                }

            } else if (command.equals("exit")) {
                System.out.println("\uD83D\uDEAA 시스템 종료.");
                break;

            } else {
                System.out.println("⚠ 올바른 명령어를 입력해주세요.");
                System.out.println();
            }
        }

        scanner.close();
    }
}
