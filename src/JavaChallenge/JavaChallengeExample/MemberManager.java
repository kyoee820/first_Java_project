
import java.util.HashSet;
import java.util.Scanner;

public class MemberManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> members = new HashSet<>();

        while (true) {
            System.out.println("👥 회원 관리 시스템 (add, remove, list, check, exit)");
            System.out.print("명령 입력: ");
            String command = scanner.nextLine();

            if (command.equals("add")) {
                System.out.print("추가할 회원 ID: ");
                String id = scanner.nextLine();

                if (members.contains(id)) {
                    System.out.println("⚠️ 이미 존재하는 회원입니다.\n");
                } else {
                    members.add(id);
                    System.out.println("✅ 회원이 추가되었습니다.\n");
                }

            } else if (command.equals("remove")) {
                System.out.print("삭제할 회원 ID: ");
                String id = scanner.nextLine();

                if (members.contains(id)) {
                    members.remove(id);
                    System.out.println("✅ 회원이 삭제되었습니다.\n");
                } else {
                    System.out.println("⚠️ 존재하지 않는 회원 ID입니다.\n");
                }

            } else if (command.equals("list")) {
                System.out.println("📋 현재 회원 목록: ");
                for (String id : members) {
                    System.out.println(id);
                }
                System.out.println();

            } else if (command.equals("check")) {
                System.out.print("검색할 회원 ID: ");
                String id = scanner.nextLine();

                if (members.contains(id)) {
                    System.out.println("✅ 회원이 존재합니다.\n");
                } else {
                    System.out.println("⚠️ 회원이 존재하지 않습니다.\n");
                }
            } else if (command.equals("exit")) {
                System.out.println("🚪 프로그램 종료.");
                break;
            }
        }
        scanner.close();
    }

}