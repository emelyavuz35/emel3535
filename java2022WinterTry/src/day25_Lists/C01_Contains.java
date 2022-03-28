package day25_Lists;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {

        List<String> harfler=new ArrayList<>();
        harfler.add("D");//D
        harfler.add("M");//[D,M]
        harfler.add(1,"T");//[D,T,M]
        harfler.add(0,"T");

        System.out.println(harfler);//[T, D, T, M] jAva arrayde bır bosluk bırakır

        harfler.contains("T");
        System.out.println(harfler.contains("T"));//true
        System.out.println(harfler.contains("E"));//false


        List<String> karakterler=new ArrayList<>();
        karakterler.add("M");
        karakterler.add("T");

        System.out.println(karakterler.containsAll(karakterler));//true karakterler lıstesınde ne var.t ve m.

        karakterler.add("F");
        System.out.println(karakterler.containsAll(karakterler));//false
        //harfler dıye bır lıstem var.t,m,t,d.bıde karakterler var.t ve m.karakterleın tum elemenler harflerde var mı..tumu harflerde var
        //o zaman true donuyor.sonra bız f ekledık.tumu harflerde va rmı ?yok derız yanı false olur
    }
}
