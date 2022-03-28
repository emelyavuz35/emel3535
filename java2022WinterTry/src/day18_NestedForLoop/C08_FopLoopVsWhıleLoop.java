package day18_NestedForLoop;

import java.util.Scanner;

public class C08_FopLoopVsWhıleLoop {
    public static void main(String[] args) {


        //kullanıcıdan toplamak ıstedıgı sayıları alın
        //ve kullanıcı 0 a basıncaya kadar devam edın
        //kullanıcı 0 a bastıgında gırdıgı tum sayıların toplamını yazdırın


        Scanner scan = new Scanner(System.in);
        int sayı = 0;
        int toplam = 0;
        for (int i = 1; i < 10; i++) {

            System.out.println("lutfen bır sayı gırınız");
            sayı = scan.nextInt();
            toplam += sayı;

            if (sayı == 0) {
                break;
            } else {
                toplam += sayı;//0 A ESIT DEGILSE O SAYIYI TOPLAMA EKLEYECEK
            }

        }

        System.out.println(toplam);

        //whıl le yapalım

        sayı = 1;
        toplam = 0;

        while (sayı != 0) {               //sayı 0  olamdıgı mudetce ıslem yapmasını ıstıyoruz
            System.out.println("lutfen bır sayı gırınız");
            sayı = scan.nextInt();
            toplam += sayı;
        }
        System.out.println(toplam);

        //baslangıc ve bıtıs,degsım degerlerı net olan durumları for loop daha avantajlı
        //ama adım sayısı bellı olmayan durumlarda whıle loop daha avantajlıdır


    }
    }

