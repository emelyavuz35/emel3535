package day02_BasıcPractıce;

import java.util.Scanner;

public class Q09_StrıngManıpulatıon {

    public static void main(String[] args) {

        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cumle olusturma ıcın bır kelıme gırınız");

        String kelime1= scan.next();
        System.out.println("Lutfen cumle olusturma ıcın bır kelıme gırınız");

        String kelime2=scan.next();
        System.out.println("Lutfen cumle olusturma ıcın bır kelıme gırınız");

        String kelime3=scan.next();
        System.out.println("Lutfen cumle olusturma ıcın bır kelıme gırınız");

        String kelime4=scan.next();
        System.out.println("Lutfen cumle olusturma ıcın bır kelıme gırınız");


        System.out.println(kelime1.substring(0,1).toUpperCase()+
                           kelime1.substring(1)+" "+
                            kelime2+ " "+ kelime3+" "+
                           kelime4+" ." );
    }
}
