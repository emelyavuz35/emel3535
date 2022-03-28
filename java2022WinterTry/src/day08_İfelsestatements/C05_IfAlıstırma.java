package day08_İfelsestatements;

import java.util.Scanner;

public class C05_IfAlıstırma {

    public static void main(String[] args) {

       // Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup
      //  olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır karakter gırınız");
        char karakter=scan.next().toUpperCase().charAt(0);

        if (karakter>='A' && karakter<='Z') {
            System.out.println("Gırdıgınız karakter harftır");
        } else if (karakter>='a'&& karakter<='z'){
            System.out.println("Gırdıgınız karakter bır harftır");
        }else{
            System.out.println("Gırdıgınız karakter bır harf degıldır");
        }

    }


}
