package ch06.sec10.exam04;

public class Calculator {

    // 정적 필드 (static)
    static double PI = 3.141592;
//    static final double PI = 3.141592;

    int z;

//    @Override
//    public String toString() {
//        return "Calculator{" +
//                "z=" + z +
//                '}';
//    }

    // 정적 메소드
    public static int plus(int x, int y) {

        return x + y;
    }
}
