package lecture.date;

import java.time.*;

public class Application2 {
    public static void main(String[] args) {
        /*
        * time 패키지
        * -> Date, Calendar가 가진 단점을 해소하기 위해 만들어짐
        *
        * LocalTime
        * 시간을 표현하는 클래스
        * - 시,분,초,나노초
        * - 날짜 정보를 포함하지 않는다.
        * - 14:30:15.123
        * */
        LocalTime timeNow = LocalTime.now();
        System.out.println("timeNow = " + timeNow);
        LocalTime timeOf = LocalTime.of(15,25,1);
        System.out.println("timeOf = " + timeOf);

        /*
         * LocalDate
         * 날짜를 표현하는 클래스
         * - 연도, 월, 일
         * - 시간 정보를 포함하지 않는다.
         * - 2024-05-29
         * */
        LocalDate dateNow = LocalDate.now();
        System.out.println("dateNow = " + dateNow);
        LocalDate dateOf = LocalDate.of(2024,3, 27);
        System.out.println("dateOf = " + dateOf);

        /*
         * ZoneDateTime
         * 날짜와 시간, 시간대를 함께 표현하는 클래스
         * - 연도, 월, 일, 시, 분, 초, 나노초, 시간대
         * - 시간대 : Asia/Seoul, America/New_York
         * - 2024-05-29T14:30:15.123+02:00[Asia/Seoul]
         * */
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);
        ZonedDateTime zonedDateTImeOf = ZonedDateTime.of(dateOf, timeOf, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTImeOf = " + zonedDateTImeOf);

        /* ***
         * LocalDateTime
         * 날짜와 시간을 함께 표현하는 클래스
         * - 연도, 월, 일, 시, 분, 초, 나노초
         * 2024-05-29T14:30:15.123
         * */
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("dateTimeNow = " + dateTimeNow);
        LocalDateTime dateTimeOf = LocalDateTime.of(2024,5,9,9,30,15,123000000);
        System.out.println("dateTimeOf = " + dateTimeOf);

    }
}
