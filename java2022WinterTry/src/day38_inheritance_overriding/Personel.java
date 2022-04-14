package day38_inheritance_overriding;

public class Personel {


    public String statu="personel";
    public String haklar="Tum personel esıt haklara sahıptır";
    public String izin="tum personel yılda 4 hafta ızın kullanabılır";


    public void mesai(){
        System.out.println("tum personel 5 gun, gunde 8 saat calısır");
    }
    public void maasHesapla(){
        System.out.println("Tum personel 30gun*8 saat*10 euro= " + (30*8*10) + " euro maas alır");
    }
}
