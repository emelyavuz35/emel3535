package day19_DoWhıleLoop;

import java.util.Scanner;

public class C04_DoWhıleLoop {
    public static void main(String[] args) {

       // Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        // Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve
        // “Negatif sayi giremezsiniz” yazdirip basa donun
        //Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative sayi girdigini
        // ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin


        Scanner scan=new Scanner(System.in);
        int sayı=0;
        int toplam=0;
        int sayacPozitif=0;
        int sayacNegatif=0;

        do {
            System.out.println("lutfen pozıtıf tamsayı gırın \n bırımek ıcın 0 a basın");
            sayı=scan.nextInt();
            if (sayı<0){
                System.out.println("negatıf sayı gıremezsınız");
                sayacNegatif++;
            }else if (sayı>0){
                toplam+=sayı;
                sayacPozitif++;
            }

        }while (sayı!=0);
        System.out.println("yanlıslıkla gırılen negatıf sayı adedı :" + sayacNegatif);
        System.out.println("gırılen pozitif sayı adedı:"+ sayacPozitif);
        System.out.println("gırılen pozitif sayıların toplamı : " +toplam);

    }
}
