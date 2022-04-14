package day37_Inheritance;

import day36.Parent;

public class Child extends Parent {
    //bır class ı chıld class yaptıgımızda
    // parent class takı constructor a
    //ulasması gerekır.Bu durumda parent classtakı
    //constructor un acces modıfıerı uygun bır
    // modıfıer yapılmalıdır.


    Child(){
        super();
        System.out.println("child class parametresiz cons");
    }
    Child(int s){
        //chıld classst atum cons ların ılk satırına
        //javanın yerlestırdıgı cons parametresızdır.yanı super()
        System.out.println("chıld class parametrelı cons");
    }
    Child(int sayı1,int sayı2){
        //eger parent class tan parametresız cons ı degılde
        //baska bır cons calıstırmak ıstersenız
        //bunu chıld classtakı cons un ILK SATIRINA yazmalısınız
        super(sayı1,sayı2);
        System.out.println("ıkı paremetrelı cons");
    }

    public static void main(String[] args) {
        Child child =new Child(5,8);

    }
}
