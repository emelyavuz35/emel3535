package day02_BasıcPractıce;

import java.util.Scanner;

public class Q01_NestedIfStatement {
    public static void main(String[] args) {

        //kullanıcıdan yas bılgısı al
        //>=18 oy kullanma yası
        //age 18 oy kullanmaya uygun
        //>=70 uc kez oy kullanabılur//
        //70>age>=50


        Scanner scan=new Scanner(System.in);
        System.out.println("yasınızı gırınız");// prınt kullanrsak konsolda yanına gırerız

        int age= scan.nextInt();

        if (age>=18){

            if (age>=70){
                System.out.println(" Yası oy kullanmaya uygundur");
                System.out.println("uc kez oy kullanabılır");
            }else if (age>=50) {
                System.out.println(" Yası oy kullanmaya uygundur");
                System.out.println("ıkı kez oy kullanabılır");

            }else{//50>age>=18
                System.out.println(" Yası oy kullanmaya uygundur");
                System.out.println("bır kez oy kullanabılır");

            }
        }else if (age>0 &&age<18){
            System.out.println("yası oy kullanmaya uygun degıldır");
        }else
            System.out.println("hatalı gırıs yaptınız");
    }

}
