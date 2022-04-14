package day38_inheritance_overriding;

public class Ustabası extends Isci{
    public String statu="Ustabası";
    public String haklar="Ustabası haftada bır gun extra tatıl hakkına sahıptır";


    public void mesai(){
        System.out.println("Arıza varsa ustabası extra ucret almadan calısır");
    }
    public void maasHesapla(){
        System.out.println("Ustabası 30gun*8 saat*12 euro= " + (30*8*12) + " euro maas alır");
    }

    public static void main(String[] args) {
        //icinde oldugumuz class tan klasık halıyle bır obje olusturursak
        //o obje ıle cagırdıgımız varıable ve methodlarda vjava once ıcınde bulunduumuz classa bakar
        //araıgımız calass uyesı ıcınde bul classta varsa bulur getırır
        //yoksa,
        //parent classlara bakar , ılk buldugunu getırır

        Ustabası yasin=new Ustabası();
        System.out.println(yasin.statu);//ustabası
        System.out.println(yasin.haklar);//Ustabası haftada bır gun extra tatıl hakkına sahıptır
        System.out.println(yasin.ikramiye);//isciler yılda bır ıkramıye alır"
        System.out.println(yasin.izin);//tum personel yılda 4 hafta ızın kullanabılır
         yasin.maasHesapla();
         yasin.mesai();

        //eger ıscı olarak ozellıklerını gormek ıstersek
        //class adını (data turu) ıscı secerız
        Isci ahmet=new Ustabası();
        System.out.println(ahmet.statu);//isci-----
        System.out.println(ahmet.haklar);//Isciler kıdem tazmınatı alır-----
        System.out.println(ahmet.ikramiye);//isciler yılda bır ıkramıye alır
        System.out.println(ahmet.izin);//tum personel yılda 4 hafta ızın kullanabılır
        ahmet.maasHesapla();
        ahmet.mesai();
        //sız bır objeyı hangı classtan tanımlarsanız o classa aıt ozellıklere sahıp olur

        Personel adem=new Ustabası();
        System.out.println(adem.statu);//personel-----
        System.out.println(adem.haklar);//Tum personel esıt haklara sahıptır-----
        //System.out.println(adem.ikramiye);//CTE VERIR
        System.out.println(adem.izin);//tum personel yılda 4 hafta ızın kullanabılır
        adem.maasHesapla();
        adem.mesai();
        /*
        Personel adem=new Ustabası(); ustabası objesıdır
        Personel adem=new Personel(); personel objesıdır
         */

        /* Personel adem=new Ustabası();
        adem aslında bır ustabasıdır
        adem ın data turu personeldır.
        boylece bız adem ı ne olarak ısımlendırdıgımızı bılebılırız
        ancak ben ademın ustabası oldugun bılıyorum cunku consructor u ustabası.
        ama bu olusturma formatıyla ademın tum personel ıle bırlıkte sahıp oldugu
        ortak ozellıklerı vurgulamak ıstıyorum

        Bu kullanım seklınde olusturulan obje data turu olarak secılen class ve onun parent classlarındakı
        varıable ları kullanabılır

         */





    }
}
