package day02_BasıcPractıce;

import java.util.Scanner;

public class Q04_İfStatements {
    public static void main(String[] args) {
        /*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen is unvanınızı gırın");
        String jobTitle=scan.nextLine().toLowerCase();

        if (jobTitle.equals("qa")){
            System.out.println("Qualıtıy Analyst");
        }else if (jobTitle.equals("dev")){
            System.out.println("developer");
        }else if (jobTitle.equals("ba")){
            System.out.println("busınnes analyst");
        }else if (jobTitle.equals("pm")){
            System.out.println("project manageer");
        }


    }
}
