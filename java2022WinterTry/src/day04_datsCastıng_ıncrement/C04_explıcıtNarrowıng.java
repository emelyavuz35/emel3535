package day04_datsCastıng_ıncrement;

public class C04_explıcıtNarrowıng {

    public static void main(String[] args) {

        int sayı1=879;
        double sayı2=10;

        double sayı3=sayı1/sayı2;
        System.out.println(sayı3);
         int sayı4= (int) (sayı1/sayı2);

        System.out.println(sayı4);

       int sayı5=140;
       byte sayı6= (byte) sayı5;

        System.out.println(sayı6);

        sayı5=44;
        sayı6=(byte)sayı5;
        System.out.println(sayı6);




    }
}
