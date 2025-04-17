package basic.ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바학습,참조 타입 String을 학습합니다.,홍길동";

        String[] arr = board.split(",");

        for (int i = 0; i< arr.length ; i++){
            if (i == 0) {
                System.out.print("번호: ");
            } else if (i == 1) {
                System.out.print("제목: ");
            } else if (i == 2) {
                System.out.print("내용: ");
            } else if (i == 3) {
                System.out.print("성명: ");
            }
            System.out.println(arr[i]);
        }
        System.out.println();
        for (int i = 0; i< arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
