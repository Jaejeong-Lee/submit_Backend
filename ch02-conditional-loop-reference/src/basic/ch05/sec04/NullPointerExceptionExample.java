package basic.ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
//        intArray[0] = 10;
        // intArray라는 배열에는 아무 값도 없어서
        // 0번째 인덱스도 있을 수 없음.
        // 따라서 intArray[0] 자체가 존재하지 않음.(주소값도 없음)

        String str  = null;
//        System.out.println("총 문자 수: " + str.length());
        // 문자열 str의 주소값이 없음.
        // str에는 값이 없으므로 길이를 출력할 수 없어 컴파일 오류 발생.
    }
}
