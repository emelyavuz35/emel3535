package day34_AccessModifier;

public class C01 {

    private static int sayi=10;
    private static String str="Java";
    static int acikSayi=20;  // access modifier'i default Access Modifier
    String acikString="Hi"; // access modifier'i default Access Modifier
    public static int halkaAcikSayi=15;
    protected  static int aileyeozel=40;
    protected C01(){
        // bu constructor'in access modifier'i
        // default access modifier'dir
        // dolayisiyla icinde oldugumuz paketin disinda
        // bu class'dan obje olusturulamaz
    }
    private C01(int numara){
        System.out.println("parametreli Constructor calisti");
    }
    private void method1(){
    }
}
