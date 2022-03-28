package day12_StrıngManıpulatıon;

public class C01_IndexOf {
    public static void main(String[] args) {

        // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //      - Girilen kelime cumlede kullanilmamis.
        //      - Girilen kelime cumlede 1 kere kullanilmis.
        //      - Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle="Java ogren , yenı bır program ıle yenı bır sayfa ac";
        String kelıme="yenı";

        int ilkkullanım= cumle.indexOf(kelıme);
        int ıkıncıkullanım=cumle.indexOf(kelıme,ilkkullanım +1);

        if (ilkkullanım==-1){     //eger cumlede ıstedıgımızı bulamazda -1 donuyor
            System.out.println("Girilen kelime cumlede kullanilmamis");

        }else if (ıkıncıkullanım==-1){ //cumlede var. 1 var mı 2.yok
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");

        }else{
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis");
        }






    }
}
