package day02_BasıcPractıce;

import java.util.Scanner;

public class q07_StrıngManıpulatıon {

    public static void main(String[] args) {
        //Kullanicidan ismini ve soyisimi girmesini isteyin,
        // sonrasinda konsola tam ismini buyuk harfler ile yazdirin   //ıkı soru yapıldı bu sayfada

        //Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi gırınız");
       // String isim=scan.nextLine();
        //String soyisim=scan.nextLine();
       // String fullname=isim.concat("  "+soyisim).toUpperCase();
       // System.out.println("sizin tam isminiz:"+ fullname);

        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ıkı kelıme gırınız");
        System.out.println("string 1:");
        String str1=scan.nextLine();
        System.out.println("string2:");
        String str2=scan.nextLine();

        System.out.println("strınglerın 1mmethod degıskenlerı:"+str1+ " " +str2);
        System.out.println("strınlerın 2 method degısımı :"+ str1.concat(" +str2"));

        String str1liksiz=str1.substring(1);
                String str2liksiz=str2.substring(1);
        System.out.println("strınglerın ilk harfsız hallerı:"  + str1liksiz+" "+str2liksiz);




    }
}
