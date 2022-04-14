package day00_HomeworkAndQuestıon;

import day36.Surekliİsciler;

public class ReverseStrıng {
    public static void main(String[] args) {

        // Stringi ters cevirmek icin bir Java Programi yazin
        //1.Yol: StringBuilder () kullanarak
        //2.Yol: String Classini kullanarak
        //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
        String input="All is well";
        StringBuilder str=new StringBuilder();
        str.append(input);

        String reverseInput=str.reverse().toString();
        System.out.println("1.yol:"+reverseInput);


        //2.yol  ıle
        for (int i =input.length()-1; i >=0 ; i--) {
            System.out.print(input.charAt(i));

        }
        System.out.println();

        //3.yol Bir method olusturun, ardindan methodu main method dan cagirin

        inputTersarray(input);
    }

    private static void inputTersarray(String input) {
        char[]arr=input.toCharArray();

        for (int i = input.length()-1; i >=0 ; i--) {
            System.out.print(arr[i]);

        }
    }
}