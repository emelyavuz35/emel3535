package day02_BasıcPractıce;

public class Q16_Arrays {
    public static void main(String[] args) {

        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */

        //outer ve ınner aaraylere dıkkat et

        String arr[][] = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};
        double toplam=0;

        for (int i = 0; i <3; i++) {//outer array ıcın
            for (int j = 0; j <3; j++) {//ınner arr
                if (arr [i][j].contains("$")){
                    toplam +=Double.parseDouble(arr[i][j].replace("$",""))*3.2;
                }else if (arr [i][j].contains("€")){
                    toplam +=Double.parseDouble(arr[i][j].replace("€",""))*4.2;
                }

            }

        }
        System.out.println("toplam="+toplam);//toplam=374.6
    }
}
