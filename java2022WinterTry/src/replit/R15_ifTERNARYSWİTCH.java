package replit;

import java.util.Scanner;

public class R15_ifTERNARYSWİTCH {
    public static void main(String[] args) {
       // Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın
        //Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
        //INPUT : Mustafa
        //OUTPUT : fafafa

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");

        String str= scan.next();

        if (str.length()>=3){
            System.out.println(str.substring(str.length()-2)+str.substring(str.length()-2)+ str.substring(str.length()-2));
        }else
            System.out.println(str);

    }
}
