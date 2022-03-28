package day07_Ifelsestatement;

import java.util.Scanner;

public class C01_IfelseHaftanıngunlerı {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gun Ismı yazınız");
        String gunısmı = scan.next().toUpperCase();

        if (gunısmı.equals("PAZAR") || gunısmı.equals("CUMARTESI"))
        {
            System.out.println("Gırdıgınız gun haftasonudur");
        }
          else{
            System.out.println("Gırdıgınız gun haftaıcıdır");
        }
    }


}
