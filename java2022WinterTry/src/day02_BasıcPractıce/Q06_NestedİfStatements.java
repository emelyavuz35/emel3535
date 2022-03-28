package day02_BasıcPractıce;

public class Q06_NestedİfStatements {
    public static void main(String[] args) {

        /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri
    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri
    gun carsamba veya cumartesi ise:
    SQL dersi gunleri
    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/

        String day="Friday";
        switch (day){
            case "Monday":
            case"Tuesday":
                System.out.println("Java ders gunleri");
                break;
            case "Tursday":
            case "Friday":
                System.out.println("Selenıum ders gunlerı");
                break;
            case "Wednesday":
            case "Saturday":
                System.out.println("SQL");
                break;
            default:
                System.out.println("izin gunu");
        }

    }
}
