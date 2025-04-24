package main.lecture.exception.section02.exception;

public class MoneyNegativeException extends Exception {
    public MoneyNegativeException(){

    }
    public MoneyNegativeException(String message){
        super(message);
    }

}
