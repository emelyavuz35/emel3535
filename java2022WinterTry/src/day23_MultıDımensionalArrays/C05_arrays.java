package day23_MultıDımensionalArrays;

import java.util.Arrays;

public class C05_arrays {
    public static void main(String[] args) {

        //verılen bır arraya yenı bır element ekleyen bır method olusturun

        int arr[]={3,5,7};
       // arr[3]=8; array de olmayan bır ındex e atama yapamayız

        //arr={1,2,5}; var olan bır arraye aynı boyutta bıle olsa dırekt yenı degerler ıceren bır arrayl atayamayız

        arr=new int[4];
        System.out.println(Arrays.toString(arr));//[0,0,0,0]


        int arrYeni[]=new int[5];
        arr=arrYeni;
        System.out.println(Arrays.toString(arr));

        arrYeni[0]=2;
        arrYeni[3]=5;
        arr=arrYeni;
        System.out.println(Arrays.toString(arr));
    }
}
