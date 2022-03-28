package day04_datsCastıng_ıncrement;

public class C06_Homework {

    public static void main(String[] args) {

        byte sayı1= 66;
        short sayı2= sayı1;
        System.out.println(sayı2);

        int sayı3= sayı2;
        System.out.println(sayı3);

        long sayı4= sayı3;
        System.out.println(sayı3);

        float sayı5= sayı4;
        System.out.println(sayı5);

        double sayı6= sayı5;
        System.out.println(sayı6);

        //soru 2

        int sayı7= 4;
        byte sayı8=(byte) sayı7;
        System.out.println(sayı8);

        int sayı9= 135;
        byte sayı10=(byte)sayı9;
        System.out.println(sayı10);

        //soru3
        float sayı11= 43f;
        System.out.println(sayı11);

        //soru4
        double sayı12=255.36;
        int sayı13= (int) (sayı12);
        System.out.println(sayı13);

        int sayı14= (byte) sayı13;
        System.out.println(sayı14);

        // soru5
        int sayı15= 41;
        int sayı16= 4;
        System.out.println(sayı15/sayı16);
         //soru 6
        int sayı17=235;
        double sayı18=1.3;
        System.out.println(sayı17/sayı18);
        int a=24;
        byte b=8;
        double c=4.2;
        System.out.println(a+b);
        System.out.println(b-c);
        System.out.println(b/c);










    }
}
