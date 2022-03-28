package day23_MultıDımensionalArrays;

public class C08_MDARRAYS {
    public static void main(String[] args) {

       // /aasagıdakı multı dımensıonal arrayın ıc array lerındekı
        // son elemanların carpımını ekrana yazdıran bır program yazınız

        int arr[][]={{1,2,3},{4,5},{6}};
        int carpim=1;
        for (int i = 0; i <arr[i].length ; i++) {
             carpim *=arr[i][arr[i].length-1];


        }
        System.out.println("son elemenlerın carpımı:"+ carpim);
    }
}
