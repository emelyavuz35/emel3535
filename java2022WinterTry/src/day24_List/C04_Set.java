package day24_List;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("İlker");
        isimler.add("Oguzhan");
        System.out.println(isimler);

        isimler.set(1, "Seckin");//yusuf gıtıı yerıne seckın geldı
        System.out.println(isimler);//[Aykut, Seckin, İlker, Oguzhan]
        //daha onceden lıstede var olanlarıda arsıv gıbı tutmak ıstıyorsak
        List<String> logList = new ArrayList<>();

        //daha önceden lıstede var olanları da arsıv gıbı tutmak ıstersek

        logList.add(isimler.set(2,"Cosmos"));//2.ındex e gıtt ı ılkerı aldı yerıne cosmosu aldı
        System.out.println(isimler);//[Aykut, Seckin, Cosmos, Oguzhan]
        System.out.println(logList);//[ilker]


    }
}
