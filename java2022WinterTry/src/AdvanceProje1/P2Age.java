package AdvanceProje1;

import java.util.Scanner;

public class P2Age {
    public static void main(String[] args) {
    /* Eğer age 10 dan küçük veya eşit ise
        facebook hesabi acmak icin cok gencsin print yapın.

        Eğer age 16 dan küçük veya eşit ise
        ehliyet almak icin cok gencsin print yapın.

         Eğer age 18 den küçük veya eşit ise
        dovme yaptirmak icin cok gencsin print yapın.

        Eğer age 21 den küçük veya eşit ise
        alkol icmek icin cok gencsin print yapın.

        Eğer age 21 den büyük ise
        istedigini yapabilirsin print yapın.
 */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasınızı gırınız");
        int myage=scan.nextInt();


        if (myage<=10){
            System.out.println("Facebook hesabi acmak icin cok gencsin");
        }else  if (myage<=16){
            System.out.println("Ehliyet almak icin cok gencsin");
        }else  if (myage<=18){
            System.out.println("Dovme yaptirmak icin cok gencsin ");
        }else if (myage<=21){
            System.out.println("Alkol icmek icin cok gencsin");
        }else if (myage>21){
            System.out.println(" İstedigini yapabilirsin");

        }else{
            System.out.println("Lutfen yasınızı gırdıgınızden emın olun!!");
        }

    }
}
