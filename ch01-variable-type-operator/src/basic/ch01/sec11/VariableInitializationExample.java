package basic.ch01.sec11;

public class VariableInitializationExample {
    public static void main(String[] args) {
//        int value; // value
        int value = 0; // 이런 식으로 해야 오류 안 남.
        int result = value + 10;// 오류
        System.out.println(result);
    }
}
