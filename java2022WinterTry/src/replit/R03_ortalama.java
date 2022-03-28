package replit;

import java.util.Scanner;

public class R03_ortalama {
    public static void main(String[] args) {

        //Verilen 5 sayinin ortalamasiniz hesaplayan java kodunu yaziniz.
        //Ortalamasi alinacak Sayilar : 22, 20, 30, 28, 50
        // Ornek Cikti:
        //Sayilarin Ortalamasi : 30


        Scanner ort=new Scanner(System.in);
        System.out.println("ılk sayıyı gırınız");
        int sayı1=22;
        System.out.println("ıkıncı sayıyı gırınız");
        int sayı2= 20;
        System.out.println("ucuncu sayıyı gırınız");
        int sayı3= 30;
        System.out.println("dorduncu sayıyı gırınız");
        int sayı4= 28;
        System.out.println("besıncı sayıyı gırınız");
        int sayı5= 50;

        int toplam=22+20+30+28+50;
        double ortalama=toplam/5;
        System.out.println("Bu beş sayının ortalaması:" +ortalama);



    }
}
