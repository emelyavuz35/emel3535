package day23_MultıDımensionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {

        int arr[][]={{3,1,7},{6,10,2}};
        System.out.println(arr[0][2]);//7
        System.out.println(arr[1][1]);//10
        //ilk ınner arrayın tum elemenelerını yazdırın
        System.out.println(arr[0]);//arr [0] bır array oldugunsan dırkek yazdırılamaz

        System.out.println(Arrays.toString(arr[0]));//3,1,7

        System.out.println(Arrays.toString(arr));//[[I@30c7da1e, [I@5b464ce8]

        //MDArray de tum elemenlerı bır array olarak yazdırmak ıstersek

        System.out.println(Arrays.deepToString(arr));
    }
}
