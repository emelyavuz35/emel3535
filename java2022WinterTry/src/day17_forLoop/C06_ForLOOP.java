package day17_forLoop;

public class C06_ForLOOP {
    public static void main(String[] args) {

        //verılen ıkı harf ve aralarındakı harflerı yazdıran bır kod yazınız

char ilkHarf='m';
char sonHarf='t';

        for (int i = ilkHarf; i <sonHarf ; i++) {
            System.out.print(i+" ");

        }

        double baslangıc=10;
        double bitis=20;
        double artıs=0.2;
        //baslangıc ve bıtıs arasında artıs mıktarı ıle olusacak tum sayıları yazdır

        for (double i = baslangıc; i <bitis ; i+=artıs) {
            System.out.println(i+" ");

        }


        }
    }



