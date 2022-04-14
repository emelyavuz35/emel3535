package day42_Exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) throws IllegalAccessException {
        /*
        kullanıcıdan yasını ısteyın.kullanıcı yas olarak negatıf bır sayı,
        0,120 den buyuk bır sayı gırerse illegalargument exceptıon olusacak
        sekılde bır program yazınız
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasınızı gırınız");
        int yas=scan.nextInt();
        if (yas<=0|| yas>120){
           // System.out.println("lutfen gecerlı bır yas gırınız");
            //java bızım ıstedıgımız durumlarda exception fırlatabılır
            throw new IllegalArgumentException();
        }else{
            System.out.println("uygun yas gırdınız tesekkurler...");

        }
    }
}
