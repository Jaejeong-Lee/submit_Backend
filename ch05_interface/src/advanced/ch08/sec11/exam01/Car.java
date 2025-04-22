package advanced.ch08.sec11.exam01;

public class Car {
    Tire tire1;
    Tire tire2;

    // void 사용하면 안됨!
    // 생성자는 반환타입이 없어야 함!!
    public Car(){
        this.tire1 = new HankookTire();
        this.tire2 = new HankookTire();
    }

    public void run() {
        this.tire1.roll();
        this.tire2.roll();
    }
}
