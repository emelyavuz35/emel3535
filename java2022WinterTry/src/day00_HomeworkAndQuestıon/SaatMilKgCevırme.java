package day00_HomeworkAndQuestıon;

import java.util.Scanner;

public class SaatMilKgCevırme {
    public static void main(String[] args) {
        //saatı sanıyeye mil i km ye kg yi gr a cevıren bır method yazınız

        Scanner scan=new Scanner(System.in);
        System.out.println("cevırım yapacagınız ıslemi seciniz");
        String islem=scan.next();
        System.out.println("cevrım mıktarını gırınız");
        double miktar= scan.nextDouble();
        donustur(islem,miktar);



    }

    private static void donustur(String islem, double miktar) {
        switch (islem){
            case "saat":
                System.out.println("merak ettıgın saat "+miktar*60*60+"saniyedir");
                break;
            case "mil":
                System.out.println("merak ettıgın mil "+miktar*1.61+"kilometredir");
                break;
            case "kg":
                System.out.println("merak ettıgın kg "+miktar*1000 +"gramdır");
                break;
            default:
                System.out.println("dogru verı gırmedınız");

        }
    }
}
