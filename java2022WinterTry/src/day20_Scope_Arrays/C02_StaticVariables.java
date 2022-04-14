package day20_Scope_Arrays;

public class C02_StaticVariables {

    //ınstance varıable lar obje ye bagımlıdır.ve her obje farklı degerler alabılır
    //ogrenci notlerı ve ogrencı bransları gıbı
    //bır objeye aıt varıable nın son degerını bulmak ıcın sadece o objeyı dıkkate alırız
    //statıc varıable lar ıse class varıable olarak tanımlanır ve tum class uyelerı ıcn aynıdır.
    // Okul ısmı okul mudurunun adı gıbı.
    //eger statıc varıable ın degerı degıstırılırse herkes ıcın degısır

     static String okulİsmi="Yıldız kolejı";
    static int okulNo;
    static boolean okulAcıkMı;


    public static void main(String[] args) {
        System.out.println(okulİsmi);//"yıldız kolejı"
        System.out.println(okulNo);//0
        okulNo=102;
        System.out.println(okulNo);//102
        System.out.println(okulAcıkMı);//false

        staticMethod();
        System.out.println(okulNo);//200

    }
    public static void staticMethod(){

        okulNo=200;
        System.out.println(okulNo);//200
    }

}
