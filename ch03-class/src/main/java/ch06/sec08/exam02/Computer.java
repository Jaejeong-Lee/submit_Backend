package ch06.sec08.exam02;

public class Computer {
    //필드 선언
    int num1;
    int num2;
    int num3;
    int num4;
    int num5;

    //생성자 선언
    public Computer() {
    }

    //메소드 선언
    public int sum(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }


    public int sum( int num1, int num2, int num3, int num4, int num5) {
        int result = num1 + num2 + num3 + num4 + num5;
        return result;
    }

    public int sum(int [] numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        return result;
    }
}