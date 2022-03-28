package day14_strıngManıpulatıon;

public class C04_ıSIMgIZLEME {
    public static void main(String[] args) {

        //kullanıcıdan ısım soyısım ıste
        //M***** B*****
        //kartno **** **** **** 1234


        String isim="Oguzhan";
        String soyIsim="Balkaya";         // dınamık oldugu ıcın bu kısma ne yazarsan ona gore degıstırır
        String kkno="1234567890123456";

        String yeniIsım=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");




    }
}
