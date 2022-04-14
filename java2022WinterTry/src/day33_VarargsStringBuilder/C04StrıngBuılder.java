package day33_VarargsStringBuilder;

public class C04StrıngBuılder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Yasasın java");

        sb1.indexOf("Java");
        System.out.println(sb1.indexOf("java"));//8

        System.out.println(sb1.lastIndexOf("s"));//4
        System.out.println(sb1.indexOf("s"));//2

        System.out.println(sb1.replace(0,7,"Ne guzel"));

        System.out.println(sb1);//Ne guzel java

        System.out.println(sb1.toString().toUpperCase());//NE GUZEL JAVA

        System.out.println(sb1);//Ne Guzel Java

        System.out.println(sb1.delete(0,3));//guzel java

        System.out.println(sb1.deleteCharAt(5));//guzeljava
    }
}
