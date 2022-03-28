package day17_forLoop;

public class C06_ForLOOP {
    public static void main(String[] args) {

        //verılen ıkı harf ve aralarındakı harflerı yazdıran bır kod yazınız


        char ilkharf='m';
        char sonharf='t';

        for (char i=ilkharf; i<=sonharf; i++){
            System.out.print(i+" ");
        }



        double baslangıc=10;
        double bitis=20;
        double artıs=0.2;
        //baslangıc ve bıtıs sayıları arasında artıs mıktarı ıle olusacak tum sayıları yazdırın

        for (double i = baslangıc; i <=bitis ; i+=artıs) {
            System.out.println(i +" ");

        }
    }


}
