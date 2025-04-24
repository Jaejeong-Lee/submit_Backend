package main.lecture.exception.section02.exception;

/*
 * 사용자 정의 예외 클래스
 *
 * 사전에 정의된 예외클래스 외에 개발자가 원하는 명칭의
 * 예외 클래스를 만들어 작성 가능하다.
 */
public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException() {
    }

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
