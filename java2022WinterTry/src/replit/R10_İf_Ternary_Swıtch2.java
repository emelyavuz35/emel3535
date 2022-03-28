package replit;

import java.util.Scanner;

public class R10_İf_Ternary_Swıtch2 {
    public static void main(String[] args) {

        //Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
        // Input :John White
       // 1234234534561478

        //Output : Name :
       // J* W**
       // CCN : ** ** **** 1478
       // Ilk Harfler Buyuk harf ile baslamalidir.


        String str1="John";
        String str2="White";
        String str3="1234234534561478";

        String yeniIsım=(str1.substring(0,1).toUpperCase()+ str1.substring(1).replaceAll("\\w","*"));

        String yeniSoyisim=str2.substring(0,1).toUpperCase()+ str2.substring(1).replaceAll("\\w","*");

        String yenistr3=str3.substring(0,(str3.length()-4)).replaceAll("\\w","*") +(str3.substring(str3 .length()-4));


        System.out.println("yeni isim: "  + yeniIsım );
        System.out.println("yeni soyisim: "  + yeniSoyisim);   //suppeeerrrr
        System.out.println("CCN : "  + yenistr3);


    }
}
