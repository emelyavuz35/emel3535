package day36;

public class Child extends Parent{


    Child(){
        super();
        System.out.println("chıld constructor calıstı");

    }
    //tum class larda bız gormesek bıle javanın olusturdugu default constructor vardır
    //extends keyword kullanan classlardakı tum constructurların ılk satırında bız gormesek bıle
    //super constructor call vardır
    //yanı parent classın parametresız constructor ı

    public static void main(String[] args) {

        Child child=new Child();
    }
}
