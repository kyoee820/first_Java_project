package JavaChallenge.JavaChallengeExample;

class AuthService implements Runnable {
    // ThreadLocal: 각 스레드가 독립적으로 사용자 정보를 저장
    private static ThreadLocal<String> userInfo = new ThreadLocal<>();

    private String userName;

    public AuthService(String userName) {
        this.userName = userName;
    }

    @Override
    public void run() {
        // 사용자 정보 저장
        userInfo.set(userName);

        // 현재 스레드 이름과 사용자 정보 출력
        System.out.println(Thread.currentThread().getName() + " 로그인: " + userInfo.get());

        // 메모리 누수 방지를 위해 remove()
        userInfo.remove();
    }
}

public class AuthenticationSystem {
    public static void main(String[] args) {
        System.out.println("> Task :AuthenticationSystem.main()");

        // 사용자 A와 B의 인증 정보 저장
        Thread thread1 = new Thread(new AuthService("사용자 A"), "Thread-1");
        Thread thread2 = new Thread(new AuthService("사용자 B"), "Thread-2");

        thread1.start();
        thread2.start();
    }
}
