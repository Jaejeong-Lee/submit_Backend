package basic.ch14.sec03.syncronization;

public class Example {
    public static void main(String[] args) {
//        Account account = new Account();
        SafeAccount account = new SafeAccount(); // synchronized 한 계좌
        // => 동시성 문제 해결
        // but, DeadLock 문제 발생 우려
        // : 2개 이상의 공유 자원이 서로 lock해서 무한 lock 걸리는 문제

        // 두 스레드가 동시에 출금 시도
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.withdraw(1000);
                System.out.println("Thread 1 출금 후 잔액 : " + account.getBalance());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.withdraw(1000);
                System.out.println("Thread 2 출금 후 잔액 : " + account.getBalance());
            }
        });

        t1.start(); //9000원
        t2.start(); //9000원

    }
}
