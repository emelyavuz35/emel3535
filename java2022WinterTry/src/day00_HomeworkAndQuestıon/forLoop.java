package day00_HomeworkAndQuestıon;

public class forLoop {
    public static void main(String[] args) {
       /* TASK :
        100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe).
        Ekran Çıktısı
        91
        78
        65
        52
        39
        26
        13

        */
         int sayı=100;
         int toplam=0;
        for (int i = 100; i >0 ; i--) {
            if (sayı%13==0){
                System.out.println(i);
                toplam+=i;
            }
            System.out.println(toplam);


        }
    }
}
