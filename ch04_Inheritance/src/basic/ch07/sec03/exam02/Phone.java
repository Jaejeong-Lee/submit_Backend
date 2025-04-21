package basic.ch07.sec03.exam02;

public class Phone {
    public String model;
    public String color;

    public Phone(){
    }

    public Phone(String model, String color){
        this.model = model;
        this.color = color;
        System.out.println("Phone(String model, String color)생성자 실행");
    }

    public void printModel() {
        System.out.println("부모(Phone)에서 호출됨.. model = "+ model);
    }
}
