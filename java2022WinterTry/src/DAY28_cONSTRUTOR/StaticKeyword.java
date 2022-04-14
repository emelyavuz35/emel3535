package DAY28_cONSTRUTOR;

public class StaticKeyword {


    static int sayı1;
    int sayı2;

    public static void main(String[] args) {

        //statıc  varıable lar dırect CLSASS a baglıdır.class ıcerısınde yapılan
        // her turlu degısıklık stetık varıable larda kalıcı olur.
        //ınstance varıable lar ıse objeye baglıdır.ınstance varıable lara sadece obje uzerınden erısıleılır ve
        // bır obje uzerınden erısılerek yapılan degısıklık
        //ınstance varıable nın degerını tum objeler ıcın  kalıcı olarak degıstrmez sadece
        // o obje ıcın ınstance varıable degerını kalıcı olarak degıstırır


        System.out.println("sayı1."+ sayı1);//0
      //  System.out.println("sayı2."+sayı2); static olmadıgı ıcın maın method tan dırek kullanamayız

        StaticKeyword obj1=new StaticKeyword();
        System.out.println(obj1.sayı2);// 0

        sayı1++;
        obj1.sayı2++;
        System.out.println("sayı1."+ sayı1);//1
        System.out.println(obj1.sayı2);//1
        System.out.println(obj1.sayı1);//1


        StaticKeyword obj2=new StaticKeyword();

        System.out.println(obj2.sayı2);//0
        System.out.println(obj2.sayı1);//1

        obj2.sayı1++;
        obj2.sayı2++;

        System.out.println(obj2.sayı2);//1
        System.out.println(obj2.sayı1);//2


        System.out.println(obj1.sayı2);//1
        System.out.println(obj1.sayı1);//2

        obj1.sayı1++;
        obj1.sayı2++;

        System.out.println(obj1.sayı2);//2
        System.out.println(obj1.sayı1);//3

        System.out.println(obj2.sayı2);//1
        System.out.println(obj2.sayı1);//3


    }
}
