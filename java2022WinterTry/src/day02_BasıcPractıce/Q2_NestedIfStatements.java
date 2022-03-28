package day02_BasıcPractıce;

public class Q2_NestedIfStatements {
    public static void main(String[] args) {

        //FINAL NOTU A ISE GAYET BASARILI
        //B ISE BASARILI
        //C ISEHA GAYRET
        //BUNLARIAN DISINDA DIGERLERI YZDIRINIZ
        
        
        char fınalnotu='7';
        
        String result="";
        
        
        result=(fınalnotu=='A')? "Gayet basarılı":
                (fınalnotu=='B')? "basarılı": 
                        (fınalnotu=='C')?"Ha gayrat":"Dıgerlerı";

        System.out.println("result = " + result);;
    }
}
