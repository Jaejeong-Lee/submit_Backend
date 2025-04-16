package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car newCar = new Car("Bentz");
        int nowSpeed = 0;

        newCar.setSpeed(100);
        nowSpeed = newCar.getSpeed();
        System.out.println("newCar.getSpeed = "+ nowSpeed);

        newCar.run();
    }
}
