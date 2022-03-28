package day16_MethodCreatıon;

public class C03_OverLoading {
    public static void main(String[] args) {

        //verılen ıkı sayıyı toplayan ve yazdıran bır methot olusturalım

        int sayı1 = 10;
        int sayı2 = 20;


        ikiSayıTopla(sayı1, sayı2);

        //iki double sayının toplamını yazdıran bır method olusturalım

        double sayı3 = 15.2;
        double sayı4 = 10.3;

        ikiSayıTopla(sayı3, sayı4);
        //eger varıbale olusturmadan dırek sayılaraı yazarak method call yaparsam
        ikiSayıTopla(15, 25);//ınt toplamı verırı
        ikiSayıTopla(10.1, 12.3);//double toplam verır

        //bır ınt bır double toplamınnı yazdıran bıt method olustur
        int sayı5 = 3;
        double sayı6 = 3.2;

        ikiSayıTopla(sayı5, sayı6);// ınt ve double calıstırmak ıstıyorum


    }

    private static void ikiSayıTopla(int sayı3, double sayı4) {

        System.out.println("bir int bir double:"+(sayı3+sayı4));

}
    private static void ikiSayıTopla(double sayı3, double sayı4) {

        System.out.println("iki double toplamı:"+ (sayı3+sayı4));
    }

    private static void ikiSayıTopla(int sayı1, int sayı2) {

        System.out.println("iki integer toplamı:"+(sayı1+sayı2));
    }
}
