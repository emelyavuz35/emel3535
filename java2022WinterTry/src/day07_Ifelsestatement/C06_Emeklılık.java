package day07_Ifelsestatement;

import java.util.Scanner;

public class C06_Emeklılık {
    public static void main(String[] args) {


        // kullanicidan yasini isteyin
        // 65 veya daha buyukse emekli olabilirsin
        // 65'den kucukse emekli olamazsin yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasınızı gırınız");
        int yas= scan.nextInt();

        if (yas>=65){
            System.out.println("Emekli olabilirsin");
        }else
            System.out.println("Emekli olamazsın");
        System.out.println("daha calısmalısın");

/*if statementlerde ıkı durumdan sadece ve sadece bırı calısır
ikisinin birden çalısma ıhtımalı yok

 */



    }
}
