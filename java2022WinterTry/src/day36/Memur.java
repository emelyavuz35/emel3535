package day36;

public class Memur extends Muhasebe{



    public static void main(String[] args) {
        Memur memur1=new Memur();


        //memur1 objesı Memur clasının objesı olmasına ragmen ınherıt ettıgı muhaseve ve onunda
        //parent ı olan personel class larındakı tum dataları alabılır


        //bunları personel classından aldık
        memur1.persNo=1001;
        memur1.isim="Ahmet";
        memur1.soyİsim="Tepecik";
        memur1.adres="Ankara";
        memur1.tel="3125756595";

        //muhasebe clasından
        memur1.saatUcreti=10;
        memur1.maas=memur1.maasHesapla();
        memur1.statu="Memur";
        System.out.println(memur1);

        Memur memur2=new Memur();
        memur2.persNo=1002;
        memur2.saatUcreti=10;
        memur2.maas= memur2.maasHesapla();
        System.out.println(memur2);





    }

           @Override
          public String toString() {
               return "Memur{" +
                       "saatUcreti=" + saatUcreti +
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
