package ch06.sec08.exam01;

public class Calculator {
    // 필드 선언
    boolean onOff;
    int x;
    int y;

    //생성자
    public Calculator(){
    }

    // 메소드
    public void powerOn(){
        this.onOff = true;
        System.out.println("전원을 켭니다.");
    }
    public void powerOff(){
        this.onOff = false;
        System.out.println("전원을 끕니다.");
    }
    public int plus(int x, int y){
        int plusResult =  x + y;
        return plusResult;
    }

    public double divide(int x, int y){
        double divideResult = (double)x/y;
        return divideResult;
    }
}
