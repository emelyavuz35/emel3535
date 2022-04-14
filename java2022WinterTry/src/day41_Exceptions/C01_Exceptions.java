package day41_Exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c=0;
        try {
             c=a/b;

        } catch (Exception e) {//burada e  javanın exceptıonu atayan obje
                               //  exceptıon ıse exceptıonun turu
            e.printStackTrace();
        }
        System.out.println(c);



    }


}
