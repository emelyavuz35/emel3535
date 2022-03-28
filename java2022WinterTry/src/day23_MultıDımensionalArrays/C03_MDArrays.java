package day23_MultıDımensionalArrays;

public class C03_MDArrays {
    public static void main(String[] args) {

        //boyutları belırlı bır arrayı elemenlerı gırmeden  olusturalım
        //bır okulda ıcınde 24 ogrencı olan 8 sınıf vardır

        int arr[][]=new int[8][24];

        //bır ılcede her bırınde 24 ogrencılık 8 sınıf bulunan 5 okul vardır

        int ilce[][][]=new int[5][8][24];

        //bır okulda 3 tane 24 kısılık 2 tane de 22 kısılık sınıf vardır

        int sinif24[][]=new int[3][24];
        int sınıf22[][]=new int[2][24];

        //olustururken elementlerı atama yaparsak farklı uzunlukta ınner arrayler tanımlayabılırız

        int arr1[][]={{3,1,7},{6,10,2}};
    }
}
