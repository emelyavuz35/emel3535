package day14_strıngManıpulatıon;

public class C01_trim {
    public static void main(String[] args) {

        String str="  Sız ne dersenız deyın ,Java bıldıgını okur.  ";

        str=str.trim();
        System.out.println(str);
        System.out.println(str.length());

        str="ali okula git \n git ali git";
        System.out.println(str.trim());
    }
}
