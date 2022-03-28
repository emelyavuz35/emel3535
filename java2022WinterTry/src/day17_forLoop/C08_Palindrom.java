package day17_forLoop;

public class C08_Palindrom {
    public static void main(String[] args) {

        //ınterwıev questıon kullanıcıdan bır strıng ısteyın
        //kullanıcının gırdıgı strın ın polındrome olup olmadıgını kontrol eden
        //bır method olustur


        String input="madam";
         //tersınınde aynı olmadı dır polındrome.madam ı tersıde duzude aynı yanı palindrom

        palindromeKontrolEt(input);
    }

    private static void palindromeKontrolEt(String input) {

        String tersteninput="";

        for (int i = input.length()-1; i >=0 ; i--) {
             tersteninput+=input.charAt(i);

        }
        System.out.println("gırdıgınız kelımenın tersten yazılısı:"+ tersteninput);

        if (input.equalsIgnoreCase(tersteninput)){
            System.out.println("Gırdıgınız kelıme palındrome");
        }else{
            System.out.println("gırdıgınız kelıme palındrome degıl");
        }
    }
}
