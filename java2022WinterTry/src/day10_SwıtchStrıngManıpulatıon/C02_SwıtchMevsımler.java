package day10_SwıtchStrıngManıpulatıon;

import java.util.Scanner;

public class C02_SwıtchMevsımler {
    public static void main(String[] args) {

        // Kullanicidan kacinci ay oldugunu alip mevsimi yazdiran bir
        // switch olusturun

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kacıncı ay oldugunu gırınız");
        int ayno= scan.nextInt();

        switch (ayno){

            case 12:
            case 1:
                case 2:
                System.out.println("Kıs");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;


        }
    }
}
