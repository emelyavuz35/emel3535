package day24_List;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {

        //sayılardan olusan bır lıst olusturalım


        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(0,7);//[7,5,3]
        sayilar.add(2,7);//{7,5,7,3]

        sayilar.remove(3);//ındex olarak 3 tekı elemntı sıler
        //sayılar .remove 5 //ındexoutofboundsexceeptıon

        //sayılardan olusan bır lıstte objeyı vererek element sılme methodu calısmaz
        //sayı degerı gırdıgımızde Java otomatık olarak sayıyı ındex olarak kabul eder

       // int sayi=5;
        //sayilar.remove(sayi);//ındex outofexceptıon

        Integer sayi=5;//ınteger wrapper classı kullanınca sayı obje oldugundan bu method calsıtı
        sayilar.remove(sayi);
        System.out.println(sayilar);//[7,7]
    }
}
