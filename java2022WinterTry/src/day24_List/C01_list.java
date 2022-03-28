package day24_List;

import day23_MultıDımensionalArrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_list {

    public static void main(String[] args) {

        int arr[]={};
        // bu arraya 5 ekleyelım

        arr=C06_Arrays.arrayeElemanEkle(arr,5);
        System.out.println(Arrays.toString(arr));//5

        //bırde 3 ekleyelım

        arr=C06_Arrays.arrayeElemanEkle(arr,3);
        System.out.println(Arrays.toString(arr));//[5,3]

        //bır de 3 ekleyelım
        arr=C06_Arrays.arrayeElemanEkle(arr,2);//[5,3,2]

        // eger bır lıst olusturcaksak List<Strıng>list3=newArrayList<>();
        //yazdırmak ıcın sour(list3);yazdırırsın

        //BIR LIST OLUSTURALIM
         List<Integer> sayilarList=new ArrayList<>();
        System.out.println(sayilarList);

        sayilarList.add(5);//[5]
        sayilarList.add(3);//[5,3]
        sayilarList.add(0,7);//[7,5,3]
        sayilarList.add(2,7);//[7,5,7,3]














    }
}
