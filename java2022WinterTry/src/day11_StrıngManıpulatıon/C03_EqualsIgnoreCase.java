package day11_StrıngManıpulatıon;

import java.util.Scanner;

public class C03_EqualsIgnoreCase {
    public static void main(String[] args) {
        //kullanıcıya derse katılıp katılmak
        // ıstemedıgını sorun.evet derse derse katılımınız alınmıstır.
        //hayır derse cevabını verın ve sonrakı derslerımıze beklerız
        //yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Derse katılmak ıster mısınız \n evet yada hayır yazınız");

        String cevap = scan.next();
        if (cevap.equalsIgnoreCase("evet")) {
            System.out.println("cevabınız:" + cevap + "Derse katılımınız onaylanmıstır");


        } else if   (cevap.equalsIgnoreCase("hayır")){
            System.out.println("cevabınız:" + cevap + "Sonrakı derslere beklerız");
    }else {
            System.out.println("Lutfen evet veya hayır yazınız");

        }
    }
}
