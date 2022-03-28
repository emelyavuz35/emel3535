package day15_MethodCreatıon;

import java.util.Scanner;

public class C03_MethodCreatıon {


    public static void main(String[] args) {


        //kullanıcıdan bır kelıme ısteyın
        //eger kelıme 3 harften kısa ıse "kelıme cok kısa"yazdırın
        //eger kelıme 3-4 veya 5 harflı ıse harf sayısını ve kelımenın tersten yazılısını yazdırın
        //eger 5 harften uzunsa kelıme cok uzun yazdırın


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bır kelıme gırınız");
        String kelime = scan.next();
        int harfsayısı = kelime.length();


        if (harfsayısı < 3) {
            System.out.println("kelime cok kısa");

        } else if (harfsayısı == 3) {
            ucHarfiTersineCevir(kelime);

        } else if (harfsayısı == 4) {
            dortHarfiTersineCevir(kelime);

        } else if (harfsayısı == 5) {
            besHarfiTersineCevir(kelime);

        } else {
            System.out.println("kelıme cok uzun");

            //method olusturmak ıcın metodun adını yazarız
            //metoda  gıderken goturmem gerek varıable varsa bunu methoda eklerım


        }
    }

    public static void besHarfiTersineCevir(String kelime) {
        String terskelime=kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayısı:5");
        System.out.println("kelimenin tersen yazılısı:"+ terskelime);
    }

    public static void dortHarfiTersineCevir(String kelime) {
        String terskelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayısı:4");
        System.out.println("kelimenin tersen yazılısı:"+ terskelime);


    }

    public static void ucHarfiTersineCevir(String kelime) {
       String terskelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);

        System.out.println("girdiginiz kelimedeki harf sayısı:"+kelime.length());
        System.out.println("kelimenin tersen yazılısı:"+ terskelime);

    }


}

