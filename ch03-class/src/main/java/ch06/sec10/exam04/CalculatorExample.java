package ch06.sec10.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        double pi = Calculator.PI;

        System.out.println(pi);

        Calculator cal1 = new Calculator();
        cal1.z= 10;
        System.out.println(cal1.z);
        cal1.PI= 15; // final 사용한 후에는 컴파일 에러가 남.

        Calculator cal2 = new Calculator();
        cal2.z= 20;
        System.out.println(cal1.z);

        System.out.println("cal2.PI: "+ cal2.PI); // 15.0
        // static이어도 다른 객체들(cal1)이 공유해서 PI 공간을 사용하기 때문


        // 인스턴스를 만들지 않아도 클래스이름."" 으로 참조할 수 있음.
        System.out.println(cal1.plus((int)pi,5));
    }

}
