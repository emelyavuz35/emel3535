package day30;

public class  C05_PassVyValue {
    //kalıcı ındırım ıcın ıkıncı yontem

    public static void main(String[] args) {

        double etiketFiyatı=100;
        double indirimYuzdesi=10;

        kaliciIndirimYap(etiketFiyatı,indirimYuzdesi);
        System.out.println("maın method ta indirim sonrası etıket fıyetı:"+ etiketFiyatı);


        }


        public static double kaliciIndirimYap(double etiketFiyati,double indirimYuzdesi){
        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100;
            System.out.println("indirimli fıyat:"+etiketFiyati);
            return etiketFiyati;

        }
}
