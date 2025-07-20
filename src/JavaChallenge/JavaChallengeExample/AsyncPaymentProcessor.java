package JavaChallenge.JavaChallengeExample;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class AsyncPaymentProcessor {
    public static void main(String[] args) {
        System.out.println("> Task :AsyncPaymentProcessor.main()");

        int amount = 500000;
        System.out.println("💳 결제 요청 중... (" + amount + "원)");

        // 시뮬레이션 지연 시간 (초단위로 변경 가능)
        int processingTime = 3; // 2 = 성공, 4 = 실패 케이스

        CompletableFuture<Integer> paymentFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(processingTime * 1000);
                return amount;
            } catch (InterruptedException e) {
                throw new RuntimeException("결제 중 오류 발생");
            }
        });

        // 3초 이내 완료되지 않으면 실패 처리
        try {
            int result = paymentFuture.orTimeout(3, TimeUnit.SECONDS).join();
            System.out.println("✅ 결제 완료: " + result + "원");
        } catch (Exception e) {
            System.out.println("⚠ 결제 실패: null");
        }
    }
}
