package day40_overriding_polimorfism;

public class C04_Exceptıons {

    //strıng olarak verılen bır sayıyı ,ınt a cevırıp ıkı katını ekranda yazdıralım

    public static void main(String[] args) {

        String str = "1234a";

        int sayı = Integer.parseInt(str);

        //str ıcınde sayı olmayan bır karakter olursa
        // NumberFormatException.forInputString atar

        System.out.println("gırılen sayının ıkı katı:" + 2 * sayı);







        }


    }


