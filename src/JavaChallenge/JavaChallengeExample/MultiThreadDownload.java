package JavaChallenge.JavaChallengeExample;

class FileDownload extends Thread {
    private String fileName;

    public FileDownload(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try {
            System.out.println("📥 " + fileName + " 다운로드 시작...");
            Thread.sleep(10000);  // 10초 대기
            System.out.println("✅ " + fileName + " 다운로드 완료!");
        } catch (InterruptedException e) {
            System.out.println("⚠ " + fileName + " 다운로드 중 오류 발생");
        }
    }
}

public class MultiThreadDownload {
    public static void main(String[] args) {
        System.out.println("> Task :MultiThreadDownload.main()");

        // 다운로드할 파일 목록
        String[] files = { "파일_1.zip", "파일_2.mp4", "파일_3.pdf" };

        for (String file : files) {
            FileDownload thread = new FileDownload(file);
            thread.start();  // 멀티스레드로 동시에 실행
        }
    }
}
