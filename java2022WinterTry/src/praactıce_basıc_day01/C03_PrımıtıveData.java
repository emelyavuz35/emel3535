package praactıce_basıc_day01;

public class C03_PrımıtıveData {
    public static void main(String[] args) {


        //byte,short,ınteger,double,float verı tıplerının max ve mın degerlerını yazdıralım
        //degıskenler ıcın anlamlı ısımler kullanıp yazdıralım

        byte byteMax= Byte.MAX_VALUE;
        System.out.println("byte.max="+byteMax);

        byte bytemın=Byte.MIN_VALUE;
        System.out.println("byte.max="+bytemın);

        short shortMax=Short.MAX_VALUE;
        System.out.println("short="+ shortMax);

        short shortMın=Short.MIN_VALUE;
        System.out.println("shortmın=" + shortMın);

        int intMax=Integer.MAX_VALUE;
        System.out.println("İntMax=" + intMax);

        int intMın=Integer.MIN_VALUE;
        System.out.println("intMın="+ intMax);

        long longMin=Long.MIN_VALUE;
        System.out.println("longmin="+ longMin);

        long longMax=Long.MAX_VALUE;
        System.out.println("longMax="+ longMax);


        // her verı turuyle bır tane olmak uzere 4 degısken olusturun float char boolean double
        //degıskenler ıcın anlamlı ısımler kullanıo yazdıralım

        float  laptopFıyat=999.99f;
        double kılometre=579.6;
        char cınsıyet='E';
        boolean dogruMu=false;

        System.out.println("laptopFıyat:" + laptopFıyat);
        System.out.println("kılometre:" + kılometre);
        System.out.println("cınsıyet:" +cınsıyet);
        System.out.println("dogruMu:" + dogruMu);


        System.out.print(laptopFıyat+ " "+ kılometre+" "+cınsıyet+" "+ dogruMu);










    }
}
