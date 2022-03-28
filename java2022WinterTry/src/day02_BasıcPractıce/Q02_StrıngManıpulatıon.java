package day02_BasıcPractıce;

import java.util.Scanner;

public class Q02_StrıngManıpulatıon {
    public static void main(String[] args) {


        //scanne kullanarak ıkıv deger gır.bu ıkı kelımeyı metot kullanarak bırlesrır
        //yukarıdakı ornektekı degıskenlerın ılk harflerını atıp bırleastır


        Scanner scan=new Scanner(System.in);
        System.out.println("Strıng 1:");
        String str1=scan.nextLine();

        System.out.println("String2:");
        String str2= scan.nextLine();

        System.out.println("Strınglerın 1.method ıle bırlesımı:" + str1+""+str2);
        System.out.println("Strınlerın 2.metot ıle bırlesımı :" +str1.concat(""+str2));

        String str1lıksız=str1.substring(1);
        String str2lıksız=str2.substring(1);

        System.out.println("Stringlerın ılk harfsız hallerı :+str1liksiz+"+str2lıksız);

       // String a="parlak";
       //Q2_ System.out.println(a.substring(0));


    }
}
