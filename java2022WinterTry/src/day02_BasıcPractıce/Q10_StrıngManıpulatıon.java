package day02_BasıcPractıce;

public class Q10_StrıngManıpulatıon {
    public static void main(String[] args) {

        // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

        String str1="   Java ogrenmek123 Cok guzel@      ";

        str1=str1.trim().replaceAll("\\d","").replace(" ","x")
                .replaceAll("\\W","").replace("x","")
                .replace("C","c");


        System.out.println(str1);
    }


}
