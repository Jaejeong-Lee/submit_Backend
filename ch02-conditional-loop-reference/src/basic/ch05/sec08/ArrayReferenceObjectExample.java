package basic.ch05.sec08;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[]strArray=new String[3];
        strArray[0]="Java";
        strArray[1]="Java";
        strArray[2]=new String("Java");

        System.out.println(strArray[0]==strArray[1]);
        System.out.println(strArray[0]==strArray[2]);
        System.out.println(strArray[0].equals(strArray[2]));
        // 결과 : true ; false; true
        // strArray[2]는 문자열은 같지만 참조 주소값이 다르므로 단순히 == 비교 시엔 false가 나옴
    }
}
