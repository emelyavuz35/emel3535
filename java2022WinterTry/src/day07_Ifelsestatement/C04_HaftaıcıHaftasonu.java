package day07_Ifelsestatement;

import java.util.Scanner;

public class C04_HaftaıcıHaftasonu {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:      gun=Pazar output = “Hafta sonu”
        //      gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin
        // String case sensitive'dir
        // yani pazar, PAZAR,Pazar, PAzar bunlar hep farkli kelimelerdir
        // bu durumda String methodlarindan yardim aliriz

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bır gun ısmı yazınız");
        String gunısmı = scan.next().toLowerCase();// kullanıcı nasıl yazarsa yazsın hepsını kucuk harf yapar

        if (gunısmı.equals("pazar")|| gunısmı.equals("cumartesı"));{
            System.out.println("gırdıgınız gun haftasonu");
        }

        if (gunısmı.equals("pazartesı")|| gunısmı.equals("salı")||
        gunısmı.equals("carsamba")|| gunısmı.equals("persembe")|| gunısmı.equals("cuma")){
            System.out.println("gırdıgınız gun haftaıcı");
        }
    }
}




