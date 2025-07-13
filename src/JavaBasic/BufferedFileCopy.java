package JavaBasic;

import java.io.*;

public class BufferedFileCopy {

    private static final int BUFFER_SIZE = 8192;     // 버퍼사이즈 8kb
    public static void main(String[] args) {
        File source = new File("test.txt");
        File target = new File ("test_copy.txt");   // 소스를 그대로 복사
        try {
            copyFile(source, target);     // 메소드 생성
            System.out.println("파일 복사가 완료되었습니다.");
        } catch (InvalidPathException e) {
            System.err.println("잘못된 파일 경로 입니다: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("파일 복사 중 오류가 발생했습니다." + e.getMessage());
        }
    }

    private static void copyFile(File source, File target) throws IOException  {        // copyFile은 source와 target을 같이 전달받아 복사
        validatePaths(source, target);       // 원본 파일 존재 유무/ 원본 파일에 대한 권한, 조회, 수정 권한이 있는지 검증 구현

        try (BufferedInputStream bis =
                     new BufferedInputStream(new FileInputStream(source));
                BufferedOutputStream bos =
                        new BufferedOutputStream(new FileOutputStream(target))) {

                byte[] buffer = new byte[BUFFER_SIZE];      // 버퍼사이즈 사용
                int bytesRead;

                while ((bytesRead = bis.read(buffer)) != -1) {      // 실제 read한 값이 buffer []에 저장
                    bos.write(buffer, 0, bytesRead);        // buffer 배열 저장, 시작은 0번부터 bytesRead 만큼(읽은 만큼)쓴다.
                }
                bos.flush();                    // flush를 통해 버퍼를 비워줌

        }
    }

    private static void validatePaths(File source, File target) throws InvalidPathException {       // validatePaths 구현
        if (!source.exists()) {
            throw new InvalidPathException(source.getPath(), "원본 파일이 존재하지 않습니다.");
        }
        if (!source.canRead()) {
            throw new InvalidPathException(source.getPath(), "원본 파일을 읽을 수 없습니다.");
        }
        if (target.exists() && target.canWrite()) {
            throw new InvalidPathException(source.getPath(), "대상 파일에 쓸 수 없습니다.");
        }
    }

    private static class InvalidPathException extends IOException {

        public InvalidPathException(String path, String reason) {
            super(String.format("%s: %s", reason, path));   // InvalidPathException 생성

    }
}
}

