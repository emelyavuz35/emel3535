package replit;

import java.util.Locale;
import java.util.Scanner;

public class R14_ifTERNARY {
    public static void main(String[] args) {

        //2 kelime oluşturun: isim1 ve isim2
        // isim1 çift sayıda karakter içeriyorsa,
        // ikinci kelimeyi ilk adın ortasına yerleştirin
        // ilk kelime tek sayida karakter iceriyorsa
        // “isim1, isim2 ye eklenemiyor” yazdırın
        // Örneğin:
        // isim1= mehmet
        // isim2= ahmet
        // Yazdır ==> mehahmetmet
        // isim1= memet
        // isim2= ahmet
        // Yazdır ==> isim1, isim2 ye eklenemiyor

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1.ismi giriniz");   String isim1=scan.nextLine().toUpperCase();
        System.out.println("Lutfen 2.ismi giriniz");   String isim2=scan.nextLine().toUpperCase();

        if (isim1.length()%2==0){
            System.out.println(isim1.substring(0, (isim1.length()/2)).concat(isim2).concat(isim1.substring(isim1.length()/2 )));
        }else
            System.out.println("isim cıft harfli olmadıgı icin ortasına yerlestiremedik");

    }
}
