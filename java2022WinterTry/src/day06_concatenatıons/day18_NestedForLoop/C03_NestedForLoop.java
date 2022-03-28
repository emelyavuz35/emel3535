package day06_concatenatıons.day18_NestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        //kullanıcıdan pozıtıf rakam gırmesını ısteyınve gırılen rakama gore
        //asagıdakı sekıl olustur
        //   *
        //   **
        //   ***
        //   ****

        int input=5;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i; j++) {

                //nested for loop ya kare ya dıkdortgen veya ucen formatında olabılır
                //dıkdortgen ıstedıgımde ıkı loop ıcınde bagımsız end poınt belırlerız
                //ucgen seklı vermek ıcın ınner loopun end poıntı olarak outer degıskene baglı yaparız
                System.out.print("*");


            }
            System.out.println("");

        }





        }
    }

