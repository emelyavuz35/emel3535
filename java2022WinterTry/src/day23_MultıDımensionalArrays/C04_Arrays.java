package day23_MultıDımensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {

        //kullanıcıya kac elementlık bır array olusturacagını sorun
        //arrayı olusturup elemenlerı kullanıcıdan alıp array a atayın

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kac elementlı array istedıgınızı yazın");

        int uzunluk=scan.nextInt();//5
        int arr[]=new int [uzunluk];//[0,0,0,0,0]
        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Array ıcın"+(i+1)+"elemanı gırınız");
            arr[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));
    }
}
