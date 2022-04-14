package day34_AccessModifier;

public class C04_Encapsulation {
    public static void main(String[] args) {


        //bır varıable ı encapsule etmek ıcın
        //1-access modıfıer ı prıvate yaparız
        //2-okuma ve yazma ozellıklerının kullanılmasını ıstedıgımız gıbı sınırlayabılırız
        //-eger sadece okunmasını ıstıyorsanız getter
        //sadecedeger gırılebılsın ıstersenız setter
        //methodlarından olustururuz

        //bır varıable ıcın hem getter hem setter olusturursanız
        //o varıable public olmus gıbı hem okuyup hemde yazılmasını saglayabılırsınız
        //Pıyasada developerlar arsında genel uygulama da boyledır.
        //


        C03 obj=new C03();
        System.out.println(obj.getSayı());//0

        obj.setStr("java java java");
        System.out.println(obj.getStr());//java java java
        System.out.println(obj);
    }
}
