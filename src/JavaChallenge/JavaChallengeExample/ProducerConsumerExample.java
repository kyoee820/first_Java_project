package JavaChallenge.JavaChallengeExample;

import java.util.LinkedList;
import java.util.Queue;

// 공유 큐 클래스
class SharedQueue {
    private Queue<Integer> queue = new LinkedList<>();
    private int value = 1;

    public synchronized void produce() throws InterruptedException {
        queue.offer(value);
        System.out.println("📦 생산: " + value);
        value++;
        notify(); // 소비자에게 알림
        wait();   // 생산자는 대기
    }

    public synchronized void consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        int data = queue.poll();
        System.out.println("📥 소비: " + data);
        notify(); // 생산자에게 알림
        wait();   // 소비자는 대기
    }
}

// 생산자 (Runnable 사용)
class ProducerRunnable implements Runnable {
    private SharedQueue queue;

    public ProducerRunnable(SharedQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                queue.produce();
                Thread.sleep(300); // 약간의 딜레이
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// 소비자 (Runnable 사용)
class ConsumerRunnable implements Runnable {
    private SharedQueue queue;

    public ConsumerRunnable(SharedQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                queue.consume();
                Thread.sleep(500); // 소비가 더 느린 설정
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        System.out.println("> Task :ProducerConsumerExample.main()");

        SharedQueue queue = new SharedQueue();

        // Runnable 객체를 Thread로 실행
        Thread producerThread = new Thread(new ProducerRunnable(queue));
        Thread consumerThread = new Thread(new ConsumerRunnable(queue));

        producerThread.start();
        consumerThread.start();
    }
}
