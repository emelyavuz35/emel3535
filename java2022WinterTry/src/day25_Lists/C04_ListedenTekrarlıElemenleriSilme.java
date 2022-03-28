package day25_Lists;

import java.util.ArrayList;
import java.util.List;

public class C04_ListedenTekrarlıElemenleriSilme {
    public static void main(String[] args) {

        //verılen bır lıstede tekrar edılen sayıları sadece bır kere yazdıran
        //bır method olusturun
        //orn:[1,3,5,3,5,6,1,7]
        //OUTPUT[1,3,5,6,7]

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        takrarsizListeOlustur(sayilar);
    }

    public static void takrarsizListeOlustur(List<Integer> sayilar) {

        List<Integer> tekrarsizList=new ArrayList<>();

                                                        // tekrarsız lıste bu sayıların ı ındexındekı elementı ıcerıyorsa .
        for (int i = 0; i <sayilar.size() ; i++) {      //basına unlem koydum ıcermıyorsa oldu
            if (!tekrarsizList.contains(sayilar.get(i))){
                tekrarsizList.add(sayilar.get(i));

            }

        }

        System.out.println(tekrarsizList);
    }
}
