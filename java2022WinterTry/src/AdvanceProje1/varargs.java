package AdvanceProje1;


import java.util.Arrays;
import java.util.Scanner;

public class varargs {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * lari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int arr[]={1,2,3,4,5,6,7};
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i];

        }
        double ortalama=toplam/arr.length;
        System.out.println("ortalama:"+ortalama);
        System.out.println("ortalamadan buyuk elemanlar:");
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>ortalama){
                System.out.println(arr[i]+"");
            }

        }

    }


}





