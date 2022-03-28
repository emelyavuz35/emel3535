package day08_İfelsestatements;

import java.util.Scanner;

public class C01_İfelseStatements {
    public static void main(String[] args) {
      // gırılen bır karakterın harf olup olmadıgını bulalım
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bır karakter gırınız");
        char karakter=scan.next().charAt(0);

        if ((karakter>='A'&& karakter<'Z')||(karakter>='a'&& karakter<'z')){
            System.out.println("Gırdıgınız karakter bır harftir");

        }else {
            System.out.println("Gırdıgınız karakter hafr degıldır");

        }

    }
}
