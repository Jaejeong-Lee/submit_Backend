package ch06.sec06.exam01;

public class Car {
    // 필드 선언

    //    1.의 답안) 각 멤버 변수 우측 주석에 작성함.
    String model; // null
    boolean start; // false
    int speed; // 0

    String color; // null

    // 선언자
    public Car(){
    }

    public Car(String model, String color, int speed){
        this.model = model;
        this.color = color;
        this.speed = speed;

    }

    // 메소드

}
