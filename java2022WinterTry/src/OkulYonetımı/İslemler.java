package OkulYonetımı;

import day00_HomeworkAndQuestıon.ArrayList;

import java.util.Scanner;

public class İslemler {

    //static ArrayList<Kisi>OgrenciListesi=new ArrayList();
    //static ArrayList<Kisi>OgretmenListesi=new ArrayList();
    static Scanner scan=new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli(){
        System.out.println("==================\n Ogrenci ve ogretmen paneline hosgeldın"+"================================" +
                "=\n" +"1-ogrenci islemleri\n2-ogretmen isşlemleri\nQ-cıkıs");
        System.out.println("işlemi seciniz");
        String secim=scan.next().toUpperCase();
        switch (secim){
            case "1":
                kisiTuru="ogrenci";
                islemMenusu();
                break;
            case "2":
                kisiTuru="ogretmen";
                islemMenusu();
                break;
            case "Q":
                cıkıs();
                break;
            default:



                System.out.println("hatalı giris yaptınız");
                girisPaneli();
                break;
        }
    }

    private static void cıkıs() {
        System.out.println("eline saglık yıne beklerız");
    }

    public static void islemMenusu(){
        System.out.println("sectıgınız kısı turu"+kisiTuru+"ıcın asagıdakı ıslenmlerden bırını yapınız\n===işlemler" +
                ""+"1-ekleme\n");

        //devamı var


        int secılenIslem=scan.nextInt();
        int secilenIslem = 0;
        switch (secilenIslem){
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                islemMenusu();
                break;
            case 3:
                islemMenusu();
                break;
            case 4:
                islemMenusu();
                break;
            case 0:
                break;
            default:
                System.out.println("dogru rakam gırınız");

        }


    }

    public static void ekle() {
        System.out.println("    *****  "+kisiTuru+"ekleme sayfası***");
        System.out.print("ad soyad gırınız");
        String adsoyad=scan.nextLine();

        System.out.print("ad soyad gırınız");
        String kimlikNo=scan.nextLine();

       System.out.print("ad soyad gırınız");
        int  yas=scan.nextInt();

        if (kisiTuru.equals("Ogrenci")){
            System.out.println("Ogrenci no gırınız");
            String ogrenciNo=scan.nextLine();
            System.out.println("sınıf gırınız");
            String sınıf=scan.nextLine();
            Ogrenci sefilOgrenci=new Ogrenci(adsoyad,kimlikNo,yas,ogrenciNo,sınıf);//p li cons ogrencı objesı create edıyor
           // OgrenciListesiadd(sefilOgrenci);
        }else{
            System.out.println("sicil no gırınız");
            String sicilNo=scan.nextLine();
            System.out.println("bolum gırınız");
            String bolum=scan.nextLine();
        }



    }


}
