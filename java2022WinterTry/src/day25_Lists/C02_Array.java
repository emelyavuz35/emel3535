package day25_Lists;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {

        //verılen bır arrayden ıstenen elementi(kac tane varsa), sılıp kalanları
        //yenı bır array olarak yazdıran bır method olusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=3;

        istenmeyenElementiSil(arr,istenmeyenEleman);
    }  //list yontemıyle daha kısa...


    public static void istenmeyenElementiSil(int[] arr, int istenmeyenEleman) {

        //1-istenmeyen element sayısını bulalım
        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==istenmeyenEleman){
                sayac++;
            }

        }
        //2-yenı array ı olusturalım
        int arrYeni[]=new int[arr.length-sayac];


        //3-eskı arrayden uygun olan elementlerı yenıye tası
        int index=0;
        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]!=istenmeyenEleman){
                arrYeni[index]=arr[i];
                index++;

            }

        }
        //4-yenı array  yazdırmak
        System.out.println(Arrays.toString(arrYeni));


    }
}
