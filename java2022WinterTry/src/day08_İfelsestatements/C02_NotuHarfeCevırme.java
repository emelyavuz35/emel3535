package day08_İfelsestatements;

import java.util.Scanner;

public class C02_NotuHarfeCevırme {
    public static void main(String[] args) {
        // Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        // Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”,
        // =50  <60 arasi “C”,
        // =60  <80 arasi “B”,
        // =80’nin uzerinde ise “A”

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu gırınız");
        double notsayı=scan.nextDouble();

        if (notsayı<0|| notsayı>100){
            System.out.println("Lutfen gecerlı bır not gırınız");
        }

          else if (notsayı<50){
              System.out.println("notunuz D");

          }else if (notsayı>=50&&notsayı<60){
              System.out.println("notunuz C");
          }else if (notsayı>=60&&notsayı<80){
              System.out.println("notunuz B");
          }else {
              System.out.println("notunuz A");
          }




    }
}
