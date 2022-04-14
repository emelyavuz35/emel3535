package day38_inheritance_overriding;

public class Isci extends Personel{

    public String statu="Isci";
    public String haklar="Isciler kıdem tazmınatı alır";
    public String ikramiye="isciler yılda bır ıkramıye alır";



    public void mesai(){
        System.out.println("tum isciler haftalık 40 saat calısır");
    }
    public void maasHesapla(){
        System.out.println("Tum isciler 30gun*8 saat*11 euro= " + (30*8*11) + " euro maas alır");
    }
}
