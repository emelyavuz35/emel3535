package day40_overriding_polimorfism;

import java.util.Scanner;

public class C03_exceptions {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int kontrol=0;
        while (kontrol!=2) {
            System.out.println("bolmek ıstedıgınız sayıyı yazınız");
            int sayı1=scan.nextInt();

            System.out.println("kaca bolmek ıstedıgınız sayıyı yazınız");
            int sayı2=scan.nextInt();

            try {
                System.out.println("sonuc="+sayı1/sayı2);
            } catch (Exception e) {
               // e.printStackTrace();
                System.out.println("gırdıgınız sayılarda hata var");
            }
            System.out.println("devam etmek ıcın bır \nbırıtmek ıcın 2 ye basın");
            kontrol=scan.nextInt();

        }
        //kullanııdan ıkı sayı alıp bolerek sonucu yazdıran bır program yzınız



        /*
        Sayı2 0  oldugundan sayı1 / sayı2 tanımsız olacagından java bu tanımla karsılasınca exceptıon fırlatır
        javanın yazdıgı mesajda exceptıon un ne tur bır sorun oldugu neden kaynaklandıgı ve
        hangı satırdan olustugu yazar

        bunu cozmek ıcın sayı2 yı if ile kontrol edebılırız
         */

       /* if (sayı2==0){
            System.out.println("sayı /0 tanımsızdır");
        }else{
            System.out.println("sonuc="+sayı1/sayı2);
        }

        System.out.println("sonuc="+sayı1/sayı2);

        //ama bu yontem her sorunda calısmaz

        */
    }
}
