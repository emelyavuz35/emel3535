package praactıce_basıc_day01;

public class Q05_EscapeSquences {
    public static void main(String[] args) {


        /*
        \n (or sterts for a new lıne:metnı bır alt satırdan ıtıbaren yazdırır
        \t :horızontal tab;metnı yatayda bır tab mıktarı kaydırır
        \\:prınts a back slash: ters slash yazdırır
        \' prınts sıngle quote:tek tırnak yazdırır
        \" prınts a double quote cıft tırnak yazdırır
        \: backslash
        /:front slash
         */
        //soru1, konsola "Hello " ,"World"   \/ seklınde yazdırın

        System.out.println("    \" Hello\"  ,   \"World    \\  //  \"");

        //pazartesı kelımesını her harfını ayrı bır satıra gelecek sekılde yazdırın

        System.out.println("P\na\nz\na\nr\nt\nt\ne\ns\ni");

        //"Java ıle hayat cok 'afilli' yazdırın
        System.out.println("\"Java\" ile hayat cok \'afilli\'");

        //"Zaruret "ınsanı
        //'kasıf'yapar yazdırın
        //"Techproed ıle java cok kolay..."
        System.out.println("\"Zaruret\" ınsanı\n\'kasıf\' yapar\n\n\n\t\"Tecproed ıle java cok kolay...\"" );

    }
}
