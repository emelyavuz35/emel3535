package day12_StrıngManıpulatıon;

public class C05_replace {
    public static void main(String[] args) {

        String str="Bugun ne cok sey ogrendık";

        //dbu cumledekı bosluk dısındakı karakter sayısını bul
        // str kalıcıc degıstırmek ıatemıyorum o yuzden sout


        System.out.println("space harıc karaktersayısı:"+str.replace("","").length());


        //atama yapılmadıgı surece orjına strıng degısmez sadece o satır ıcın degısılık yapılmıs olur

        System.out.println("orjınal karakter sayısı:"+ str.length());

        //str de kalıcı degısıklık yapalım.
        //bugun yerıne yarın
        //ogrendık yerıne ogrenecegız


        str= str.replace(" Bugun","yarin");
        str= str.replace("ogrendık","ogrenecegız");


        System.out.println("kalıcı degısıklıkten sonra :" + str);






    }
}
