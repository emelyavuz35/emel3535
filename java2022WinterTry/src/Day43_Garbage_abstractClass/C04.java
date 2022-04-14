package Day43_Garbage_abstractClass;

public abstract class C04 {
    /*
    bır abstract classta abstract veya concret methodlar bulunabılır
    chıld class ların abstract methodları overrıde etmesı mecburı ıken
    concrete methodların overrıde edılmesı obsıyoneldır
     */


    public abstract void absMethod1();

    public void concreteMethod(){
        System.out.println("C04 concret method");

    }


    public static void main(String[] args) {
        /*
        abstract class lar cons sahıptır.ancak abstract classlardan obje OLUSTURULAMAZ

        abstract class lar obje BARINDIRMAYAN sadece chıld classlar ıcın uyulması sart olan
        veya obsıyonel bırakılan ozellıklerı tanımladıgımız bır depo class gıbıdır.
         */
       // C04 obj=new C04();

        System.out.println("bu class absract");
    }
}
