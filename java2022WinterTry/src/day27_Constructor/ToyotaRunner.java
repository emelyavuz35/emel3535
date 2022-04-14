package day27_Constructor;

public class ToyotaRunner {
    public static void main(String[] args) {
        toyota t1=new toyota();
        System.out.println(t1.marka);//Toyota
        System.out.println(t1.tekerAdedi);//4
        System.out.println(t1.model);//null
        t1.model="Corolla";
        t1.yakit="benzın";
        t1.yil=2022;
        System.out.println("t1 model :"+t1.model+",yakıt:"+t1.yakit+",yıl:"+t1.yil);
        t1.maxHiz();


        toyota t2=new toyota();
        System.out.println(t2.model);//null
        t2.model="yarıs";
        t2.yakit="benzın";
        t2.yil=2021;
        System.out.println("t1 model :"+t2.model+",yakıt:"+t2.yakit+",yıl:"+t2.yil);
        t2.renkTercihleri();
    }
}
