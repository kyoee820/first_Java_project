
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;

class Contact {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return name + " - " + phone;
    }
}

public class ContactManager {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        while (true) {
            System.out.println("📞연락처 관리 시스템(add, remove, list, search, exit)");
            System.out.print("명령 입력: ");
            String command = scanner.nextLine();

            if (command.equals("add")) {
                System.out.print("이름: ");
                String name = scanner.nextLine();
                System.out.print("전화번호: ");
                String phone = scanner.nextLine();

                contacts.add(new Contact(name, phone));
                System.out.println("✅ 연락처가 추가되었습니다.\n");

            } else if (command.equals("remove")) {
                System.out.print("삭제할 연락처 이름: ");
                String nameToDelete = scanner.nextLine();
                boolean removed = false;

                for (int i = 0; i < contacts.size(); i++){
                    if (contacts.get(i).getName().equals(nameToDelete)) {
                        contacts.remove(i);
                        System.out.println("✅ 삭제완료.\n");
                        removed = true;
                        break;
                    }
                }
                if (!removed) {
                    System.out.println("❌ 해당 이름을 찾을 수 없습니다.\n");
                }
            } else if (command.equals("search")) {
                System.out.print("검색할 이름: ");
                String nameToSearch = scanner.nextLine();
                boolean found = false;

                for (Contact c : contacts) {
                    if (c.getName().equals(nameToSearch)) {
                        System.out.println(c + "\n");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("❌ 해당 이름을 찾을 수 없습니다.\n");
                }
            } else if (command.equals("list")) {
                System.out.print("📋 연락처 목록 (이름 오름차순 정렬): ");
                contacts.sort(Comparator.comparing(Contact:: getName));

                for (Contact c : contacts) {
                    System.out.println(c);
                }
                System.out.println();
            } else if (command.equals("exit")) {
                System.out.println("🚪 종료합니다.");
                break;

            } else {
                System.out.println("❌ 잘못된 명령입니다. 다시 입력해주세요.\n");
            }
        }

        scanner.close();
    }

}