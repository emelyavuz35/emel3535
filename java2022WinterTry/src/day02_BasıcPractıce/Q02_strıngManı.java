package day02_BasıcPractıce;

import javax.swing.*;
import java.util.Scanner;

public class Q02_strıngManı {

    public static void main(String[] args) {


        //kullanıcıdan bır kelıme ısteyın. eger kelıme 3 ve daha fazla harften olusuyrsa
        //son ıkı harfını 3 kere yan yana yazdırın.degıl ıse gırılen kelımeyı yazdırın
        //orn:=Ali
        //input=Ali
        //output=lilili
        //input=el
        //output=el

        Scanner scan=new Scanner(System.in);
        System.out.println("bır strıng gırınız");
        String str=scan.next();

        if (str.length()>=3){
            System.out.println(str.substring(str.length()-2)+str.substring(str.length()-2)+ str.substring(str.length()-2));
        }else
            System.out.println(str);





    }
}
