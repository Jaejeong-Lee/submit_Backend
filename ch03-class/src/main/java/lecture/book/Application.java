package lecture.book;

public class Application {
    public static void main(String[] args) {
        Book myBook = new Book();
        // heap에 공간 만들어줌

        myBook.title = "해리포터와 마법사의 돌";
        myBook.author = "조앤 K 롤링";
        myBook.coverType = "하드커버";
        myBook.pageCount = 320;

        // 제목을 해리포터와 혼혈왕자
        Book myBook2 = new Book();

        myBook2.title = "해리포터와 혼혈왕자";
        myBook2.author = "조앤 K 롤링";
        myBook2.coverType = "소프트커버";
        myBook2.pageCount = 320;

        //호출
        myBook.getTitle();
        myBook2.getTitle();

        System.out.println(myBook2.toString());
        
        // String author, String title, int pageCount, String coverType
        // 이 순서로 매개변수 넣어줘야 함.
        Book myBook3 = new Book("bear","자바가 좋아요",50,"하드타입");
        System.out.println(myBook3.getTitle());

        Book myBook4 = new Book("bear","자바가 좋아요");
        System.out.println(myBook4.getTitle());

    }
}
