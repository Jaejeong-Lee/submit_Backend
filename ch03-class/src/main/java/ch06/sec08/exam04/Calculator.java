package ch06.sec08.exam04;

public class Calculator {
    // 필드 선언
    int x;
    int y;

    // 생성자 선언
    public Calculator () {
    }
    // 메소드 선언
    public double areaRectangle(int x){
        double result = (double) x*x;
        return result;
    }
    public double areaRectangle(int x, int y){
        double result = (double) x*y;
        return result;
    }
}
