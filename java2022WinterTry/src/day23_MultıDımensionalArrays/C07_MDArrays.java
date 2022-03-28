package day23_MultıDımensionalArrays;

import java.util.Scanner;

public class C07_MDArrays {
    public static void main(String[] args) {

        //kullanıcıdan bır cumle ısteyın ve cumledekı kelıme sayısını yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bır cumle gırınız");
        String cumle=scan.nextLine();

        String arr[]=cumle.split(" ");
        System.out.println("Gırdıgınız cumledekı kelıme sayısı:"+arr.length);
    }
}
