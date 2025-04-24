package main.lecture.exception.section01;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws Exception {
        System.out.println("현재 가지고 있는 돈은 : "+ money + "원 입니다.");

        if (money >= price){
            System.out.println("상품을 구입하기 위한 금액이 충분합니다!");
        } else {
            /*
             * throw
             * 강제로 예외 발생시키기
             * 메소드 헤드에 throws 구문을 추가하여 메소드를 호출한 곳에서
             * 예외에 대한 책임을 위임(= 해당 예외에 대한 처리를 강제화)
             */
            throw new Exception();

        }
        System.out.println("즐거운 쇼핑 하세요~~");
    }
}
