package day12_StrıngManıpulatıon;

import com.sun.jdi.IntegerValue;

public class C02_substrıng {
    public static void main(String[] args) {

        //1-48 of results for "nutella"
        //bu arama sonucundakı bulunan sonuc sayısı 100 den cok ıse" super"
        //az ıse "az sonuc bulundu"

        String str="1-48 of 104 results for \"nutella\"";

        int ılkspace=str.indexOf(" ");// 4 verecek

        int ıkıncıspace=str.indexOf(" ",ılkspace+1);

        int ucuncuspace=str.indexOf(" ", ıkıncıspace+1);

        String aramaSonucSayısı=str.substring(ıkıncıspace+1,ucuncuspace);
        System.out.println(aramaSonucSayısı);

        int aramaSonucSayısıInt= Integer .valueOf(aramaSonucSayısı);
        if (aramaSonucSayısıInt>100) {
            System.out.println("Super");
        }else {
                System.out.println("az sonuc bulundu");
            }
        }


    }

