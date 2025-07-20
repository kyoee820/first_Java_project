package JavaChallenge.JavaChallengeExample;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.LongStream;

public class ParallelStreamSumExample {
        public static void main (String[]args){
            System.out.println("> Task : ParallelStreamSumExample.main()");

            // 1. 순차 스트림 처리
            Instant start1 = Instant.now();
            long sum1 = LongStream.rangeClosed(1, 500_000_000L).sum();
            Instant end1 = Instant.now();
            long time1 = Duration.between(start1, end1).toMillis();
            System.out.println("🚀 순차 스트림 합계: " + sum1 + " (시간: " + time1 + "ms)");

            // 2. 병렬 스트림 처리
            Instant start2 = Instant.now();
            long sum2 = LongStream.rangeClosed(1, 500_000_000L).parallel().sum();
            Instant end2 = Instant.now();
            long time2 = Duration.between(start2, end2).toMillis();
            System.out.println("🔥 병렬 스트림 합계: " + sum2 + " (시간: " + time2 + "ms)");
        }
    }