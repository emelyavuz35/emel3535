package day06_concatenatıons.day18_NestedForLoop;

import java.util.Scanner;

public class C09_WhıleLOOP {
    public static void main(String[] args) {

        //kullanıcıdan ıstedıgı kadar sayı gırmesını ısteyın//
        //kullanıcının gırdıgı sayının toplamı 500 u gecerse
        //artık yeter cok sayı gırdın toplam .... oldu yazsın


        Scanner scan = new Scanner(System.in);

        int sayı = 0;
        int toplam = 0;

        while (toplam < 500) {
            System.out.println("lutfenb bır sayı gırınız");
            sayı = scan.nextInt();
            toplam += sayı;
        }
        System.out.println("artık yeter cok sayı gırdın, toplam:" + toplam + "oldu");

    }
}