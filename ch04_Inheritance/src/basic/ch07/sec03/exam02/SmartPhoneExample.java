package basic.ch07.sec03.exam02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시","은색");
        /*
        * 상속
        * - 부모가 가지고 있는 재산(멤버)를 자식이 물려받음을 의미
        * - 단순히 물려받는 것보다, 자바에서는 확장의 개념을 의미
        * - 물려받은 것 + a 를 할 수 있기 때문
         */

        System.out.println("myPhone = " + myPhone.color);
        System.out.println("myPhone = " + myPhone.model);
        myPhone.printModel();
    }
}
