package day19_DoWhıleLoop;

public class C05_Scope {

    static String kurs="Java";
    int level=10;



    public static void main(String[] args) {

        // not 1= bır method ıcerısınde olusturulan varıable lar sadec eolusturulduklaru method ta kullanılabılırler
        //baska methodlarda kullanılamazlar
        //2=tum methodların kullanabılmesını ıstedıgımız varıablaları
        //class level da olustururuz
        //class levelde olusturdugumuz varıableyı statıc yaparsak tum method lar kullanabıkır
        //-- statıc olmazsa(ınstance) o zaman sadece statıc olmayan methodlar kullanabıkı
        // 3-loop ıcınde olusturulan varıable lar loop ıcerısınde kullanılabılır
        //ama loop dısında kullanılmaz


       int sayı=10;

    }
    public static void  method(){

    }

    public void method2(){

    }
}
