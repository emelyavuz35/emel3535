package day30;

import java.util.Arrays;

public class C06_PassByValue {
    public static void main(String[] args) {
        //Non prımıtıve data turlerınde objenın kendısı degıl de
        //ıcındekı elementler degısırse
        //java objenın referansı ve objenın kendısı degısmedıgı.icin element degısıklıklerını kabul eder
        // .ve kalıcı yapar...

        int arr[]={1,2,3};
        System.out.println(Arrays.toString(arr));
        arrDegistir(arr);
        System.out.println("method call sonrası"+Arrays.toString(arr));//[5,6,3]
    }

    private static void arrDegistir(int[] arr) {

        arr[0]=5;
        arr[1]=6;
        System.out.println(Arrays.toString(arr));//[5,6,3]
    }

}
