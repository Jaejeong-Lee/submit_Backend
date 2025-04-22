package basic.ch07.sec10;

public class Application {
    public static void main(String[] args) {
        /*
        추상 클래스
        - 추상메소드를 0개 이상 포함하는 클래스
        - abstract 키워드를 사용해서 선언
        - 직접 인스턴스를 생성 불가 (new로 객체 생성 불가)
        - 하위 클래스가 상속받아 구현해야 사용 가능
        -> 다형성을 활용할 수 있다.

        추상 메서드
        - 메서드 선언부만 있고 구현부는 없는 메소드
        - 반드시 abstract 키워드를 붙여야 함
        - ex) public abstract void method();
        -> ★ 하위(자식) 클래스는 반드시 오버라이딩 해야 한다.
         */

//        Product product = new Product(); // 추상 클래스는 인스턴스 생성 불가
//        사용 목적 : 상위 클래스를 사용하기 위해서, 이런 형태로 명시하기 위해서

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.abstMethod();
        // 현재 보유 타입 : SmartPhone, Product 2개

        // instanceof
        // : 특정 클래스나 인터페이스의 인스턴스인지 여부를 검사하는데 사용되는 연산자
        System.out.println(smartPhone instanceof SmartPhone); // true
        System.out.println(smartPhone instanceof Product); // true

        Product product = new SmartPhone();

        // 동적 바인딩
        product.abstMethod();

        Product.StaticMethod(); // static 함수는 앞에 클래스명 붙여줘야 함.

        product.nonStaticMethod();

    }
}
