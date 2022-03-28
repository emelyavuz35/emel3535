package day06_concatenatıons;

public class C01_Concatenations {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Guzel";

        int sayı1=5;
        int sayı2=3;

        System.out.println(str1+sayı1+str2);

        System.out.println(sayı1-sayı2+str2+(sayı1*sayı2));

        //Java22
        System.out.println(str1+(sayı1-sayı2)+(sayı1-sayı2));

        //53Guzel

        System.out.println(sayı1+(sayı2+str2));
        System.out.println(" " +sayı1+sayı2+str1);


    }
}
