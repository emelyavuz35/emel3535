package day09_TernaryveSwıtch;

public class C05_Ternary {
    public static void main(String[] args) {

        // Bazen ternary'deki iki sonucun data turleri farkli olabilir
        // verilen sayi 100'den buyukse sayi'nin karesini  alip yazdiran
        // 100'den kucukse " sayi 100'den buyuk olmali" yazdiran
        // bir ternary olusturalim

        int sayı=150;
        // ternary bize sonuc getirdiginden ya sonucu direk yazdirmaliyiz
        // veya bir degoiskene atamaliyiz
        // Eger sonuclar farkli data turlerinde ise
        // atama yapacagimiz variable'in data turu tek olacagindan
        // atama yapamayiz
        // SADECE direk yazdirabiliriz

        System.out.println( sayı>100 ? sayı*sayı:"sayı 100 den buyuk olamlı");

        //sayı*sayı tırnak ıcıne almıstım calısmadı cunku
        //sadece strıng ıfadeler tırnak ıcıne alınır
        //enter yazdıgımda sayı*sayıu yazdırdı
    }
}
