package JavaAdvanced;

import java.util.Scanner;

public class AİRWAYS {
    public static void main(String[] args) {

        /* a sehrınden ucmak ısteyen bır yolcu b sehrıne500 km c sehrıne 700 km d sehrıne 900 km mesafedeı
        bilet tarıfesı
        km 0.10 dolar
        yolcu 12 yasından kucukse toplaam %50 ındırım
        12 ve 24 yas arasındaysa %10 ındırım
        65 ten buyukse %30 ındırım
        bılet gıdıs donusse %20 ındırım uygulanır
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Java airlines a hosgeldınız..\n B  C  D  ROTASINDAN BİRİNİ SECİNİZ");
        String city=scan.next().toUpperCase();
        System.out.println("ucusunuz ıcın \n  tek yon-1, \n cift yon-2\n gırınız");
        int flytype=scan.nextInt();
        System.out.println("yasınızı gıınız");
        int age=scan.nextInt();
        double priceC=0.10*700;
        double priceB=0.10*500;
        double priceD=0.10*900;

        if (city.equals("B") || city.equals("C") || city.equals("D")) {
            if (age > 65) {//65 yas ustu kontrolu yas için %30 indirim
                if (city.equals("B")) {//ucus rotası kontrolu
                    if (flytype == 1) {// ucus tek-cift yon kontrolu %20 indirim
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceB * 0.7 + " $");
                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceB * 0.7 * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                } else if (city.equals("C")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceC * 0.7 + " $");
                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceC * 0.7 * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                } else if (city.equals("D")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceD * 0.7 + " $");
                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceD * 0.7 * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                }
            } else if (age >= 12 && age < 24) {
                if (city.equals("B")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceB * 0.9 + " $");
                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceB * 0.9 * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                } else if (city.equals("C")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceC * 0.9 + " $");
                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceC * 0.9 * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                } else if (city.equals("D")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceD * 0.9 + " $");
                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceD * 0.9 * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                }
            } else if (age < 12) {
                if (city.equals("B")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceB * 0.5 + " $");
                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceB * 0.5 * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                } else if (city.equals("C")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceC * 0.5 + " $");
                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceC * 0.5 * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                } else if (city.equals("D")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceD * 0.5 + " $");
                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceD * 0.5 * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                } else System.out.println("agam adam gibi yas gir :(");
            } else if (age >= 24 && age <= 65) {
                if (city.equals("B")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceB + " $");
                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceB * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                } else if (city.equals("C")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceC + " $");
                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceC * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                } else if (city.equals("D")) {
                    if (flytype == 1) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + priceD + " $");
                    } else if (flytype == 2) {
                        System.out.println("   *****   ");
                        System.out.println("ucusunuz için bilet odemeniz : " + (priceD * 0.8) * 2 + " $");
                    } else System.out.println("hatalı veri giridiniz");
                }
            } else System.out.println("agam henüz o gezegene ucus yok :)");


        }

        }
}
