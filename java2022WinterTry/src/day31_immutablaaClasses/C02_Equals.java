package day31_immutablaaClasses;

public class C02_Equals {
    public static void main(String[] args) {
        String a="";
        a +=2;
        a +='c';
        a +=false;

        if (a=="2cfalse"){
            System.out.println("==");}
        if (a.equals("2cfalse")) {
            System.out.println("equalas");


        }

        String b="2c false";
        if (b=="2c false"){
            System.out.println("==");
        }
        if (b.equals("2cfalse")){
            System.out.println("equals");

        }
    }
}
