package day02_BasıcPractıce;

public class Q05_iFsTATEMENTSnOThESAPLAYICI {
    public static void main(String[] args) {


        /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */

        int grade=55;

        if (grade>=90 && grade<=100){
            System.out.println("you made A");
        }else if (grade<=89&& grade>=80){
            System.out.println("you made B");
        }else if (grade<=79&& grade>=70){
            System.out.println("you made C");
        }else if (grade<=69&&grade>=60){
            System.out.println("you made D");
        }else
            System.out.println("you made F sorry");
    }
}
