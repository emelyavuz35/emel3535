package day08_İfelsestatements;

import java.util.Scanner;

public class C06_Alıstırma {
    public static void main(String[] args) {
        //kullanıcıdan maas ıcın bir teklif isteyin
        //teklif 80000 ustundeyse "kabul ediyorum"
        //60000-80000 arasında ise "konusabılırız"
        //60000 altıysa" maalesef kabul edemem

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen teklıfınız olan maası gırınız");
        double maas=scan.nextDouble();

        if (maas<0){
            System.out.println("lutfen gecerlı bır mıktar gırınız");
        }else if (maas>8000){
            System.out.println("Kabul edıyorum");
        }else if (maas>=6000 && maas<=8000){
            System.out.println("Konusabılırız");
        }else{
            System.out.println("kabul edemem");
        }
    }
}
