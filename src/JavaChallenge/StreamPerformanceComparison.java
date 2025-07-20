package JavaChallenge;

import java.util.List;
import java.util.stream.LongStream;

public class StreamPerformanceComparison {
    public static void main(String[] args) {
        List<Long> numbers = LongStream.rangeClosed(1, 100_000_000L)         // 1부터 11억개 까지의 숫자를 넣고,
                .boxed()
                .toList();

        // sequential
        long start = System.currentTimeMillis();
        long sumSequential = numbers.stream()           // 일반 스트림 사용
                .filter(n -> n % 2 == 0)    // 짝수만 원함
                .mapToLong(Long::longValue)
                .sum();
        long end = System.currentTimeMillis();
        System.out.println("sequential: " + sumSequential + ", time: " + (end-start) + "ms");       // 시간은 end-start

        start = System.currentTimeMillis();
        long sumParallel = numbers.parallelStream()         // 병렬 처리
                .filter(n -> n % 2 == 0)
                .mapToLong(Long::longValue)
                .sum();
        end = System.currentTimeMillis();
        System.out.println("parallel: " + sumParallel + ", time: " + (end-start) + "ms");

    }
}
