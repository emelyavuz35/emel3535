package AdvanceProje1;

public class P08EvenNumbers {
    public static void main(String[] args) {
       /* Veri tipi int olan bir sayı verildiğinde
        0 dan başlayarak verilen sayıya kadar olan tum cift sayıları print edin.
                Example 1:
        int input = 10;
        print  0 2 4 6 8 10  olmalı
        Example 2:
        int input = 15;
        print  0 2 4 6 8 10 12 14  olmalı

        */

        int sayı=10;
        int sonuc=0;
        for (int i = 0; i <sayı ; i++) {
            sonuc=i%2;
            if (sonuc==0 ){
                System.out.println(i);
            }


        }
    }
}
