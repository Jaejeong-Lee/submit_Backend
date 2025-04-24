package main.lecture.exception.section01;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) throws Exception {

        ExceptionTest et = new ExceptionTest();
        Scanner sc = new Scanner(System.in);

        System.out.print("물건의 가격을 입력해주세요 : ");
        int price = sc.nextInt();
        System.out.println();

        System.out.print("소지한 돈을 입력해주세요 : ");
        int money = sc.nextInt();
        System.out.println();



        /*
        예외 처리 방법
        -> try-catch 처리
         */
        try {
            // price > money 여서 예외 발생.(일부러 발생시킴)
            et.checkEnoughMoney(price,money);
            System.out.println("====================상품 구입 가능========================");
        } catch (Exception e) {
            System.out.println("====================상품 구입 불가능========================");

            // 예외 처리 구문과 상관없이 반드시 수행해야하는 경우 작성
            // 일반적으로 자원 반납 시 많이 사용함.
        } finally {
            sc.close();
        }

        System.out.println("프로그램 종료!");

    }
}
