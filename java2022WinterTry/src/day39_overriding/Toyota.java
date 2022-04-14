package day39_overriding;

public class Toyota extends Araba{


    protected String hız="Toyota araclar maz 220 km hız yaparlar";
    protected String marka="Toyota";
    String sirketMerkezi="japonya";



    public void motor(){
        System.out.println("Toyota arabalar farklı toyota marka motor kullanırlar");
    }
   public void garanti(){
       System.out.println("toyota araclar 10 yıl garantılıdır");
   }
    }








