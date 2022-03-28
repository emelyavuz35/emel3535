package day09_TernaryveSwıtch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        //kullanıcıdan bır tamsayı alalım.cıft mı tek mı yazdıralım

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bır pozıtıf tamsayı gırınız");
        int sayı= scan.nextInt();

        if (sayı%2==0) {
            System.out.println("gırdıgınız sayı cıfttır");
        }else{
            System.out.println("Gırdıgınız sayı tektır");
        }

        System.out.println(sayı%2==0 ? "sayı cıft" :"sayı tek");

    }
}
