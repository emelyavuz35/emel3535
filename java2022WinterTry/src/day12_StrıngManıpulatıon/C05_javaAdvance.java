package day12_StrıngManıpulatıon;

import java.util.Scanner;

public class C05_javaAdvance {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen yasınızı  yazınız");

        int yas = scan.nextInt();

        System.out.println("Lutfen kılonuzu gırınız");
        int kılo = scan.nextInt();




        if (yas > 0 && yas < 18) {//yas ve sartı kontrolu yapıldı
            System.out.println("yası 18'den kucuk olanlar kan bagısı yapamaz");
        } else if (yas >= 18) {
            if (kılo > 0 && kılo < 50) {//kilo sartı ve kontrolu yapıldı
                System.out.println("yasınız kan bagısı icin uygun ancak kilonuz yetriz");
            } else if (kılo >= 50) {
                System.out.println("sartlarınız uygun kan bagısı yapabilirsiniz");
            } else System.out.println("kilonuzu hatalı girdiniz");//hatalı kilo girişi kontrolu yapıldı
        } else System.out.println("hatalı veri girdiniz");//hatalı yas girişi kontrolu yapıldı









    }
}
