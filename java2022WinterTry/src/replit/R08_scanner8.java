package replit;

import java.util.Scanner;

public class R08_scanner8 {
    public static void main(String[] args) {
        //Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.
        //Örnek Çıktı:
        //Verilen tamsayının rakamları toplamı 10'dur.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen uc basamaklı bir sayı giriniz");


        int sayı= scan.nextInt();
        int rakam=0;
        int rakamlarToplamı=0;

        rakam=sayı%10;
        rakamlarToplamı+=rakam;
        sayı/=10;

        rakam=sayı%10;
        rakamlarToplamı+=rakam;
        sayı/=10;

        rakam=sayı%10;
        rakamlarToplamı+=rakam;
        sayı/=10;

        System.out.println("Verilen tamsayının rakamları toplamı  " + rakamlarToplamı);


    }
}
