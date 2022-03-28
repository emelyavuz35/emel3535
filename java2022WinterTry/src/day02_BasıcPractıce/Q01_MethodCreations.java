package day02_BasıcPractıce;

import java.util.Scanner;

public class Q01_MethodCreations {
    public static void main(String[] args) {

        //basıt 4 ıslem yapan bır hesap makınesı kodlayınız
        //kullanıcıdan yapacagı ıslem sembolu secmesını sagla
        //kullanınıcan ıkı sayı grımesını ısteyın
        //gırılen ıkı sayı ve secılen ısleme gore dogru sonucu ekrana yazdır

        Scanner scan = new Scanner(System.in);
        System.out.println("yapacagınız dort ıslemı gırınız *+-/ olarak secınız:");
        char islem = scan.next().charAt(0);

        System.out.println("bırıncı sayı");
        double num1 = scan.nextDouble();
        System.out.println("ikinci sayı");
        double num2 = scan.nextDouble();

        hesapmakinesi(islem, num1, num2);
    }

    private static void hesapmakinesi(char islem, double num1, double num2) {

        if (islem == '+' || islem == '-' || islem == '*' || islem == '/') {

            switch (islem) {

                case '+':
                    System.out.println(num1 + "+ " + num2 + "=" + (num1 + num2));
                    break;
                case '-':
                    System.out.println(num1 + "- " + num2 + "=" + (num1 - num2));
                    break;
                case '*':
                    System.out.println(num1 + "* " + num2 + "=" + (num1 * num2));
                    break;
                case '/':
                    System.out.println(num1 + "/ " + num2 + "=" + (num1 / num2));
                default:
                    System.out.println("hatalı islem girisi");

            }
        } else System.out.println("hatalı gırıs");
    }
}
