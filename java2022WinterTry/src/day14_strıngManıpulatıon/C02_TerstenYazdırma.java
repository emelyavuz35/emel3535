package day14_strıngManıpulatıon;

public class C02_TerstenYazdırma {
    public static void main(String[] args) {

        //kullanıcın 4 harflı kelıme ıste=
        //ve kelımeyı tersen yazdırın
        //gırılen kelımeyı ılk harfı buyuk
        //dıgerlerı kucuk yazdır

        String input="Mavi";

        String tersstr=input.substring(3).toUpperCase()+
                       input.substring(2,3).toLowerCase()+
                       input.substring(1,2).toLowerCase()+
                       input.substring(0,1).toLowerCase();

        System.out.println(tersstr);// 4 harflı ınputtan degıstırıp yazdırabılırsın

    }
}
