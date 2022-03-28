package day16_MethodCreatıon;

public class C04_ForLoop {
    public static void main(String[] args) {

        //verılen strıngı tersten yazdıran bır kod yazınız
        String str="Valla bu java cok zevkli";

        for (int i= str.length()-1;i>0;i--){
            System.out.print(str.substring(i,i+1));
        }
    }
}
