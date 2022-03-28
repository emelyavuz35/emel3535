package day22_Arrays;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {
        String str="Java gun gectıkce guzellesıyor";

        String kelimeler[]=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        System.out.println(kelimeler[1]);

        String gectıkce[]=str.split("gectıkce");
        System.out.println(Arrays.toString(gectıkce));


    }
}
