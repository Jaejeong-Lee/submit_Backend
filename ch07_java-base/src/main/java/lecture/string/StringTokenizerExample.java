package lecture.string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {

        /*
        [문자열을 특정 구분자로 하여 문자열을 반환하는 기능]
        1. split() : 정규표현식을 이용해 문자열을 분리
                     비정형화된 문자열을 분리할 때 좋음(공백 문자열 값 포함)
        2. StringTokenizer : 문자열의 모든 문자들을 구분자로 하여 문자열을 분리
                             정형화된 문자열 패턴을 분리할 때 좋음 (공백 문자열을 무시)
                             split()보다 속도 면에서 빠름
         */

        //사번/이름/주소/부서
        String emp1 = "100,홍길동,서울,영업부"; //모든 값 O
        String emp2 = "200,유관순,,총무부"; // 주소 X
        String emp3 = "300,이순신,경기도,"; // 부서 X

        compareSplitAndTokenizer("emp1",emp1);
//        compareSplitAndTokenizer("emp2",emp2);
//        compareSplitAndTokenizer("emp3",emp3);
    }

    public static void compareSplitAndTokenizer(String label, String data){
        System.out.println("==================================" + label + " 비교 ============================");
        //split() 사용
        String[] splitResult = data.split(",",-1); //빈 문자열도 포함
        System.out.println("[split()] 결과 : "+ Arrays.toString(splitResult));

        //StringTokenizer 사용
        StringTokenizer tokenizer = new StringTokenizer(data,",");
        System.out.println("[StringTokenizer] 결과 :");

        while (tokenizer.hasMoreTokens()){
            System.out.println("token : " + tokenizer.nextToken());
        }

    }
}
