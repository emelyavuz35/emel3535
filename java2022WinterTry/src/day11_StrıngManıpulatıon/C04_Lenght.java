package day11_StrıngManıpulatıon;

import java.util.Locale;
import java.util.Scanner;

public class C04_Lenght {

    public static void main(String[] args) {
        // Kullanicidan ismini alip basharfini ve son harfini Buyuk harflerle yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("ılk harf:"+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));


    }
}
