package day12_StrıngManıpulatıon;

import javax.print.DocFlavor;
import javax.swing.*;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //      - Girilen kelime cumlede kullanilmamis.
        //      - Girilen kelime cumlede 1 kere kullanilmis.
        //      - Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle="Java ogren , yenı bır program ıle yenı bır sayfa ac";
        String kelıme="yenı";

        int ilkkullanım=cumle.indexOf(kelıme);//java nın tek ındex ı vardır.sondan bastan farketmez
        int sonkullanım=cumle.lastIndexOf(kelıme);

        if (ilkkullanım==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamis");
        }else if (ilkkullanım==sonkullanım){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");

        }else
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis");


        String str="Eclıpse";
        System.out.println(str.lastIndexOf("p",4));// 4 dahıl

    }






    }

