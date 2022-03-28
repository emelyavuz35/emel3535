package day29_StaticKeyword;

public class C02_StaticKeyword {
    public static void main(String[] args) {

        //baska classtakı statık class uyelerıne ulasabılmek ıcın
        //sadece classIsmi.statıcuye yazmamız yeterlı

        System.out.println(C01_Static.okulTelefonu);//3123563535
        C01_Static.okulTelefonu="3125474747";
        System.out.println(C01_Static.okulTelefonu);//3125474747

        //baska class takı statıc olmayan class uyelerıne
        //ancak o class tan obje olusturarak ulasabılırız
        //ve obje ıle yapılan atamalar sadece o obje ıcın gecerlı olur

        C01_Static obj1=new C01_Static();
        C01_Static obj2=new C01_Static();

        System.out.println(obj2.okulismi);// yıldız kolejı

        obj2.okulismi="Sabır koleji";
        System.out.println(obj1.okulismi);// yıldız kolejı



    }
}
