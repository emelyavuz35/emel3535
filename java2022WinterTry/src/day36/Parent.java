package day36;

public class Parent {

    protected Parent(){
        System.out.println("parent parametresiz cons calıstı");
    }

   protected Parent(int sayı3,int sayı4){
        System.out.println("Parent ıkı parametreli cons");
    }

    protected int sayı;
}
