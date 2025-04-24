package basic.ch14.sec03.exam02;

import java.awt.*;

public class RunnableClass implements Runnable{
    @Override
    public void run() {
        // 스레드한테 시킬 일
        // Toolkit 도구모음 클래스
        // beep()

        Toolkit toolkit = Toolkit.getDefaultToolkit(); // 인스턴스 생성
        for (int i = 0; i < 5; i++) {
            toolkit.beep();

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // 예외가 발생한 위치 경로를 알려줌(콘솔에 출력)
                e.printStackTrace();
            }

        }
    }
}
