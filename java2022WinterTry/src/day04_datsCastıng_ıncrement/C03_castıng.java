package day04_datsCastıng_ıncrement;

public class C03_castıng {

    public static void main(String[] args) {

        int sayı1= 8;
        int sayı2= 4;
        System.out.println(sayı1/sayı2);

        sayı2=3;
        System.out.println(sayı1/sayı2);

        sayı1=22;
        System.out.println(sayı1/sayı2);
        //java ıkı ınt sayıyı bırbırıne bolerse sonucu da ınt olarak verır.eger vırgulden sonra
        //varsa sıler

        sayı1= 4786;
        sayı2=10;

        sayı1= sayı1/sayı2;
        System.out.println(sayı1);


        sayı1= sayı1/sayı2;
        System.out.println(sayı1);
        System.out.println(sayı1);

        sayı1=4895;
        double sayı3=10;
      //  sayı1=sayı1/sayı3;
    }
}
