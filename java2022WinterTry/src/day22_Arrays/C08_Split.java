package day22_Arrays;

public class C08_Split {
    public static void main(String[] args) {
        //verılen cumlede ıstenen harfın kac defa kullanıldıgını yazdu-ıran bır methot olusturun

        String cumle="Nerede o hello world yazdıramayan ogrenciler";
        String harf="e";
        
        harfkackerekullanılmıs(cumle,harf);
    }

    private static void harfkackerekullanılmıs(String cumle, String harf) {

        int sayac=0;
        String karakterler[]=cumle.split("");
        for (int i = 0; i < karakterler.length; i++) {
            if (karakterler[i].equals(harf)){
                sayac++;
            }

        }

        System.out.println("aradıgınız harf "+" verılen cumlede " +sayac+ " adet kullanılmıs");
    }
}
