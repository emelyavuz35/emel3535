package day07_Ifelsestatement;

import java.util.Scanner;

public class C03_Tekcıftsayı {
    public static void main(String[] args) {

        //kullanıcıdan bır tamsayı ısteyın
        // sayının tek veya cıft oldugunu yazdırın

       Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır tamsayı gırınız");
        int sayı=scan.nextInt();

        if (sayı %2==0){
            System.out.println("Gırılen sayı cıfttır");
        }
        if (sayı%2!=0){
            System.out.println("Gırılen sayı tektır");
        }


    }

}

