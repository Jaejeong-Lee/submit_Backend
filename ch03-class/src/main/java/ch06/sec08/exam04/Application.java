package ch06.sec08.exam04;

public class Application {

//    public int plus (int x, int y){
    public static int plus (int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        // static 이므로 맨 먼저 메모리에 올림.
        // 위에 Application이 없어도 먼저!

        int a = plus(1,2);
        // 컴파일 에러 이유
        // : 위에 plus 함수보다 main이 static이기 때문에 인식 안 되기 떄문.
    }
}
