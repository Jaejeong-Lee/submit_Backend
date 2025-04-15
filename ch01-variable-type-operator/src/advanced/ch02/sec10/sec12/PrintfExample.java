package advanced.ch02.sec10.sec12;

public class PrintfExample {
    public static void main(String[] args) {
        int value = 123;
        // printf
        // %d : double 실수
        // %.2f : float 소수 2째자리까지 소수
        // %s : String

        System.out.printf("상품의 가격:%d원\n",value);
        System.out.printf("상품의 가격: %d원\n",value);
        System.out.printf("상품의 가격:%d 원\n",value);
        System.out.printf("상품의 가격:000%d원\n",value);

        double area = 3.14159 *10 *10;
        System.out.printf("반지름이 %d인 원의 넓이: %.2f",10,area);
        System.out.println();

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%d|%s|%s\n",1,name,job);

    }
}
