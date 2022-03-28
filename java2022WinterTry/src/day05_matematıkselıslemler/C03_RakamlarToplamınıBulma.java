package day05_matematıkselıslemler;

import java.util.Scanner;

public class C03_RakamlarToplamınıBulma {
    public static void main(String[] args) {

        //kullanıcıdan aldıgınız 4 basamaklı sayının sayı degerlerı toplamını bulunuz

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen dort basamaklı bır tamsayı gırınız");
        int sayı= scan.nextInt();


        int rakam=0;
        int rakamlarınToplamı=0;


        rakam=sayı%10;
        rakamlarınToplamı +=rakam;// 2
        sayı/=10;//753

        rakam=sayı%10;
        rakamlarınToplamı +=rakam; //5
        sayı/=10;//75

        rakam=sayı%10;
        rakamlarınToplamı +=rakam;//10
        sayı/=10; //7

        rakam=sayı%10;
        rakamlarınToplamı +=rakam;//17
        sayı/=10;//0

        System.out.println("gırdıgınız sayının rakamlar toplamı"  +   rakamlarınToplamı);


    }
}
