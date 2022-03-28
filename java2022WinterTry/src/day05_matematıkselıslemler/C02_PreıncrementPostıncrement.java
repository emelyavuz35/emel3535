package day05_matematıkselıslemler;

public class C02_PreıncrementPostıncrement {
    public static void main(String[] args) {

        int sayı1=10;
        int sayı2=20;
        int sayı3=30;

        sayı2=sayı1++;
        System.out.println(sayı1 + ","  + sayı2 +","  +  sayı3);

        sayı3=++sayı1;

        System.out.println(sayı1 + ","  + sayı2 +","  +  sayı3);

        System.out.println(sayı3++);

        System.out.println(--sayı2);






    }
}
