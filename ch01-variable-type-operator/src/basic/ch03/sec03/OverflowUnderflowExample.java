package basic.ch03.sec03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        // Overflow
        // 자료형 별 값의 최대 범위를 벗어나는 경우
        // 발생한 carry(넘치는 값)을 버림처리하고 sign bit를 반전시킴
        // (sign bit : +/- 말하는 것 -> +였으면 -가 됨)
        byte var1=125;
        for(int i=0;i<5;i++){//{}를5번반복실행
            var1++;//++연산은var1의값을1증가시킨다.
            System.out.println("var1:"+var1);
        }
        System.out.println("-----------------------");
        byte var2=-125;
        for(int i=0;i<5;i++){//{}를5번반복실행
            var2--;//--연산은var2의값을1감소시킨다.
            System.out.println("var2:"+var2);
        }
    }
}
