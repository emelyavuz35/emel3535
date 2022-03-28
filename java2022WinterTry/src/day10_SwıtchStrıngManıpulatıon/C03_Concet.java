package day10_SwıtchStrıngManıpulatıon;

public class C03_Concet {
    public static void main(String[] args) {

        String str1= "Java";
        String str2= "Candır";

        System.out.println(str1+" " +str2);

        String cumle= str1.concat(str2); // JavaCandir
        cumle= str1.concat(" ").concat(str2);
        System.out.println(cumle);

        cumle=str1.concat(""+5);
        cumle=str1.concat(true+"");
    }
}
