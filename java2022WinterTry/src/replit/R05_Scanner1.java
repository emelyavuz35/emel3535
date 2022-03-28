package replit;

import java.util.Scanner;

public class R05_Scanner1 {
    public static void main(String[] args) {
       // Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lufen bır sayı gırınız");

        int sayı=scan.nextInt();
        System.out.println((sayı*sayı*sayı)/2);


    }
}
