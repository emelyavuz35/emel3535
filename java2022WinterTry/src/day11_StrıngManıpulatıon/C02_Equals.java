package day11_StrıngManıpulatıon;

public class C02_Equals {
    public static void main(String[] args) {


        String str1="Ali";
        String str2="Alı"+"Can";

        System.out.println("str1:"+str1);
        System.out.println("str2:"+str2);

        System.out.println("== ile karsılastır" + (str1 ==str2));
        System.out.println("equals ıle karsılastır :" +str1.equals(str2));

        String str3=str1 +"";
        System.out.println("== ile karsılastır" + (str3 ==str2));
        System.out.println("equals ıle karsılastır :" +str3.equals(str2));


        String str5="hasan";
        String str6="HASAN";

        System.out.println(str5.equals(str6));
        System.out.println(str5.toUpperCase().equals(str6));


    }
}
