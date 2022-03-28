package day19_DoWhıleLoop;

public class c01_WhıleLoop {
    public static void main(String[] args) {


        //kullanıcıdan bır sayı alın
        //bu sayıyı tam bolen sayıları ve toplam kac tane olduklarını yzdırın

        int input=30;
        //for loop ılede yapabılırız.sayma mıktarı bellı.ıkısylede olur
        //bız whıle loopla yapalım

        int bolen=1;
        int sayac=0;

        while (bolen<=input){

            if (input%bolen==0){
                System.out.print(bolen +" ");
                sayac++;
            }
            bolen++;
        }

        System.out.print(" ");
        System.out.println(input+" sayını bolen "+ sayac+ " adet sayı vardır ");
    }
}
