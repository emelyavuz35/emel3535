package day20_Scope_Arrays;

public class C01_Scope {


    int sayı;
    String bransismi="java";
    boolean okulDaMı;


    public static void main(String[] args) {
        //sayı=10; sayı varıable ı statıc olmadıgı ıcın maın method tan dırect kullanılamz
        //ınstance varıabe llara satatıc methodlardan ulasmak ıcın obje olusturmak gerekır



        C01_Scope obje1=new C01_Scope();
        System.out.println(obje1.sayı);//0 deger atamadıgım ıcın
        obje1.sayı=10;
        System.out.println(obje1.sayı);//10
        obje1.bransismi="SQL";
        System.out.println(obje1.okulDaMı);// false

        C01_Scope obj2=new C01_Scope();
        System.out.println(obj2.sayı);//0
        System.out.println(obj2.bransismi);//java

        obje1.okulDaMı =true;//false
        System.out.println(obj2.okulDaMı);//
    }
}
