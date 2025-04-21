package basic.ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        // Tire 타입의 tire 속성이 정의 되지 않음.

//        Tire tire = new Tire();
        Tire tire = new HankookTire(); //다형성 - 업캐스팅
        // ※ 다형성 -> 확장성을 갖게 됨.
        // 일일이 타이어 종류마다 정의했어야 했는데 안 해도 됨.
        myCar.tire = tire;
        myCar.run();


        Tire tire2 = new KumhoTire();
        myCar.tire = tire;
        myCar.run();

    }
}
