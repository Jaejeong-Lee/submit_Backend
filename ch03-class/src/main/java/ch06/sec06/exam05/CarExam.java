package ch06.sec06.exam05;

public class CarExam {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        car2.model = "자가용";

        car3.model = "자가용";
        car3.color = "빨강";

        car4.model = "택시";
        car4.color = "검정";
        car4.maxSpeed = 200;

        // 출력
        System.out.println("car1.company : "+ car1.company);
        System.out.println();

        System.out.println("car2.company : "+ car2.company);
        System.out.println("car2.company : "+ car2.model);
        System.out.println();

        System.out.println("car3.company : "+ car3.company);
        System.out.println("car3.company : "+ car3.model);
        System.out.println("car3.company : "+ car3.color);
        System.out.println();

        System.out.println("car4.company : "+ car4.company);
        System.out.println("car4.company : "+ car4.model);
        System.out.println("car4.company : "+ car4.color);
        System.out.println("car4.company : "+ car4.maxSpeed);

    }
}
