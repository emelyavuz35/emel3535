package day22_Arrays;

import java.util.Arrays;

public class C05_bınarySearch {
    public static void main(String[] args) {
        //verılen array da ıstenen bır elementın var olup olmadıgını true false yazdırarak
        //gosteren bır method olusturun


        int arr[]={3,5,6,1,9,45,25,4,9,0};
        int istenenSayı=5;

        istenenElemanVarMi(arr,istenenSayı);

        //eger javada hazır bınary search ıle yapmak ıstersenız
        //once sort methodunu kullanıp sonra bınarysearh yapmalıyız

        Arrays.sort(arr);

        Arrays.binarySearch(arr,istenenSayı);

    }

    private static void istenenElemanVarMi(int[] arr, int istenenSayı) {

        boolean sonuc=false;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]==istenenSayı){
                sonuc =true;
                System.out.println(sonuc);
                break;
            }

        }
        System.out.println(sonuc);
    }
}
