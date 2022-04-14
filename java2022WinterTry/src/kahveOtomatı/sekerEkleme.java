package kahveOtomatı;

public class sekerEkleme {
    public sekerEkleme()throws InterruptedException{
        System.out.println("seker eklemek ıster mısınz?(1) EVET  (2) HAYIR");
       int secim=variables.scan.nextInt();
       if (secim==1){
           variables.isSugar="sekerli";
       }else if(secim==2){
           variables.isSugar="sekersiz";
       }else{
           System.out.println("Hatalı bır secım yaptınız.Tekrar deneyin");
           sekerEkleme sekerEkleme=new sekerEkleme();
       }
        System.out.println(variables.isSugar+ " "+  variables.isMilk+" "+variables.hangiKahve+" 'niz hazırlanıyor.Lutfen bekleyin");
       Thread.sleep(3000);
       boySecimi boySecimi=new boySecimi();
    }
}
