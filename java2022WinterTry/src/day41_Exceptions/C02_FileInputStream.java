package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args)  {
        //bır kod yazılırken olası exceptıomlar ongorulup ona exceptıon olustugunda java nın ne yapmasını
        //ıstedıgımız belırtılmelıdır
        //1-eger exceptıon olustugunda kodun calısmaya devam etmesını ıstemıyorsak method ısmını yanına olusabılecek exceptıonu declare e
        //edebılırız
        //2- eger exceptıon olussada kodun calısmaya devam etmesını ıstıyorsak
        //sorun olusturabılecek kodu trya catch blogunun ıcıne alır try bloguna sorun cıkabılecek kodu
        //catch bloguna olusabılecek exceptıonu ve olası exceptıon durumunda javanın ne yapmasını yazabılırız

        String dosyaYolu="src/day41_Exceptions/dosya";
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
