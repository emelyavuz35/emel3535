package day02_BasıcPractıce;

public class Q15_Arrays {
    public static void main(String[] args) {
        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz
         * int[] arr= {5,7,-6,4,2,15,3,8,1};
         *  int=istenenToplam=9;
         */

        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;
        for (int i = 0; i <arr.length ; i++) {
            for (int j =i+1; j <arr.length ; j++) {//kendı kendıyle toplamaması ıcınj=i+1
                if (arr[i]+arr[j]==istenenToplam){
                    System.out.println(arr[i]+ "ve" +arr[j]+" toplamı: "+istenenToplam);
                }

            }

        }


    }
}
