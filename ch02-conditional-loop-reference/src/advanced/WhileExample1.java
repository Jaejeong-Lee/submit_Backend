package advanced;

import java.util.Scanner;

public class WhileExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = 0;
        int input, out;
        while (true) {
            System.out.println("--------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("--------------------------");
            System.out.print("선택>");
            int answer = sc.nextInt();
            if (answer == 1){
                System.out.print("예금액>");
                input = sc.nextInt();
                amount += input;
            } else if (answer == 2) {
                System.out.print("출금액>");
                out = sc.nextInt();
                amount -= out;
            } else if (answer == 3) {
                System.out.print("잔고>");
                System.out.println(amount);
            } else {
                System.out.println();
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
