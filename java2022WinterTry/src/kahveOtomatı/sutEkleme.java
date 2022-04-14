package kahveOtomatı;

public class sutEkleme {
    public sutEkleme()throws InterruptedException{
        System.out.println("sut eklemek ıster mısınz?(1) EVET  (2) HAYIR");
        int secim=variables.scan.nextInt();
        if (secim==1){
            variables.isMilk="sutlu";
        }else if(secim==2){
            variables.isMilk="sutsuz";
        }else{
            System.out.println("Hatalı bır secım yaptınız.Tekrar deneyin");
            sutEkleme sutEkleme=new sutEkleme();
        }
        System.out.println(variables.isMilk+ " "+variables.hangiKahve+" 'niz hazırlanıyor.Lutfen bekleyin");
        Thread.sleep(3000);
       sekerEkleme sekerEkleme=new sekerEkleme();
    }
}
