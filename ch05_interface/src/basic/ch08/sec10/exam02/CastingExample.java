package basic.ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
//        vehicle.checkFare();
        // vehicle 인터페이스에서는 구현체를 Bus로 해도
        // checkFare()가 없으므로, 잘못되었다.

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
