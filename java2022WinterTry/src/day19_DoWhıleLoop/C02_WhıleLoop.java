package day19_DoWhıleLoop;

public class C02_WhıleLoop {
    public static void main(String[] args) {
        //kullanıcıdan bır sayı alın
        //bu sayının rakamları toplamını yazın


        int input=45678;
        int rakam=0;
        int rakamlartoplamı=0;

        while (input>0){                    //0 dan buyuk olunca calısacak
            rakam=input%10;                 //ınputu 10 a boldu rakam olarak aldı
            rakamlartoplamı +=rakam;        //buraya ekledı
            input/=10;
        }
        System.out.println(rakamlartoplamı);  // loopun dısında olması lazımyoksa tek tek yazdırır
    }
}
