package day39_overriding;

public class Corolla extends Toyota{

    protected String hız="Arabalar motor gucune gore hız yaparlar";
    protected String yakıt="corolla benzınlı yada elektrıklıdır";
    protected String model="corolla";


    public void motor(){
        System.out.println("Corolla araclar cevrecı motor kullanır");
    }
    public void yakıtTuketimi(){
        System.out.println("corolla 5.6 lt yakıt tuketır");
    }
    public void vitesSayısı(){
        System.out.println("corolla 5 viteslidir");
    }


    /*Data turu VE constructor farklı oldugundan cons calıstıgı ıcın
    obje constructorun oldugu
    class ozellıklerını tasır ancak data turu parent class secıldıgı ıcın
    varable lar data turunun secıldıgı icin class ve onun parent
    claslarında deger alabılır

    methodlar ıcın ıse yıen data turunun oldugu class a gıderız
    .ancak dırect methodu calıstırmadan once
    method overrıde edılmıs mı dıye kontrol ederız
     */

    public static void main(String[] args) {
        Corolla arb1=new Corolla();
        System.out.println(arb1.hareket);//araba
        System.out.println(arb1.hız);//corolla
        System.out.println(arb1.yakıt);//corolla
        System.out.println(arb1.marka);//toyota
        System.out.println(arb1.sirketMerkezi);//toyota fan alır
        System.out.println(arb1.model);//corolla
        arb1.motor();//corolla



        Toyota arb2=new Corolla();
        System.out.println(arb2.hareket);//araba
        System.out.println(arb2.hız);//toyota
        System.out.println(arb2.yakıt);//araba
        System.out.println(arb2.marka);//toyota
        System.out.println(arb2.sirketMerkezi);//toyota fan alır
        //System.out.println(arb2.model);//CTE
        arb2.motor();//corolla araclar cevreı motor kullanır
        arb2 .garanti();//toyoto dakı calısır
        arb2.yakıtTuketimi();//corolla
        //arb2.vitesSayısı();data turu olan toyotadna baslayınca
        //boyle bır method bulamadık dolayısıyla cte


        Araba arb3=new Corolla();
        System.out.println(arb3.hareket);//araba
        System.out.println(arb3.hız);//araba
        System.out.println(arb3.yakıt);//araba
        System.out.println(arb3.marka);//araba
        //System.out.println(arb3.sirketMerkezi);//CTE
        //System.out.println(arb3.model);//CTE
        arb3.yakıtTuketimi();//corolla dakı calısır
        arb3.motor();//corolla
       // arb3.garanti();cte aramaya araba classından basladık ama bulamadık
       // arb3.vitesSayısı();cte

    }
}
