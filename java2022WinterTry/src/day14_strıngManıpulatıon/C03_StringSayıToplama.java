package day14_strıngManıpulatıon;

public class C03_StringSayıToplama {
    public static void main(String[] args) {

        //strıng seklınde verılen asagıdakı fıyatları toplamını bul
        //strın str
        //strıng str
        //ıpucu Double .parsedouble() metodunu kullan



        String str1="$13.99";
        String str2="$10.55";

        str1=str1.replaceAll("\\D","");//1399 ama strıng olarak
        str2=str2.replaceAll("\\D","");//1055  ama strıng olarak

        double str1sayı=Double.valueOf(str1);
        double str2sayı=Double.valueOf(str2);

        double sonuc=(str1sayı+str2sayı)/100;//tekrar vırdul olması ıcın
        System.out.println("verılen sayıların toplamı: $"+ sonuc);


    }
}
