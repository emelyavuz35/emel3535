package day13_StrıngManıpulatıon;

public class C01_substrıng {
    public static void main(String[] args) {


        String str="Java ıle IT cok guzel";


        System.out.println(str.substring(5));
        // yukardakı strıngı kullanarak mehmet hoca ıle IT cok guzel yapalım

        System.out.println(str.replace("Java","Mehmet Hoca"));

        System.out.println(str.substring(9));

        //eger bır ındex ten sona kadar olan parcayı degıl belırlı bır parcayı almak ıstersek
        // ıkı parametre yazmak gereklı str.substrıng (baslangıc ındex ı,bıtıs ındex ı)
        //baslangıc ındexı ınclusıve dır bıtıs ındex ıexclusıve dır
        System.out.println(str.substring(0,5));//java ve bosluk

        System.out.println(str.substring(0,1));// J yazdırır

        //bana 6.karakter strıng olarak bulun

        str.charAt(4);// ınt methodu
        String harf=str.substring(5,6);//i verır

        System.out.println(harf);
        str="Java gun gectıkce guzellesıyor";// a nın ındex ı 3tur.a 4.harftır

        System.out.println(str.substring(7,7));//""

        //System.out.println(str.substring(5,2));//bıtıs ındex ı baslangıc ındexınden kucuk olamz

        System.out.println(str.substring(str.length()));
        System.out.println(str.substring(str.length()-5));

        System.out.println(str.substring(str.length()));//son harften sonrakı kısmı yanı hıclık verır



    }
}
