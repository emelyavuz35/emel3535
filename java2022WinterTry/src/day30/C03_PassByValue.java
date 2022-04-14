package day30;

public class C03_PassByValue {
    public static void main(String[] args) {

        double etiketFiyat=100;
        yuzdeonindirimyap(etiketFiyat);
        yuzdeonindirimyap(etiketFiyat);
        System.out.println("ıkı ındırımden sonra maın method ta etıket fıyatı"+etiketFiyat);
        // java pass by value bır proglamlama dılıdır
        //yanı bır prımıtıve varıable ı argument olarak bır methoda yollarsanız
        //java o varıable yı degıl ,degerını yanı valur methoda aktarır()pass
    }

    public static void yuzdeonindirimyap(double etiketFiyat) {

        etiketFiyat=etiketFiyat * 0.90;
        System.out.println("sizin için %10 ındırımlı fıyatımız"+ etiketFiyat);
    }
}
