package day00_HomeworkAndQuestıon;

import java.util.Locale;
import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın
        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bır kelıme gırınız");
        String str= scan.nextLine();

        int asayısı=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.toLowerCase().charAt(i)=='a'){
                asayısı++;
            }else if (str.toLowerCase().charAt(i)=='c'){
                break;
            }

        }
        System.out.println("girdiginiz mertındekı c karakterıne kadar olan a karakter sayısı"+asayısı);
    }
}
