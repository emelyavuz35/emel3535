package day30;

public class C01_StaticBlocks {
    static {
        System.out.println("static block calıstı");
    }
    //statıc blok class ılk calısmaya basladıgında devreye gırer.
    //ve class ın calısması ıcın gereklı on hazırlıklar ıcın kullanılır
    //yazıldıgı satırın hıc bır onemı yoktur
    //statıc block bırden fazla olursa block lar yukarıdan asagı dogru sırayla calısır

    C01_StaticBlocks(){
        System.out.println("Constructor calıstı");


    }

    public static void main(String[] args) {
        System.out.println("main method baslangıcı");
        C01_StaticBlocks obj1;
        new C01_StaticBlocks();
        System.out.println("maın method sonu");
    }
}






