package be.tftic.webmobile.intro.tousLesExos.exoSportifs;

public class main {
    public static void main(String[] args) {

        // TEST EQUALS / TOSTRING
//        Basketteur bsk = new Basketteur("Luc", "Dubois", 1990, 5);
//        Basketteur bsk2 = new Basketteur("Luc", "Dubois", 1990, 5);
//
//        System.out.println(bsk + " - " + bsk2 + ": " + (bsk.equals(bsk2) ? "égaux" : "différents"));
//
//         TEST PERFORM Basketteur
        basketteur bsk = new basketteur("Luc", "Dubois", 1990, 1);
        basketteur bsk2 = new basketteur("Luc", "Dubois", 1990, 10);

        System.out.println("--- BASKETTEUR 1 (precision: 1) ---");
        for (int i = 0; i < 10; i++) {
            System.out.println(bsk.performance());
        }

        System.out.println("--- BASKETTEUR 2 (precision: 10) ---");
        for (int i = 0; i < 10; i++) {
            System.out.println(bsk2.performance());
        }

        // Test performance judoka
        judoka judo = new judoka("Marie", "Dubuisson", 1984, 50.);
        judoka judo2 = new judoka("Dominique", "Dubuis", 1984, 100.);

        System.out.println("--- judoka 1 (poids: 50) ---");
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += judo.performance();
        }
        System.out.println(sum/10);
        sum = 0;
        System.out.println("--- judoka 2 (poids: 100) ---");
        for (int i = 0; i < 10; i++) {
            sum += judo2.performance();
        }
        System.out.println(sum/10);

        // Test performance cycliste
        cycliste cycl = new cycliste("Marie", "Dubuisson", 1984, 100);
        cycliste cycl2 = new cycliste("Dominique", "Dubuisson", 1984, 1000);

        System.out.println("--- cycliste 1 (km: 100) ---");
        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += cycl.performance();
        }
        System.out.println(sum/10);
        sum = 0;
        System.out.println("--- cycliste 2 (poids: 1000) ---");
        for (int i = 0; i < 10; i++) {
            sum += cycl2.performance();
        }
        System.out.println(sum/10);
    }
}
