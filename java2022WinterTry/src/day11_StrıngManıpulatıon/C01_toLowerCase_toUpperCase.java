package day11_StrıngManıpulatıon;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Java Guzeldır";

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")) );
    }
}
