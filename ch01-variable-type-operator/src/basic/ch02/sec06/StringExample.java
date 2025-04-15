package basic.ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        // 이스케이프문; // 역슬래시(\)하고 넣고 싶은 거 넣으면 됨.

        String name = "홍길동";
        String job = "프로그래머";

        String str = "나는 \"자바\"를 배웁니다."; // \" : 큰따옴표 삽입
        System.out.println("str = " + str);

        str = "번호 \t 이름 \t 직업"; // \t : 탭 삽입
        System.out.println("str = " + str);

        str = "나는 \n자바를 \n배웁니다."; // \n : 줄바꿈
        System.out.println("str = " + str);
    }
}
