package day33_VarargsStringBuilder;

public class C03_StrıngBuılder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("Java cok guzel");
        StringBuilder sb3=new StringBuilder(10);

        System.out.println("sb1 lenght"+sb1.length());//0
        System.out.println("sb1 capacıty"+sb1.capacity());//16


        System.out.println("sb2 lenght"+sb2.length());//14
        System.out.println("sb2 capacıty"+sb2.capacity());//30

        System.out.println("sb3 lenght"+sb3.length());//0
        System.out.println("sb3 capacıty"+sb3.capacity());//10

        //append methodu ıle strıng buılder a ekleme yapanılrız

        sb1.append("Java").append("cok").append(" ").append("guzel");
        System.out.println("sb1 lenght"+sb1.length());//14
        System.out.println("sb1 capacıty"+sb1.capacity());//16

        sb1.append(3);
        System.out.println(sb1);//java cok guzel3

        sb1.append(true);
        System.out.println(sb1);//java cok guzel3true

        System.out.println("sb1 lenght"+sb1.length());//19
        System.out.println("sb1 capacıty"+sb1.capacity());//34

        sb1.append("tum dersler java olsa");
        System.out.println("sb1 lenght"+sb1.length());//40
        System.out.println("sb1 capacıty"+sb1.capacity());//70

        sb1.trimToSize();
        System.out.println("sb1 lenght"+sb1.length());//40
        System.out.println("sb1 capacıty"+sb1.capacity());//40




    }
}
