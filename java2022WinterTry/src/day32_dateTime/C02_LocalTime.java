package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime tm = LocalTime.now();
        System.out.println(tm);//21:10:01.017511

        //bır ıslemın ne kadar surede bıttıgını bulmak ıstersek ıslemden once ve sonra
        // bırer tıme objesı olusturup aradakı farkı hesplayabılırız

        int sayı = 0;
        for (int i = 0; i < 100000; i++) {
            sayı += i;
        }
        LocalTime tmLoopSonrası = LocalTime.now();
        System.out.println(tm);//21:14:01.922778800
        double nano1=tm.getNano();
        double nano2=tmLoopSonrası.getNano();
        System.out.println("islem "+(nano2-nano1)+"nano sanıyede bıttı");

        //ilerı veya geri gidebılırız
        System.out.println(tm.plusMinutes(1000));//13:59:49,227878

        //istrsek zone ıd kullanarak ıstedıgımınz bolgenın saatı ıcınde obje olusturabılırız
    }
}
