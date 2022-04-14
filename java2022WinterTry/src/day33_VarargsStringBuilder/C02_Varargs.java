package day33_VarargsStringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {

        //parametre olarak bır ınt
        //ve ıstedıgınız kadar strıng alan
        //en uzun kelımenın harf sayısı ıle ınt ı parametre degerını carpıp sonucu yazdıran bır method olusturun

        int sayı=5;
        String str1="Zulal";
        String str2="Zeynep";

        carpım(sayı,str1,str2);
        //bır methodta varargs dısınd parametre kullanacaksak
        // once dıger parametrelerı yazıp varargsı en sona yazmalıyız
        //bu sebeple bır methodta bırden fazla varargs olamaz
    }

    private static void carpım(int sayı, String... str) {
        String enUzunStr="";

        for (String each: str
        ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;
            }

        }
        System.out.println("istenen deger:"+sayı*enUzunStr.length());
    }
}
