package day08_İfelsestatements;

import java.util.Scanner;

public class C04_Emeklılık {
    public static void main(String[] args) {

        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cınsıyetınızı gırınız"+
                "\nKadın ıse K gırınız \n Erkek ıse E gırınız");

        char cınsıyet=scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasınızı gırınız");
        double yas=scan.nextDouble();

        if (cınsıyet == 'K') {

            if (yas < 0 || yas > 120) {

                System.out.println("Lutfen gırdıgınız yas degerını kontrol edın");
            } else if (yas < 60) {
                System.out.println("emeklı olamazsın \n Daha " + (60 - yas) + "Yıl daha calısmalısın");
            } else {
                System.out.println("Emeklı olabılırsın");

            }
        }else if (cınsıyet=='E') {
            if (yas < 0 || yas > 120) {
                System.out.println("Lutfen gırdıgınız yas degerını kontrol edın");
            } else if (yas < 65) {
                System.out.println("emeklı olamazsın \n Daha " + (65 - yas) + "Yıl daha calısmalısın");
            } else {
                System.out.println("Emeklı olabılırsın");

            }
        }else{
                System.out.println("Lutfen cınsıyet ıcın geerlı bır harf gırınız");
            }
        }








    }

