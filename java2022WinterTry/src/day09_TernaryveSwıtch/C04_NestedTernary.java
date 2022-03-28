package day09_TernaryveSwıtch;

public class C04_NestedTernary {
    public static void main(String[] args) {
        // verilen sayinin poztif mi negatif mi oldugunu kontrol edip
        // 0 veya pozitif sayi ise tek veya cift
        // negatif sayi ise -100'den buyuk veya kucuk
        // oldugunu belirleyen bir ternary yaziniz

        int sayı=123;

        if (sayı>=100){
            if (sayı%2==0){
                System.out.println("sayı pozıtıf ve cıft");

            }else{
                System.out.println("sayı pozıtıf ve tektır");
            }
        }else{
            if (sayı<-100){
                System.out.println("sayı -100 den kucuk negatıftır ");

            }else{
                System.out.println("sayı -100den buyuk veya negatıf");
            }


        }


        String sonuc=sayı>=0 ?
                (sayı%2==0 ? "pozıtıf cıft sayı":"pozıtıf tek sayı"):
                (sayı<-100 ? "-100 den kucuk negatıf sayı":"-100 den buyuk negatıf sayı" );
        System.out.println(sonuc);
    }
}
