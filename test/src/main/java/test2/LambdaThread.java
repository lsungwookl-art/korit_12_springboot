package test2_13;

public class LambdaThread {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("새로운 스레드에서 실행 중...");
        };
        Runnable task = () -> {
            System.out.println("새로운 스레드에서 실행 중...");
        };
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("메인 스레드 종료.");
    }
}
