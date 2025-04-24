package main.lecture.exception.section02.exception;

public class PriceNegativeException extends Exception {
    public PriceNegativeException(){

    }
    public PriceNegativeException(String message){
        super(message);
    }

}
