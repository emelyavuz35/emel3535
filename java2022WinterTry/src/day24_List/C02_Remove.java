package day24_List;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Emel");
        isimler.add("Celal");
        System.out.println(isimler);

        isimler.remove("Aykut");//true
        System.out.println(isimler);

        //remove istene object methodu istenen elementı kaldırıp
        //bıze true false doner
        //eger remove ıslemının yapıldıgını kontrol etmek istiyorsanız
        //methodu boolean bır varıable atayabılırsınız

        boolean sonuc=isimler.remove("aykut");//true

        if (sonuc==true){
            System.out.println("istediğiniz  isism silindi");

        }else{
            System.out.println("istediğiniz isism listede olmadıgından sılınemedı");
        }

        System.out.println(isimler);
        //remove (ındex)yazdıgımızda sıldım/ sılmedım ıhtımalı kalmaz
        //bıze remove edılen elementı doner
        System.out.println(isimler.remove(1));//yusufu sılerve delıl olarak yusuf ısmını dondurur
        //yazdırsak ta yazdırmasak ta iıste degıstı ve 1.ındex tekı element sılındı
        System.out.println(isimler);
        //aykut ve yusuf


    }
}
