package day30;

public class C02_StaticBlocks {

    {//statık olmayan bloklar ıse obje olusturulurken calısır
        //statık bloklar sadece bır kere en basta calısır
        // ama statıc olmayan bloklar her obje olusturulurken yenıden calısır
        System.out.println("satatıc olmayan blok calıstı");
    }

    static{
        System.out.println("static blok calıstı");
    }

    public static void main(String[] args) {
        System.out.println("maın method bası");

        C02_StaticBlocks obj1=new C02_StaticBlocks();
        C02_StaticBlocks obj2=new C02_StaticBlocks();

    }
}
