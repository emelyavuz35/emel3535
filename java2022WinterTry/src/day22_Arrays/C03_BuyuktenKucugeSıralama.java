package day22_Arrays;

import java.util.Arrays;

public class C03_BuyuktenKucugeSıralama {
    public static void main(String[] args) {

        //verılen bır array ı buyukten kucuge sıralayıp yazdıran bır method olusturun

        int arr[]={3,5,6,1,9,45,25,4,9,0};

        terstenSıralaYazdır(arr);//[45,25,9,9,6,5,4,3,1,0]

        //en buyuk sayıyı yazdır
        System.out.println(arr[0]);//0
    }

    public static void terstenSıralaYazdır(int[] arr) {

        Arrays.sort(arr);//[0,1,3,4,5,6,9,9,25,45]
        int tersArr[]=new int[arr.length];//[0,0,0,0,0,0,0,0,0,0]

        for (int i = 0; i<arr.length  ; i++) {
            arr[arr.length-1-i]=tersArr[i];

        }
        System.out.println(Arrays.toString(tersArr));


    }
}
