package lecture.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application3 {
    public static void main(String[] args) {
        // 문자열을 ISO 기본 포맷(HH:mm:ss)으로 LocalTime 객체로 파싱
        String timeNow = "14:05:10";
        LocalTime localTime = LocalTime.parse(timeNow);

        // 문자열을 ISO 기본 포맷(yyyy-MM-dd)으로 LocalDate 객체로 파싱
        String dateNow = "2022-10-12";
        LocalDate localDate = LocalDate.parse(dateNow);

        // ISO_LOCAL_DATE와 ISO_LOCAL_TIME 조합으로 LocalDateTime 생성
        LocalDateTime localDateTime = LocalDateTime.parse(dateNow + "T" + timeNow);

        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);

        // 포맷이 "HH-mm-ss" 형태인 문자열을 LocalTime으로 파싱
        String timeNow2 = "14-05-10";
        LocalTime localTime2 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));

        // 포맷이 "yyMMdd" 형태인 문자열을 LocalDate로 파싱
        String dateNow2 = "221005";
        LocalDate localDate2 = LocalDate.parse(dateNow2, DateTimeFormatter.ofPattern("yyMMdd"));

        System.out.println(localTime2);
        System.out.println(localDate2);

        // LocalDate 객체를 "yyyy-MM-dd" 포맷의 문자열로 변환
        String dateFormat = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // LocalTime 객체를 "HH mm" 포맷의 문자열로 변환
        String timeFormat = localTime.format(DateTimeFormatter.ofPattern("HH mm"));

        System.out.println(dateFormat);
        System.out.println(timeFormat);
    }
}
