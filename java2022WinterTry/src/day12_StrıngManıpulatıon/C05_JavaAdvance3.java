package day12_StrıngManıpulatıon;

import java.util.Scanner;

public class C05_JavaAdvance3 {
    public static void main(String[] args) {

        //pazıtıf tamsayı ıste
        //3 bas ıse ekrana 3 bas yazdır=n
        //degılse cıft olup olmadıgı kontrol et
        //eger cıft ıse 3 bas cıft sayı yazdır
        //cıft sayı degılse 3 bas olmaya tek sayı yazdır

        Scanner scan=new Scanner(System.in);
        System.out.println("bır sayı gırnız");
        int sayı= scan.nextInt();

        String sonuc=(sayı>99 && sayı<1000)?("3 basamaklı sayı"):(sayı%2==0 ?"3 basamaklı olmayan cıft sayı":"3 basamaklı olamyan tek sayı");
        System.out.println("sonuc");








}
}
