package day22_Arrays;

import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {

        //verılen bır array da en kucuk ve en buyuk degerlerı yazdırın

        int arr[]={3,5,6,1,9,45,25,4,9,};

        //sort methodu olamdan yapalım
        int enKucukSayı=Integer.MAX_VALUE;
        int enBuyukSayı=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]<enKucukSayı){

                enKucukSayı=arr[i];

            }

            if (arr[i]>enBuyukSayı){
                enBuyukSayı=arr[i];
            }

        }
        System.out.println("arraydekı en kucuk sayı :"+enKucukSayı);
        System.out.println("arraydekı en buyuk sayı:"+enBuyukSayı);
// arrayle kısa yoldan cozduk sort methoduyla

        Arrays.sort(arr);
        System.out.println("arraydekı en kucuk sayı:"+ arr[0]);
        System.out.println("en buyuk sayı:"+arr[arr.length-1]);

    }
}
