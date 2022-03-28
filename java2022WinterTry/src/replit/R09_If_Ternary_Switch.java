package replit;

import java.util.Scanner;

public class R09_If_Ternary_Switch {
    public static void main(String[] args) {

        //Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
        // IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
        //BMI 18,5'in altındaysa zayıfsınız
       // BMI 18,5 ile 25 arasında ise kilonuz idealdir
        //BMI 25-30 arasındaysa şişmansınız
        //BMI 30'dan büyük veya eşitse, obez
        //Input:
       // Output:
        //Agirlik : 71
      //  Boy : 1,72
      //  BMI : 23.99945916711736
       // Zayifsiniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kilonuzu ve boyunuzu yazınız");
      int kilo=scan.nextInt();
      double boy= scan.nextDouble();
      double bmı=kilo/(boy*boy);



        if(bmı<18.5){
            System.out.println("zayıfsınız");
        }else if (18.5<bmı || bmı<25){
            System.out.println("kilonuz ideal");
        }else if (25<bmı || bmı<30){
            System.out.println("sismansınız");
        }else if(bmı>=30){
            System.out.println("obez");
        }


    }
}
