package AdvanceProje1;

import java.util.Scanner;

public class P05Days {

    public static void main(String[] args) {

       /* Veri tipi int olan variable(değişken) verildiğinde
        Eger int 1 ise print monday
        Eger int 2 ise print tuesday
        Eger int 3 ise print wednesday
        Eger int 4 ise print thursday
        Eger int 5 ise print friday
        Eger int 6 ise print saturday
        Eger int 7 ise print sunday
        Eger int 8 den buyuk ise  print "this is not a valid day"
        NOT : BU PROBLEMI ÇÖZERKEN SWITCH STATEMENT KULLANIn
        */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bır gun numarası gırın");
        int gun= scan.nextInt();

        switch(gun){
            case 1:
            System.out.println("monday");
            break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Lutfen gecerlı bır gun numarası gırın");

        }



    }

}
