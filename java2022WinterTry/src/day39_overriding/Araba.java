package day39_overriding;

public class Araba {
    String hareket="Arabalar teker ıle hareket eder";
    String hız="Arabalar motor gucune gore hız yaparlar";
    String yakıt="Arabalar farklı yakıtlar kullanabılır";
    String marka="Arabalar uretıldıklerı markaya sahıptır";

    public void motor(){
        System.out.println("arabalar farklı markalarda motor kullanırlar");
    }
    public void yakıtTuketimi(){
        System.out.println("arabalar motor gucu ve yakıt turune gore yakıt tuketir");
    }
}
