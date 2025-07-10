package JavaBasic;

import java.io.*;

public class StreamExample {

    public static void main(String[] args) {

        // 1. fileInputStream으로 byte 읽고, try-with-resource 구문 사용
//        try(FileInputStream fis = new FileInputStream("test.txt")) {
//            int data;
//            // 한 바이트씩 읽기
//            while ((data = fis.read()) != -1) {
//                System.out.print((char) data);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // 2. FileOutputStream으로 byte 쓰기
//        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
//            String text = "Hello, Java!";
//            byte[] bytes = text.getBytes();     // Hello Java 를 바이트로 변환하는 코드 String클래스는 getBytes 메소드!
//            fos.write(bytes);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // 3. FileReader로 한 문자씩 읽기
//        try (FileReader fr = new FileReader("test.txt")) {      // try with
//            int data;
//            // 한 문자씩 읽기
//            while ((data = fr.read()) != -1) {
//                System.out.println((char) data);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // 4. FileWriter로 문자 쓰기
//        try(FileWriter fw = new FileWriter("output.txt")) {
//            fw.write("안녕하세요!\n");
//            fw.write("자바 스트림 수업시간입니다.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // 5. BufferedReader로 한 줄씩 읽기
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {   // 파이프라인 - 파일리더를 버퍼드리더로 감싸기
            String line;
            // 한 줄씩 읽기
            while ((line = br.readLine()) != null) {     // 한 줄씩 읽으며 readLine에 담기!
                System.out.println(line);
            }
        } catch (IOException e) {

        }

        // 6. BufferedWriter로 쓰기
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write("첫 뻔째 줄");
            bw.newLine();
            bw.write("두 번째 줄");
            bw.newLine();
            bw.write("세 번째 줄");
        } catch (IOException e) {

        }
    }

}
