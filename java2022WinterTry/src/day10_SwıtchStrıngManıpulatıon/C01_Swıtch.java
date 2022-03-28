package day10_SwıtchStrıngManıpulatıon;

import java.util.Scanner;

public class C01_Swıtch {

    public static void main(String[] args) {

        // kullanicidan sayi olarak kacinci ay oldugunu  alip
        // istenen ay ismini yazdiran bir program yaziniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kacıncı ay oldugunu gırınız");
        int ayno= scan.nextInt();

        switch (ayno){
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Hazıran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekım");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Lutfen gecerlı bır ay numarası gırınız");

        }
            //ay no 5 oldu.swıtch 5 ıgorunceye kadar calıstırır.
        //ta kı break gorunceye kadar
        //ıf else dekı son else gıbı gerıye kalan durumları tamammen kapsayacak bır satır ekleyebılırız



    }
}
