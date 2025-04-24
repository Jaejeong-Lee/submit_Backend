package advanced.ch04.exam;

public class ThreadExample {
    public static void main(String[] args) {
        MovieThread mvThread = new MovieThread();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 6; i++) {
                    System.out.println("음악을 재생합니다.");

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread1.start();
        mvThread.start();
    }
}
