package day06_concatenatıons.day18_NestedForLoop;

public class C01_ForLoop {

    public static void main(String[] args) {


        //kullanıcıdan 10 dan kucuk bır tamsayı ısteyın
        //ve gırılen sayının faktorıyelını bulun(5!=5*4*3*2*1)

        int input=9;

        int faktoryel=1;

        String faktoryelAcıkYazim="";

        for (int i = input; i >=1 ; i--) {    //


            faktoryel *= i;
            faktoryelAcıkYazim=faktoryelAcıkYazim+i+"*" ;

            if (i == input) {
               faktoryelAcıkYazim=faktoryelAcıkYazim+i;


            }else
               faktoryelAcıkYazim=faktoryelAcıkYazim+"*"+i;   //9*8*7*6*...

            //faktoryelAcıkYazim=faktoryelAcıkYazim + i + "*";




        }
        System.out.println(input+"!="+faktoryelAcıkYazim+"="+faktoryel);

//                                                      //tek tek yazdırıyor o yuzden olmaz

    }
}
