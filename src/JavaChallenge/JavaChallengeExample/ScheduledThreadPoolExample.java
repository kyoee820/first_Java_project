package JavaChallenge.JavaChallengeExample;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScheduledThreadPoolExample {
    public static void main(String[] args) {
        System.out.println("> Task :ScheduledThreadPoolExample.main()");

        // 스레드 풀 생성 (1개의 스레드만 사용)
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable emailTask = new Runnable() {
            int count = 1;

            @Override
            public void run() {
                String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSS"));
                String threadName = Thread.currentThread().getName();
                System.out.println("[ " + time + " ] 📧 이메일 발송: " + count + " (" + threadName + ")");
                count++;
            }
        };

        // 5초 후 첫 실행, 이후 10초마다 반복 실행
        scheduler.scheduleAtFixedRate(emailTask, 5, 10, TimeUnit.SECONDS);
    }
}
