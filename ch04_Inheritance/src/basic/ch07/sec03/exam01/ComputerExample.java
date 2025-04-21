package basic.ch07.sec03.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Computer com = new Computer();

        System.out.println("Calculator 결과 : " + cal.areaCircle(3));
        System.out.println("Computer 결과 : " + com.areaCircle(3));

    }
}
