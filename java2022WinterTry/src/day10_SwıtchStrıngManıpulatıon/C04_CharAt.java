package day10_SwıtchStrıngManıpulatıon;

public class C04_CharAt {
    public static void main(String[] args) {

        String str= "Java Cok Guzel";

        System.out.println(str.charAt(0));

        System.out.println(str.charAt(9));

        System.out.println(""+str.charAt(2)+str.charAt(3));

        System.out.println(str.toUpperCase().charAt(5)+
                           ""+str.toLowerCase().charAt(6)+str.toUpperCase().charAt(7));

        System.out.println(str.charAt(14-1));



    }
}
