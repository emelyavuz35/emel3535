package day25_Lists;

import java.util.ArrayList;
import java.util.List;

public class C03_ListtenİstenmeyenElemenleriSilme {
    public static void main(String[] args) {

        //verılen bır arrayden ıstenen elementi(kac tane varsa), sılıp kalanları
        //yenı bır array olarak yazdıran bır method olusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=3;

        istenmeyenElementiSilveYazdır(arr,istenmeyenEleman);
    }

    public static void istenmeyenElementiSilveYazdır(int[] arr, int istenmeyenEleman) {
        List<Integer> yeniList=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++)  //3 ve 5 olsun ıstemıyorum o zaman ıstenmeyen elemanın yanına || kullan
            if (arr[i]!=istenmeyenEleman){
                yeniList.add(arr[i]);
            }

        System.out.println(yeniList);

    }
}
