package day00_HomeworkAndQuestıon;

import java.util.Scanner;

public class WhileCountSum {
    public static void main(String[] args) {

        //  Kullanicidan toplanmak uzere sayilar isteyin
        // sayi adedi 10'u gecerse veya toplam 500 'u gecerse
        // bu kadar sayi yeter
        // ".. adet sayi girdin, toplami..." yazdirin

       Scanner scan=new Scanner(System.in);
       int sayı=0;
       int toplam=0;
       int sayac=0;

       while (sayı<10&& toplam<500){
           System.out.println("lutfen toplamak ıstedıgınız sayıyı gırınız");
           sayı= scan.nextInt();
           toplam++;
           sayac++;
       }
       if(sayı<10 &&toplam<500){
           System.out.println(sayac+"sayı gırdınız.Toplamı:"+toplam);
       }else System.out.println("bu kadar sayı yeter" + sayac + "adet sayı gırdınız.toplam"+toplam);
    }
}
