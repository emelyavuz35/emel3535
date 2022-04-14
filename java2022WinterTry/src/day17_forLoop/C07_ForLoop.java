package day17_forLoop;

public class C07_ForLoop {
    public static void main(String[] args) {
        //interwıev kullanıcıdan100den kucuk bır tamsayı ısteyın.
        //1 den baslayarakgırılen sayıya kadar tum sayıları yazdırın
        //ancak sayı 3 un katı ıse sayı yerıne "java"yazdırın
        //sayı 5 ın katı ıse sayı yerıne "guzeldır" yazdırın
        //sayı h3m 3 un hemde 5 ın katı ıse sayı yerıne "java guzeldır" yazdırın


       int sayı=60;
        for (int i = 1; i <=sayı ; i++) {

            if (i%3==0&&i%5==0){
                System.out.println("java guzeldır ");
            }else if (i%5==0){
                System.out.println("Guzeldır");
            }else if (i%3==0 && i%5==0){
                System.out.println("Java guzeldır");
            }else{
                System.out.println(i+" ");
            }


        }













    }
}
