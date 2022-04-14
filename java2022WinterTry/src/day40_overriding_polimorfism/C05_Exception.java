package day40_overriding_polimorfism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_Exception {
    //kullanıcıdan ıstedıgı kadar sayıyı alıp toplayan  bır program yazınız
    //toplam 500 u gecerse programı bıtırsın vaya
    //kullanıcı bıtırmek ıstedıgınde Q ya basmalıdır


    //CALISTIRMA

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int toplam=0;

        do {

            System.out.println("lutfen toplamak ıstedıgınız sayıyı gırınız\n bıtırmek ıcınQya basınız");
            int sayı= 0;



            try {
                sayı = scan.nextInt();
                toplam+=sayı;
            } catch (InputMismatchException e) {
                String hataliGiris=scan.next();
                if (hataliGiris.equalsIgnoreCase("q")){

                    break;
                }else {
                    System.out.println("hatalı gırıs");
                }

            }

        }while (toplam<500);
        System.out.println("gırdıgımız sayıların toplamı"+toplam);

    }


}
