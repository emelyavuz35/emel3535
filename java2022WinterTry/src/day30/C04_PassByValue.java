package day30;

public class C04_PassByValue {
    //eger bır methotta yapılan degısıklıgın kalıcı olmasını ıstıyorsak
    //ıkı yontem kullanabılırız
    //1-varıabl ı class levelde statık olarak olusturabılırım


    static double etiketFiyati;
    static double indirimYuzdesi;


    public static void main(String[] args) {
        etiketFiyati = 100;
        indirimYuzdesi = 10;
        kaliciIndirimYap();
        indirimYuzdesi = 15;
        kaliciIndirimYap();
        indirimYuzdesi = 5;
        kaliciIndirimYap();

    }
    public static void kaliciIndirimYap(){
        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100;
        System.out.println("indirimli fıyat:"+etiketFiyati);

    }

}
