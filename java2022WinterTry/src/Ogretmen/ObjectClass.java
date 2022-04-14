package Ogretmen;

public class ObjectClass {
    /*
     * Object Class’i olusturun burada OgretmenBilgileri Class indan
     * object ureterek yeni
     * ogretmenler olusturun ve bilgilerini yazdirin
     */
    public static void main(String[] args) {
         OgretmenBilgileri obj1=new OgretmenBilgileri();
         obj1.isim="Emel";
         obj1.soyisim="Yavuz";
         obj1.brans="Sınıf ogretmenı";
         obj1.tel="2323233445";
         obj1.yas=39;
        System.out.println("obj1:"+obj1);//referans degeri yazdırır


        OgretmenBilgileri obj2=new OgretmenBilgileri();
        obj2.isim="Celal";
        obj2.soyisim="Yavuz";
        obj2.brans="Fen bilgisi ogretmenı";
        obj2.tel="232334567";
        obj2.yas=39;

        System.out.println(obj1.isim+" "+obj1.soyisim+","+obj1.brans+","+obj1.tel+","+obj1.yas);
        System.out.println(obj2.isim+" "+obj2.soyisim+","+obj2.brans+","+obj2.tel+","+obj2.yas);
    }
}
