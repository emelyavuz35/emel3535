package day32_dateTime;

import java.time.LocalDateTime;

public class C03_LocalTımeDate {
    public static void main(String[] args) {

        LocalDateTime tarihsaat=LocalDateTime.now();
        System.out.println(tarihsaat);//2022-03-31T22:36:02.983662300

        tarihsaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5);
        System.out.println(tarihsaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5));//
    }
}
