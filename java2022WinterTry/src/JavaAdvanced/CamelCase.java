package JavaAdvanced;

public class CamelCase {
    public static void main(String[] args) {
        /*     Soru 1:
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
            büyük harfe çevirip geri döndüren metodun yazınız.
             input:
           I lIVe in uSa
      Result should be
           I Live In Usa
     */
        System.out.println(camelcase());


    }

    public static String camelcase() {
        String s1=" I Live In Usa";
        s1.trim().replaceAll("[ ]+"," ");
        String [] dizi=s1.trim().split(" ");
        String strDonen="";

        for (String str:dizi){

                  strDonen+=str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase()+"";
              }
              return strDonen.trim();

        }

    }








