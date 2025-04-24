package basic.ch14.sec03.exam02;

public class BeepPrintExample {
    public static void main(String[] args) {

        Thread thread = new Thread(new RunnableClass());
        
        thread.start(); // 작업 스레드 실행

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
