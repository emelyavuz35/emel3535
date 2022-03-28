package day12_StrıngManıpulatıon;

public class C04_endsWıth {
    public static void main(String[] args) {

        // Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin

        String emaıl="mulkıyeayboy@gmaıl.com";// uzunluk 10
        String arananMetın="@gmaıl.com";

        if (!emaıl.contains(arananMetın)){
            System.out.println("lutfen gmail adresi giriniz");

        }else if (emaıl.endsWith(arananMetın)){
            System.out.println("Email adresiniz kaydedildi");
        }else
            System.out.println("lutfen yazimi kontol edin");



    }
}
