package replit;

public class R17_ForLoop {

    public static void main(String[] args) {
       // Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve
        // LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
       // Input :
        //30
       // 40
        //Beklenen Cikti:
        //Beklenen Cikti:
       // 30 ve 40 icin GCD = 10
       // 30 ve 40 icin LCM = 120

        int n1 = 30;
        int n2 = 40;
        int ebob=1;
        int ekok;


        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            if(n1 % i == 0 && n2 % i == 0)
                ebob = i;
        }

        ekok = (n1 * n2) / ebob;
        System.out.println(n1 +" ve "+ n2 + "sayilarinin ebob'u "+ ebob);
        System.out.println(n1 +" ve "+ n2 + "sayilarinin ekok'u "+ ekok);
    }
}
