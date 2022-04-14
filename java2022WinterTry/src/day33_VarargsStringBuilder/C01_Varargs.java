package day33_VarargsStringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {

        // kac tane strıng verırlırse verılsın ıclerınde en uzunu yazdıran method olusturun

        String str1="Ali";
        String str2="Veli";
        String str3="Oguzhan";
        String str4="Samet";
        //yazılan argument sayısı sabıtse her zamankı gıbı bır method olusturabılırız
                //ancak argument sayısı degısme sayısının degısme ıhtımalı varsa
        //o zanaan varargs tercıh edılır


        enUzunKelime(str1,str2,str3,str4);
    }

    private static void enUzunKelime(String... str) {
        String enUzunStr="";

        for (String each: str
        ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;
            }

        }
        System.out.println("en uzun kelıme:"+enUzunStr);
    }
}
