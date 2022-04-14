package AdvanceProje1;

import java.util.Scanner;

public class P4Count {
    public static void main(String[] args) {

       /* Kullanıcı tarafından girilen inputda kac tane 'b' karakteri olduğunu belirle ve print et.
        input: Test
        output b: 0
        output 0 olmalı
        input: bucket
        b:1
        output 1 olmalı
                */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır kelıme gırınız");
        String kelime= scan.nextLine();
        int count=0;


        for (int i = 0; i <= kelime.length(); i++) {
            if (kelime.charAt(i)=='b'){
                count++;

            }

        }

        System.out.println(count);



    }
}
