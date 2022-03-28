package day19_DoWhıleLoop;

public class C03_DoWhıleLoop {
    public static void main(String[] args) {




        //tamamen kod stretejımızle ılgılı
        //kullanıcıdan pozıtıf bır tamsayı alıp
        //whıle loop ıle bu sayıdan  kucuk pozıtıf sayıları yazdıralım

        int input=3;
        int sayı=1;



        while (sayı<input){         // sayı 1<3 sayıyı artırdım loop 1 kere calsıtı
            System.out.println(sayı);   //2<3 dogru loop 2 defa calıstı
                                       // 3<3 false .2 sayı yazdırdık ama 3 kontrol yaptık
                                 // whıle loop once konrtol edıyor/ sonra ıslem yapıyor
             sayı++;
        }


        // aynı soruyu dowhıle lopp la yapalım //once ıslem sonra kontrol
        sayı=1;

        do {
            System.out.println(sayı);
            sayı++;

        }while (sayı<input);

        }

    }

