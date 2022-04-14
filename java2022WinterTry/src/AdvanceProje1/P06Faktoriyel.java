package AdvanceProje1;

import java.util.Scanner;

public class P06Faktoriyel {
    public static void main(String[] args) {

      /*  Scanner class aracılığıyla girilen herhangi bir sayının faktöriyel değerini bulmak için bir program yazın.
        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720

       */

        Scanner dp=new Scanner(System.in);
        System.out.println("lutfen bır sayı gırınız");
        String strNum = dp.nextLine();

        int number = Integer.parseInt(strNum);

        int faktoriyel=1;

        for (int i = 1; i <=number ; i++) {
            faktoriyel*=i;
        }
        System.out.println(faktoriyel);


        }
    }

