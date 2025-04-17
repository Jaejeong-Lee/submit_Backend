package basic.ch04.sec07;

import java.util.Random;

public class BreakExample {
    public static void main(String[] args) {
        // Random rd = new Random();
        // Random은 너무 범위가 큰 난수 발생하는 듯.

        while (true) {
            double randomNum = (Math.random()*6)+1;
            int result = (int)randomNum;
            if ( result == 6) {
                System.out.println(result);
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println(result);
            }
        }
    }
}
