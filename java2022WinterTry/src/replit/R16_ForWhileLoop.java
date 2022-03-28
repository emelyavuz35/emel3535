package replit;

import java.util.Scanner;

public class R16_ForWhileLoop {
    public static void main(String[] args) {
       // Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        // ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
        //char ch1= 'a' ;
        //String name =“John came late"
        //Expected Output:
        //Number of a = 2

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String str= scan.nextLine();

        System.out.println("lutfen bır karakter gırınız");

        String karakter=scan.next();

        String arr[]=str.split("");
         int count=0;

        for (int i =0; i <arr.length ; i++) {
            if (arr[i].equals(karakter)){
                count++;
            }



        }
        System.out.println(count);





    }
}
