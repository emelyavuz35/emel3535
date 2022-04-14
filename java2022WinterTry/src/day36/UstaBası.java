package day36;

public class UstaBası extends Isci {


    public static void main(String[] args) {

        UstaBası ustabası1 = new UstaBası();
        ustabası1.saatUcreti = 15;
        ustabası1.soyİsim = "gokcek";
        ustabası1.isim = "murat";
        ustabası1.maas = ustabası1.maasHesapla();
    }

    @Override
    public String toString() {
        return "UstaBası{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyİsim='" + soyİsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}