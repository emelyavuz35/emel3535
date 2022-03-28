package day22_Arrays;

import java.util.Arrays;

public class C01_Sort {
    public static void main(String[] args) {

        String arr[]={"E","M","L","C"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[tams] alfabetık sıralamaya koyar

        //javada bu sıralamaya natural order denır
        //sayı olursa kucukten buyuge,metın olursa alfabetık sıralamaya gore


    }
}
