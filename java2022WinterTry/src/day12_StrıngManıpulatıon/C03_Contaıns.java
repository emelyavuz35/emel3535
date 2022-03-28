package day12_StrıngManıpulatıon;

public class C03_Contaıns {
    public static void main(String[] args) {
        // Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin

        String emaıl="mulkıyeayboy@gmaıl.com";// uzunluk 10
        String arananMetın="@gmaıl.com";//uzunluk 10

        if (!emaıl.contains(arananMetın)){
            System.out.println("lutfen gmail adresi giriniz");//boolean ıfadeyı bulur!ıcermıyorsa
        }else if (emaıl.lastIndexOf(arananMetın)==emaıl.length()-1){
            System.out.println("Email adresiniz kaydedildi");

        }else{
            System.out.println("lutfen yazimi kontol edin");
        }

    }
}
