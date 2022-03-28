package day05_matematıkselıslemler;

public class C06_WrapperClass {
    public static void main(String[] args) {

        String str1="123456";
        String str2="23456";
        System.out.println( str1+str2 );

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
    }
}
