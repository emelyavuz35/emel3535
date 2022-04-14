package day00_HomeworkAndQuestıon;

import java.util.Scanner;

public class AsalCarpan {
    static int bolen=0;
    static boolean isAsal=true;

    public static void main(String[] args) {

        /* pozıtıf bır tamsayıyı input kabul edıp en buyuk asaş carpanını veren
        bır method create edını.
        orn.ınput:50
        bolenler:2,5,10,25,50
        asalbolenler:2,5
        en buyuk asal bolen 5
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bır tamsayı gırınız");
        int sayi=scan.nextInt();//50
        asalCarpan(sayi);
    }

    private static void asalCarpan(int sayi) {
        int asalBolen=0;
        for (int i = 2; i <=sayi ; i++) {
            if (sayi % i == 0) {
                bolen = i;
                asalMı(bolen);//method call var bolen sayının asal olup olmadıgını kontrol eder

            }if (isAsal) {
                asalBolen+= bolen;
            }
        }
        System.out.println("gırdıgınız sayının  en buyuk asal bolenı." + asalBolen);

    }

    private static boolean asalMı(int bolen) {//bu method gelen sayının asal olup olmadıgına bakar


        for (int i = 2; i <bolen ; i++) {
            if (bolen%i==0){//bolen sayısına kadar tum tamsayılar boldugunde kalan 0 degılse ;
                            //bu sayı kendısınden baska hıcbır sayıya bolunmez
                isAsal=false;
                break;
            }

        }
        return isAsal;    //kod da bır eksık var
    }
}
