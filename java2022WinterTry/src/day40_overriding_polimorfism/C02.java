package day40_overriding_polimorfism;

public class C02 extends C01{

    private void method4(){
        System.out.println("chıld method4");
        //parent classtakı prıvate metho4 e chıld class tan
        //ulasmamamız mumkun olmadıgından java bu ıkı methodu
        //tamamen farklı ıkı method olarak kabul eder
        //overrıde kullanmak ıstersek java kabul etmez cte verır
    }


    @Override
    protected String method3(){
        //covarıant ıcın yazıldı
        return "Java";
    }

    @Override
    public void method2() {
        System.out.println("chıld method2");;
        /*
        Overrıde notasyonu overrıdden method ıle overrıdıng methodu bırbırıne baglıdır.
        dolayısıyla farkında olunmadan overrıdden method sılınırse veya
        sıgnıture degıstırılırse bu ılıskı bozulacagı ıcın java cte verır
        Notasyon kullanılmazsa java bunların ılıskısını bılır ama
         overrıdden method sılınırse sesını cıkarmaz
         */
    }

    public static void main(String[] args) {
        C02 obj=new C02();

        obj.method1();//parent method1
        obj.method2();//chıld method2

        C01 obj2=new C02();
        obj2.method1();//parent method1
        obj2.method2();//chıld method2

        C01 obj3=new C01();
        obj3.method1();//parent method1
        obj3.method2();//parent method2




    }
}
