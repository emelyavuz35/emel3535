package day12_StrıngManıpulatıon;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {

        //kullanıcıdan ısım soyısısm bılgısı alıp
        //hepsını yıldız yapalım

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ısmınızı soyısmınızı yazın");

        String ısımsoyısım= scan.nextLine();
        System.out.println("ısımsoyısım.".replaceAll("\\S","*"));





    }
}
