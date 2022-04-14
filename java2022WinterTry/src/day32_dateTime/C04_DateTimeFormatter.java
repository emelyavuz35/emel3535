package day32_dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime  tarihsaat=LocalDateTime.now();
        System.out.println(tarihsaat);//2022.03.31T21.39.32.70458800

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/M/YYYY");
        System.out.println(formatter.format(tarihsaat));//31/3/2022
        DateTimeFormatter formatterSaat=DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(formatterSaat.format(tarihsaat));//21:52

       /* format olustururken
        GUN
        d : basta 0 varsa onu yazmadan gun numarasi
        dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
        DDD : yilin kacinci gunu oldugunu yazar
        E, EE, EEE : gun isminin ilk 3 harfi
        EEEE : gun isminin tamamini

        AY (Ay icin M, dakika icin m kullanilir)
        M : basta 0 varsa onu yazmadan ay numarasi
        MM:dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
        MMM : Ay isminin ilk 3 harfi
        MMMM : Ay isminin tamami

        YY : yilin son iki rakamini
        YYYY : Yilin tamamini


        Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

        HH : saatin tamami, tek rakamli saat olursa 02 gibi
        H  : tek rakamli saat olursa sadece saati
        h:12 saat dılımıne gore ıkı rakam olarak saatı yazdırır
        hh:12 saat dılımıne gore tek rakam olanları tek yazdırır
        m:minute tek rakamları tek
        mm:tek rakamları 08 gıbı

        a yazarsak AM veya PM degerini yazar


                */

    }
}
