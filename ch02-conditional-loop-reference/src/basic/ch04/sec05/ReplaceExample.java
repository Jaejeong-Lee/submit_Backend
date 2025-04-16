package basic.ch04.sec05;

public class ReplaceExample {
    public static void main(String[] args) {
        /*
        replace()
        target과 replacement라는 인자를 받아 target을 replacement에 해당하는 값으로 변경
         */
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
        String newStr = oldStr.replace( "자바","JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
