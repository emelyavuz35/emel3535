package day23_MultıDımensionalArrays;

public class C06_Arrays {
    public static void main(String[] args) {

        //verılen bır arraya yenı bır element ekleyen bır method olusturun

        int arr[]={3,5,7};
        int eklenecekElement=4;

       arr= arrayeElemanEkle(arr,eklenecekElement);
    }

    public static int[] arrayeElemanEkle(int[] arr, int eklenecekElement) {

        int yeniArray[]=new int[arr.length+1];

        for (int i = 0; i <arr.length ; i++) {
            yeniArray[i]=arr[i];

        }
        yeniArray[yeniArray.length-1]=eklenecekElement;
        return yeniArray;
    }
}
