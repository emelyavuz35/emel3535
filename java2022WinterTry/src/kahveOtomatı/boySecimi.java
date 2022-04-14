package kahveOtomatı;

public class boySecimi {
    public boySecimi() throws InterruptedException {

        if (variables.hangiKahve != "turk kahvesi") {
            System.out.println("1.Buyuk boy\n" + "2.Orta boy\n" + "3.Kucuk boy\n");
            int secim = variables.scan.nextInt();


            switch (secim) {
                case 1: {
                    variables.size = "Buyuk boy";
                    break;
                }
                case 2: {
                    variables.size = "Orta Boy";
                    break;
                }

                case 3: {
                    variables.size = "kucuk Boy";
                    break;
                }
                default: {
                    System.out.println("Yanlıs bır secım yaptınız.Tekrar deneyiniz");
                    break;
                }

            }
            System.out.println(variables.size + " " + variables.isSugar + " " +
                    variables.isMilk + " " + variables.hangiKahve + "'niz hazirlandi.");
        }
        Thread.sleep(3000);
        System.out.println("Afıyet olsun .Tekrar beklerız");
    }
}