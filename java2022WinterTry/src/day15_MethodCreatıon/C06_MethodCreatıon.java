package day15_MethodCreatıon;

public class C06_MethodCreatıon {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        //ıkı varıable degerlerının toplayan method olustur
        //1.adım metod adını yazdır
        //2.adım metoda gondermem gereken argument var mı?


        ikiSayiTopla(a,b); //burayı sılersen calısmaz

        C04_.dortHarfiTersineCevir("sema");


    }
     // bır metodu olusturmak calısması ıcın yeterlı degıldır
    //metod ancak cagrılırsa calısır
    //aynı class yada faklı class ta olmasının onemı yoktur
    //java maın metotda yukarıdan asagı dogru calsısı
    //geldıgı satırı clıstırır
    private static void ikiSayiTopla(int a, int b) {
        System.out.println("verilen iki sayının toplamı:" + a+b);

    }
}
