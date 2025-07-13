
import java.util.*;

public class StudentGradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Integer>> studentGrades = new HashMap<>();

        while (true) {
            System.out.println("🎓 성적 관리 시스템 (add, remove, grade, average, list, exit)");
            System.out.print("명령 입력: ");
            String command = scanner.nextLine();

            switch (command) {
                case "add":
                    System.out.print("학생 이름: ");
                    String name = scanner.nextLine();
                    if (studentGrades.containsKey(name)) {
                        System.out.println("⚠️ 이미 존재하는 학생입니다.\n");
                    } else {
                        studentGrades.put(name, new ArrayList<>());
                        System.out.println("✅ 학생이 추가되었습니다.\n");
                    }
                    break;

                case "remove":
                    System.out.print("삭제할 학생 이름: ");
                    String delName = scanner.nextLine();
                    if (studentGrades.containsKey(delName)) {
                        studentGrades.remove(delName);
                        System.out.println("✅ 학생이 삭제되었습니다.\n");
                    } else {
                        System.out.println("⚠️ 존재하지 않는 학생입니다.\n");
                    }
                    break;

                case "grade":
                    System.out.print("성적 추가할 학생 이름: ");
                    String gradeName = scanner.nextLine();
                    if (studentGrades.containsKey(gradeName)) {
                        System.out.print("성적 입력: ");
                        try {
                            int score = Integer.parseInt(scanner.nextLine());
                            studentGrades.get(gradeName).add(score);
                            System.out.println("✅ 성적이 추가되었습니다.\n");
                        } catch (NumberFormatException e) {
                            System.out.println("⚠️ 존재하지 않는 학생입니다.\n");
                        }
                    }
                    break;

                case "average":
                    System.out.print("평균 조회할 학생 이름: ");
                    String avgName = scanner.nextLine();
                    if (studentGrades.containsKey(avgName)) {
                        List<Integer> grades = studentGrades.get(avgName);
                        if (grades.isEmpty()) {
                            System.out.println(avgName + "의 성적이 없습니다.\n");
                        } else {
                            double average = grades.stream().mapToInt(i -> i).average().orElse(0.0);
                            System.out.println("📊 " + avgName + "의 평균 성적: " + String.format("%.2f", average) + "\n");
                        }
                    } else {
                        System.out.println("⚠️ 존재하지 않는 학생입니다.\n");
                    }
                    break;

                case "list":
                    System.out.println("📋 학생 목록:");
                    for (String student : studentGrades.keySet()) {
                        System.out.println(student + " - 성적: " + studentGrades.get(student));
                    }
                    System.out.println();
                    break;

                case "exit":
                    System.out.println("🚪 프로그램 종료.");
                    return;

                default:
                    System.out.println("⚠️ 잘못된 명령입니다. 다시 입력해주세요.\n");
            }
        }
    }
}
