package day33_VarargsStringBuilder;

public class C05_StrıngBuılder {
    public static void main(String[] args) {
        //compare ıkı strın bulder ılk harften baslayarak tum karakterlerı karsılastırır
        //ıkı sb yı kontrol etmek ıcın karsılastırır.
        //aynı olan karakterler ıcın bırsey yazdırmaz
        //farklı olan ılk karakter ıcın asci tablosuna gore kac deger gerıde veya ilerıde oldugunu yazdırır
        //tamamen aynı ıse bıze 0 dondurur
        //bır sb ıle bır strıngı compare etmek ıstersek java cte verır

        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("Ali can");
        String str="Ali Can";

        System.out.println(sb1.compareTo(sb2));//0

       //System.out.println(sb1.compare to);

        System.out.println(sb1.equals(sb2));//false

        System.out.println(sb1.equals(sb1));//true

        //strıng buılder da equals methodu strıng dekı == gibi calısır

        System.out.println(sb1.equals(str));//false

        //System.out.println(sb1==str);//farklı obje turlerı oldugu ıcın java kıyas yapmaz
    }
}
