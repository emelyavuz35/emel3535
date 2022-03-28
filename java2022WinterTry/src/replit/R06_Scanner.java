package replit;

import java.util.Scanner;

public class R06_Scanner {
    public static void main(String[] args) {

       // Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.
        //Ornek Cikti :
        //Alan: 9
        //Cevre: 12
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen karenın kenar uzunlugunu gırınız");

         int kenar=scan.nextInt();

        System.out.println("Alan :"+(kenar*kenar));
        System.out.println("Cevre:"+(4*kenar));
    }
}
