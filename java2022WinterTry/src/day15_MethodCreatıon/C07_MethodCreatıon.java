package day15_MethodCreatıon;

import java.util.Scanner;

public class C07_MethodCreatıon {

    public static void main(String[] args) {


        //strıngı yazdıran metod olusturalım
        //hosgeldınız dıyen bır metod olusturun
        //kapanma mesajı yazan bır metod olusturalım

        hosgeldinYazdır();
        Stringyazdır("JAVA GUZELLESIYOR");
        kapanmaMetodu();


    }

    public static void kapanmaMetodu() {
        System.out.println("bizi tercih ettıgınız icin tesekkur ederız");
    }

    public static void hosgeldinYazdır() {
        System.out.println("Hosgeldin");
    }

    public static void Stringyazdır(String str) {
        System.out.println(str);
    }
}
