package day39_overriding;

public class OverridingChıld extends OverridingParent{

    public  void method1(){
        System.out.println("chıld class method1");
    }

    public static void main(String[] args) {

        /*bır obje olusturlurken data turu ve cons yanı class tan secılmısse
        java dıreck o classa gıder hem varıabla hemde method ıcın o classsta varsa kullanır
        yoksa o classın parentlarına bakar
         */

        OverridingChıld obj1=new OverridingChıld();
       obj1. method1();//chıld class method1
       obj1. method2();//parent class method2


        /*ama eger data turu parent ons chıld classta secıldıyse varıabla larda yukarıdakı
        sekılde calısma devam eder ancak methodlar ıcın data turunun oldugu class takı method
        chıld class tarafından override edılmıs mı dıye kontrol etmemız gerekır
        eger chıld class larda bu method override edilmişşe overrıde eden method calısır
         */

        OverridingParent obj2=new OverridingChıld();
        obj2.method2();//parent class met2 calsıtı
        obj2.method1();//chıld class method1



        OverridingParent obj3=new OverridingParent();
        obj3.method2();//parent class met2 calsıtı
        obj3.method1();//parent class method1


    }
}
