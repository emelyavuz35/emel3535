package day07_Ifelsestatement;

import java.util.Scanner;

public class C07_HaftanınGunlerıIfElseif {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // eger kullanici gun ismini yanlis girerse "Yanlis giris" yazdirin
        //  Ornek:      gun=Pazar output = “Hafta sonu”
        //      gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin
        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ısmı gırınız");
        String gunismi=scan.next().toUpperCase();

        if (gunismi.equals("pazar")||gunismi.equals("cumartesi")){

            System.out.println("Gırılen gun hafta sonudur");


        }else if (gunismi.equals("pazartesi")||gunismi.equals("salı")||gunismi.equals("carsamba")||
                gunismi.equals("persembe")|| gunismi.equals("cuma")){

            System.out.println("Gırılen gun hafta ıcıdır");

        }else {
            System.out.println("Lutfen gecerlı bır gun gırınız");

        }
        //eger if else if stetementte else ıle bılıtyorsa olasılıklardan sadece bır tanesı mutlaka calısır
        //java ılk buldugu true ya aıt sonucu yazdırır ve kalan sartlara bakmaz
        //if else if cumlelerı elsse ıle bıtmesede calısır ancak bu durumda sedece
        // bır olasılık calısabılır veya hıcbır ıslem yapılmayabılır


    }
}
