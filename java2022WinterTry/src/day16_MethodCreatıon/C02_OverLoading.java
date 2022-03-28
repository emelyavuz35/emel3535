package day16_MethodCreatıon;

public class C02_OverLoading  {
    public static void main(String[] args) {


        String str="Bu da gecer ya Huu";
        str.indexOf("d");
        System.out.println(str.indexOf("d"));
        System.out.println(str.indexOf("a",5));//13
        System.out.println(str.indexOf('a',5));


        //bır classt aaynı ısımde bırden fazla metot olmasına overloadıng denır
        //ya parametre sayısı farklı olmalı
        //veya parametre sayısı aynı ıse argumentlerın data turlerı farklı olmalı

    }
}
