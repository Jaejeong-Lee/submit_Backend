package basic.ch02.sec08;

public class CastingExample {
    public static void main(String[] args) {
        /*
        * 데이터 형변환
        * -> 자바에서는 같은 데이터 타입끼리만 연산을 할 수 있다.
        *
        * 형변환의 종류와 규칙
        *   1. 자동형변환 (묵시적 형변환) : 컴파일러가 자동으로 수행해주는 타입 변환
        *    작은 자료형에서 큰 자료형으로는 자동 형변환 된다.
        *    정수는 실수로 자동 형변환 된다.
        *    문자형은 int형으로 자동 형변환 된다.
        *    논리형은 형변환 규칙에서 제외된다.
        *   2. 강제형변환 (명시적 형변환) : 형변환(cast) 연산자를 이용한 강제적으로 수행하는 형변환
        *    2-1. 자동형변환이 적용되지 않는 경우 강제 형변환이 필요하다.
        *
        * */

        int var1 = 10;
        byte var2 = (byte) var1;
        System.out.println(var2);

        long var3 = 300;
        int var4 = (int) var3;
        System.out.println(var4);
        
        // 문자형 : 유니코드 문자 저장 타입
        // 유니코드 : 
        // 전 세계의 문자를 컴퓨터가 처리할 수 있도록
        // 각 문자에 고유한 숫자(코드값)을 매핑해놓은 국제 표준 인코딩 체계
        int var5 = 65;
        char var6 = (char) var5;
        System.out.println(var6);

        double var7 = 3.14;
        int var8 = (int) var7; // 3.14에서 소숫점 밑 데이터 사라짐.
        System.out.println(var8);
    }
}
