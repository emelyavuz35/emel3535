package day23_MultıDımensionalArrays;

public class C02_MDArrays {
    public static void main(String[] args) {

        //verılen mutltı dımensıonal array ın tum elementlerının toplamını bulunuz

        int arr[][]={{3,1,7},{6,10,2}};

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                toplam+=arr[i][j];

            }

        }
        System.out.println("arraydekı elementlerın toplamı:" + toplam);
    }
}
