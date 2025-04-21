package basic.ch07.sec07.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        /*
        * 다형성
        * - 하나의 인스턴스가 여러가지 타입을 가질 수 있는 것을 의미
        * - 하나의 타입으로 여러 타입의 인스턴스를 처리 할 수 있게도 하고,
        * - 하나의 메소드 호출로 각기 다른 방법으로 동작하게 할 수 있다.
         */

        /*
        현재 구조
            A
           / \
          B   C
         /     \
        D       E

        * */
        A a = new A();
        B b = new B(); // A 상속받음
        C c = new C(); // A
        D d = new D(); // A - B
        E e = new E(); // A - C

        // 업캐스팅
        // '자식 -> 부모'로 대입 시, 자동 타입 형변환이 발생
        // (안전해서 자바에서 자동으로 해줌)
        A a1 = b;
        // A a1 = new B(); 가능!
        A a2 = c;
        A a3 = d;
        A a4 = e;
        B b1 = d;
        C c1 = e;
        // C c1 = new E(); 여기까지는 다 이런 것 가능


        /*
        현재 구조
            A
           / \
          B   C
         /     \
        D       E
        * */

        // E는 C의 자식 -> B와 관계 X
        // B b3 = e;

        // 데이터의 안전은 보장X
        // 타입 변환은 가능.
        A a6 = new E();
        B b3 = (B) a6;

        // D는 B의 자식 -> C와 관계 X
        // C c2 = d;

        /* 오류인 이유
        * - 중간 단계가 없어서 형변환이 안 됨.
         */


        // 다운 캐스팅
        // 부모 -> 자식 (강제 형변환)
        // 잘 쓰진 않음. 가능은 함.
        B b6 = (B)a;

        Object o = new B(); // 이것도 가능
    }
}
