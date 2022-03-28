package AdvanceProje1;

import java.util.Scanner;

public class P3CheckNumber {
    public static void main(String[] args) {

       /* Veri tipi int olan number verildiğinde,
       number  çift mi tek mi kontrol et
        Eğer number çift ise  print true
        Eğer number tek ise  print false
        result true ya da false olmal

        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır sayı gırınız");
        int sayı= scan.nextInt();


        if (sayı%2==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
