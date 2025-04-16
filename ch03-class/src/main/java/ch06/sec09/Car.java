package ch06.sec09;

public class Car {
    //필드 선언
    String model;
    int speed;

    //생성자 선언
    public Car(String model){
        this.model = model;
    }

    //메소드 선언
    public void run() {
        System.out.println(model+"가 달립니다.(시속:"+speed+"km/h)");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
