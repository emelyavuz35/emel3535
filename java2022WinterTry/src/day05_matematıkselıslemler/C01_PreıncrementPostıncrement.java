package day05_matematıkselıslemler;

public class C01_PreıncrementPostıncrement {
    public static void main(String[] args) {

        int sayı=10;

        sayı++;
        System.out.println(sayı);

        sayı++;
        System.out.println(sayı);


        System.out.println(++sayı); // once artır sonra yazdır 13
        System.out.println(sayı); // sayı aynı kalırtanı 13

        System.out.println("post ıncrement satırında"  + sayı++);
        System.out.println("post ıncrementten sonra"  + sayı);



    }
}
