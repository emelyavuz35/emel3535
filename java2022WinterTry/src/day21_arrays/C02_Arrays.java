package day21_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String arr1[] = {"Ali", "Veli", "Ayse"};
        //array ıcındekı elementlere ulasabılmek ıcın ındex kullanırız

        System.out.println(arr1[0]);//ali

        arr1[1] = "Esila";
        System.out.println(arr1[1]);// Esıla

        // arrayın ıcındekı ındexı kullanarak elemenlere ulasabılır ve update edebılırız

        int arr2[] = new int[4];
        System.out.println(arr2[1]);//0
        System.out.println(arr2[3]);//0
       // System.out.println(arr2[5]);// array out of bounds yazdırır

        // arrayın tamamını yazdırmak ıstersek

        System.out.println(arr2); //[I@5b464ce8
                                 // array ler non prımıtıve olduklarından dırek yazdırmak ıstersek
                                  // java referans bılgısıı yazdırır

        for (int i = 0; i < 4; i++) {
            System.out.print(arr2[i] +"");

        }

        //array ı yazdırmak ıcın javadakı Arrays class ından toStrıng() methodu kullanılır

        System.out.println(Arrays.toString(arr2));//[0,0,0,0]
        arr2[1]=11;
        arr2[3]=22;
        System.out.println(Arrays.toString(arr2)); //[0,11,0,22]

    }
}
