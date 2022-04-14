package day42_Exceptions;

public class C02_CastException {

    public static void main(String[] args) {

        int sayı=10;
       // String str=sayı;CTE

        Object str3="java cok guzel";
        String str4=(String) str3;
        System.out.println(str4);

        Object sayı2=20;

        String str2=(String) sayı2;//explicit norrowing
                                 // ClassCastExceptıon//


    }



}
