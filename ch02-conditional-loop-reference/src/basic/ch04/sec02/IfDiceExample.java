package basic.ch04.sec02;

import java.util.Random;

public class IfDiceExample {
    public static void main(String[] args) {
        // 1 ~ 6 사이의 값을 랜덤
        // Math.random : 0.0 ~ 1.0 미만 난수 반환 (double 형태)

        int num = (int)(Math.random()*6) + 1 ;

        Random rand = new Random();
        // 0~ 인자로 준 값(bound) 미만 난수 반환 +1
        num = rand.nextInt(6) +1;

        if (num == 1) {
            System.out.println("1이 나왔습니다.");
        } else if (num == 2) {
            System.out.println("2가 나왔습니다.");
        } else if (num == 3) {
            System.out.println("3이 나왔습니다.");
        } else if (num == 4) {
            System.out.println("4가 나왔습니다.");
        } else if (num == 5) {
            System.out.println("5가 나왔습니다.");
        } else {
            System.out.println("6이 나왔습니다.");
        }
    }
}
