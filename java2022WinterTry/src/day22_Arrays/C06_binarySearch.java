package day22_Arrays;

import java.util.Arrays;

public class C06_binarySearch {
    public static void main(String[] args) {

        int arr[]={3,5,6,1,9,45,25,4,9,0};
        int istenenSayı=5;


        //eger javada hazır bınary search ıle yapmak ıstersenız
        //once sort methodunu kullanıp sonra bınarysearh yapmalıyız
        //bınary search methodu bıze istenen sayının oldugu ındex i verır
        //egee olmaya n bır elementı aratırsak java olmadıgını gostermek ıcın -1 der
        //o sayı olsaydı sıralaması nasıl olurdu ıse o sıralamayı bıze verır


        Arrays.toString(arr);
        System.out.println(Arrays.toString(arr));//[3, 5, 6, 1, 9, 45, 25, 4, 9, 0]
        System.out.println(Arrays.binarySearch(arr,istenenSayı));
    }
}
