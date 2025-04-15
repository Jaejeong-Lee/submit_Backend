package advanced.ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // stack / heap / static
        // sc : stack 영역에 공간.
        // new : heap 에 공간을 만드는 연산자라고 생각하기.
        // -> heap 의 주솟값을 sc에 넣어주게 됨.
        // sc.~~~~() 이런 식으로 사용.

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("x값 입력 : ");
            String str = sc.nextLine();

            if (str.equals("q")) {
                break;
            }
            System.out.println("입력값 = " + str);
        }
        // 스캐너 닫기
        System.out.println("종료");
        sc.close();
    }


}
