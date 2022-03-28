package day02_BasıcPractıce;

import java.util.Scanner;

public class Q03_swıtchCas {
    public static void main(String[] args) {

        //kgırılen sayının onlar bas degerını yazı ıle yazdır
        //


        Scanner scan=new Scanner(System.in);
        System.out.println("sayı gırınız");
        int sayı= scan.nextInt();

        int onlarbas=(sayı/10) %10;
        switch (onlarbas){
            case 0: System.out.println("sıfır"); break;
            case 1: System.out.println("bır"); break;
            case 2: System.out.println("ıkı"); break;
            case 3: System.out.println("uc"); break;
            case 4: System.out.println("dort"); break;
            case 5: System.out.println("bes"); break;
            case 6: System.out.println("altı"); break;
            case 7: System.out.println("yedı"); break;
            case 8: System.out.println("sekız"); break;
            case 9: System.out.println("dokuz"); break;




        }

        scan.close();
    }
}
