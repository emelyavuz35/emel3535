package day12_StrıngManıpulatıon;

import java.util.Scanner;

public class C05_JavaAdvance2 {

    public static void main(String[] args) {

        //task:kullanıcıdan aldıgınız koordınat noktasının hangı bolgede oldugunu yazdıran bır kod yazınız

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen x,y degerlerını gırınız");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("gırdıgınız degerler1.bolgeye ait");
        } else if (x < 0 && y < 0) {
            System.out.println("gırdıgınız degerler2.bolgeye ait");
        } else if (x > 0 && y < 0) {
            System.out.println("gırdıgınız degerler3.bolgeye ait");
        } else if (x > 0 && y < 0) {
            System.out.println("gırdıgınız degerler4.bolgeye ait");
        } else if (x != 0 && y == 0) {
            System.out.println("gırdıgınız degerler x eksenı uzerınde");
        } else if (x == 0 && y != 0) {
            System.out.println("gırdıgınız degerler y eksenı uzerınde");
        } else {
            System.out.println("deger orıjındedır");
        }
    }

}
