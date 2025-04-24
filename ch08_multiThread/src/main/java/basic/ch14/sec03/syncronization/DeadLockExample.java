package basic.ch14.sec03.syncronization;

// but, DeadLock 문제 발생 우려
// : 2개 이상의 공유 자원이 서로 lock해서 무한 lock 걸리는 문제
// 예시) 형 윗도리 먼저, 동생 바지 먼저 입음
// -> 서로 입고 바지/윗도리 무한 대기 상태됨.
// => DeadLock 상태

public class DeadLockExample {
    static final Object 윗도리 = new Object(); // 공유 자원 A
    static final Object 바지 = new Object(); // 공유 자원 B

    public static void main(String[] args) {

        // 스레드 1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (윗도리) {
                    System.out.println("형 : 윗도리는 입었고 바지만 입고 나가보자");
                    try { Thread.sleep(100);
                    } catch (InterruptedException e) {}

                    System.out.println("형 : 바지 찾으러 가는 중....");

                    synchronized (바지) {
                        System.out.println("형 : 옷 다입었다! 이제 나가보자구");
                    }
                }
            }
        });

        // 스레드 2
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //
                synchronized (바지) {
                    System.out.println("동생 : 이제 바지는 입었고 윗도리좀 입어볼까");
                        try { Thread.sleep(100);
                        } catch (InterruptedException e) {}
                    System.out.println("동생 : 윗도리 찾으러 가는 중 ...");

                    synchronized (윗도리) {
                        System.out.println("동생 : 옷 다입었다! 이제 나가보자구");
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}