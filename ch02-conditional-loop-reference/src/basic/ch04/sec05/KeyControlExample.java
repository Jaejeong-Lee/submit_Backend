package basic.ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int response = 0;
        int speed = 0;
        while (true) {
            System.out.println("-------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("-------------------------");
            System.out.print("선택: ");
            response = sc.nextInt();
            if (response == 1) {
                speed += 1;
            } else if (response == 2) {
                speed -=1;
            } else if (response == 3){
                System.out.println("프로그램 종료1");
                break;
            }
            System.out.println("현재 속도 = "+speed);
        }


    }
}
