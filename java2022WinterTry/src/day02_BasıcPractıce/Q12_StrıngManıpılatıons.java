package day02_BasıcPractıce;

import java.util.Scanner;

public class Q12_StrıngManıpılatıons {
    public static void main(String[] args) {

          /* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)
          ORNEK:          INPUT     OUTPUT
                          goat        gat
                         photo        hoto
                         ghost        ghost
                         kalem        lem
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bır strıng gırınız");
        String str=scan.next().toLowerCase();
        if (str.startsWith("gh")){
            System.out.println(str);
        }else if (str.startsWith("g")){
            System.out.println(str.charAt(0)+str.substring(2));
        }else if (str.charAt(1)=='h'){
            System.out.println(str.substring(1));
        }else
            System.out.println(str.substring(2));

    }
}
