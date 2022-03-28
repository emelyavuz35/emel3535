package day25_Lists;

import java.util.ArrayList;
import java.util.List;

import static day25_Lists.C04_ListedenTekrarlıElemenleriSilme.takrarsizListeOlustur;

public class C05_ListTekrarsızYap {
    public static void main(String[] args) {

        //verılen bır lıstede tekrar edılen sayıları sadece bır tane yapan
        //bır method olusturun
        //orn:[1,3,5,3,5,6,1,7] bu liste
        //yeni list=[1,3,5,6,7] bu hale donusturun

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        sayilar= tekrarsizListeOlustur(sayilar);
        System.out.println(sayilar);
    }
    public static List<Integer> tekrarsizListeOlustur(List<Integer> sayilar) {


        List<Integer> tekrarsizList = new ArrayList<>();
        for (int i = 0; i <sayilar.size() ; i++) {
            if (!tekrarsizList.contains(sayilar.get(i))){
                tekrarsizList.add(sayilar.get(i));
            }
        }
        return tekrarsizList;

    }
}
