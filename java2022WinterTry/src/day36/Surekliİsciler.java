package day36;

public class Surekliİsciler extends Isci {


    public static void main(String[] args) {

        Surekliİsciler surIc1 = new Surekliİsciler();
        surIc1.persNo = 5001;
        surIc1.isim = "Cem";
        surIc1.soyİsim = "aydın";
        surIc1.statu = "ıscı";
        surIc1.saatUcreti = 11;
        surIc1.maas = surIc1.maasHesapla();
        System.out.println(surIc1);


    }

    @Override
    public String toString() {
        return "Surekliİsciler{" +
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