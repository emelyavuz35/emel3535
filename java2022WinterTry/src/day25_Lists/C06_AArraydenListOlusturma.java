package day25_Lists;

import java.util.Arrays;
import java.util.List;

public class C06_AArraydenListOlusturma {
    public static void main(String[] args) {

        //verılen bır arrry 'ı lısteye cevırın

        String arr[]={"A","B","C"};
        List<String> arraydenList=Arrays.asList(arr);


        //ARRAYDEN LISTE CEVIRDIGIMIZ ZAMAN YENI LISTIN UZUNLUGUNU DEGISTIREMEYIZ
        //dolayısıyla bu yenı lıst ıle add , remove , clear gıbı methodlar calıstırma
        // ıstedıgımızde  Exceptıon olusur
       // arraydenList.add("J");//UnsupportedOperationException
        System.out.println("19.satırda list:"+arraydenList);

        arr[1]="F";

        System.out.println("23.satırda Array:"+Arrays.toString(arr));
        System.out.println("24.satırda Array."+arraydenList);


        arraydenList.set(0,"Y");
        System.out.println("23.satırda Array:"+Arrays.toString(arr));
        System.out.println("24.satırda Array."+arraydenList);
    }
}
