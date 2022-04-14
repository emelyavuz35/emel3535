package day33_VarargsStringBuilder;

public class C06_StrıngBuılder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Prize dikkat");

        System.out.println(sb1.insert(12,"edin"));//Prize dikkat edin
         String str="Hayatta cok guzel seyler var";
        System.out.println(sb1.insert(0,str,0,7));//Hayatta prize dıkkat edın

        System.out.println(sb1.reverse());//.nide takkıd ezirp attayaH

        System.out.println(sb1);//.nide takkıd ezirp attayaH
        System.out.println(sb1);//Hayatta prize dıkkat edın

        sb1.substring(3,5);
        System.out.println(sb1);//at

        System.out.println(sb1);//Hayatta prıze dıkkat edın
        System.out.println(sb1.subSequence(3,5));//at
        System.out.println(sb1);//at




    }
}
