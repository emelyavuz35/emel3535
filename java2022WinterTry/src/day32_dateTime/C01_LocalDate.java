package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {


        LocalDate trh=LocalDate.now();//objenın olusturuldugu tarıhı trh ye assıgn eder
        LocalDate baskatrh=LocalDate.of(1982,6,17);
        //istedıgımız gun ay yıl degerlerıne gore obje olusturur

        System.out.println(trh);//2022-03-31
        //get lı methodlarla tarıh ıle ılgılı detay bılgılerı alabılırız
        System.out.println(trh.getDayOfMonth());//31
        System.out.println(trh.getDayOfWeek());//thursday
        System.out.println(trh.getMonthValue());//3
        System.out.println(trh.getYear());//2022
        //bır tarıhte ıstedıgımız kadar  ılerı v egerı gıdebılırız

        System.out.println(trh.minusWeeks(20));//
        System.out.println(trh.plusMonths(9).plusDays(10));

        //istedıgımız ulkenın o andakı tarıhını elde etmek ıstersek

        LocalDate trhZone=LocalDate.now(ZoneId.of("Japan"));//2022-4-1

        //is ıle baaslayan methodlar boolean sonuslar doner
        System.out.println(LocalDate.now().isLeapYear());//false

        System.out.println(trh.isAfter(baskatrh));//true




    }
}
