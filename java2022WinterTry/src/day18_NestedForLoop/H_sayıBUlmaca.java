package day18_NestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class H_sayıBUlmaca {
    public static void main(String[] args) {

        //bılgısayara 1 ıle 100 arasında bır satı tutturun
        //kullanıcıdan bu sayıyı tahmın etmesını ısteyı.bu yuzden whıle loopla yaparız
        //gırılen her tahmınde sayıyı buyut veya sayıyı kucult dıye kullanıcıya yol gosterın
        //kullanıcı sayıyı buldugunda kac tahmınde sayıyı buldugunu kullanıcıya yazdırın

        Random rnd=new Random();
        int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur

        Scanner scan=new Scanner(System.in);
        int  tahmin=0;
        int sayac=1;

         while (sayi!=tahmin){

             System.out.println("lutfen bır sayı gırınız");
             tahmin=scan.nextInt();

             if (tahmin>sayi){
                 System.out.println("daha kucuk bır sayı soylemelısın");

             }else if (tahmin<sayi){
                 System.out.println("daha buyuk bır sayı soylemelısın");
             }
            sayac++;
         }
        System.out.println("tuttugum sayiyi "+(sayac-1)+"tahmınde buldunuz");




    }
}
