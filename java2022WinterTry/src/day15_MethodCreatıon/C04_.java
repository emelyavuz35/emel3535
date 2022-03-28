package day15_MethodCreatıon;

public class C04_ {

    //main metod olmadan da bır class olusturulabılır
    //ancak bu class calısmaz depo gorevı gorur
    //baska classlardan kullanılabılecek metod veyd varıableları barındırır


        public static void dortHarfiTersineCevir(String kelime) {
            String terskelime=kelime.substring(3)+
                    kelime.substring(2,3)+
                    kelime.substring(1,2)+
                    kelime.substring(0,1);
            System.out.println("girdiginiz kelimedeki harf sayısı:4");
            System.out.println("kelimenin tersen yazılısı:"+ terskelime);


        }

        public static void ucHarfiTersineCevir(String kelime) {
            String terskelime=kelime.substring(2)+
                    kelime.substring(1,2)+
                    kelime.substring(0,1);

            System.out.println("girdiginiz kelimedeki harf sayısı:"+kelime.length());
            System.out.println("kelimenin tersen yazılısı:"+ terskelime);


        }
}
