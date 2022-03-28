package day08_İfelsestatements;

import java.util.Scanner;

public class C03_SayıKontrol {
    public static void main(String[] args) {

        // Kullanicidan iki sayi isteyin,
        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        // sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        // sayilarin ikisi farkli isaretlere sahipse
        // “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
        // sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ıkı sayı gırınız");

        double sayı1= scan.nextDouble();
        double sayı2=scan.nextDouble();

        if (sayı1>0 && sayı2>0){
            System.out.println("Gırdıgınız ıkı sayı da pozıtıf oldugundan toplamları= " +
                    (sayı1+sayı2));
        }  else if (sayı1<0 && sayı2<0){

            System.out.println("Gırdıgınız ıkı sayı da negatıf oldugundan carpımları=" +
                    (sayı1*sayı2));
        } else if (sayı1*sayı2<0){
            System.out.println("Farklı ısaretlerde sayılarla ıslem yapamazsın");

       } else{
            System.out.println("Sayılardan sıfıra esıt olan varsa sıfır carpmaya gore yutan elemandır ");
        }


    }
}
