package package01;

public class C01_GetTotal {
    public static void main(String[] args) {
         /*
     3 tane pozitif String verildiğinde
     sayısal olmayan tüm karakterleri kaldırın.
     Stringleri int e çevirin
     ve total print edin
         Ornek:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output ----> 65; olmali
        NOT : Eğer output 0 dan küçük ise outputu -1 e cevir

       */
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";

        num1=num1.replaceAll("\\D","");
        num2=num2.replaceAll("\\D","");
        num3=num3.replaceAll("\\D","");

        //System.out.println( num1+num2+num3 );

        int sayı1=Integer.parseInt(num1);
        int sayı2=Integer.parseInt(num2);
        int sayı3=Integer.parseInt(num3);

        int toplam=(sayı1+sayı2+sayı3);
        System.out.println( toplam);





    }

}
