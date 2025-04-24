package basic.ch14.sec03.syncronization;

public class SafeAccount {

    // 공유자원 : 여러 스레드가 동시에 접근할 수 있는 데이터(공통으로 사용하는 자원)
    private int balance = 10000;

    public synchronized void withdraw(int money){
        /*
        * synchronized
        * -> 한번에 하나의 스레드만 특정 코드영역에 들어올 수 있도록 막아주는 키워드
        * -> 락(lock)으로 보호
        */

        // 임계영역 : 공유자원을 공통으로 건드릴 수 있는 영역
        // - 반드시 한번에 한 스레드만 실행되어야 데이터 꼬임을 방지
        if(balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}

            balance -= money;
        }
    }

    public int getBalance() {
        return balance;
    }
}
