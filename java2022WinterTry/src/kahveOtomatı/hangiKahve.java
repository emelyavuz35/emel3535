package kahveOtomatı;

public class hangiKahve {
    public hangiKahve() throws InterruptedException {
        System.out.println("Hangı kahveyi istersiniz?");
        System.out.println("1.Turk kahvesi\n" + "2.Filtre kahve\n" + "3.Espresso");
        System.out.println("seciminiz: ");
        int secim = variables.scan.nextInt();

        switch (secim) {
            case 1: {
                System.out.println("Turk kahvesi secildi");
                variables.hangiKahve = "Turk kahve";
                sutEkleme sutEkleme = new sutEkleme();
                break;
            }
            case 2: {
                System.out.println("Filtre kahve secildi");
                variables.hangiKahve = "Filtre kahve";
                sutEkleme sutEkleme = new sutEkleme();
                break;
            }

            case 3: {
                System.out.println("Espresso secildi");
                variables.hangiKahve = "Espresso kahve";
                sutEkleme sutEkleme = new sutEkleme();
                break;

            }
            default: {
                System.out.println("Hatalı secım yaptınız.Tekrar deneyin");
                hangiKahve hangiKahve = new hangiKahve();
                break;
            }

        }
    }
}