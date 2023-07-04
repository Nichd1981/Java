package be.tftic.webmobile.intro.Demo.Variables;

public class DemoVariable {
    public static void main(String[] args) {                        // Raccourci psvm
        System.out.println("Hello World");                          // raccourci sout
        // Variables
        int monNombre = 1, monDeuxiemeNombre = 3, simpleNombre;     //

        // Constantes
        final String CHAINE = "55555";
        final char CHARACTER = 'a';

        // Type primitifs

        // Entiers
        byte tresPetitEntier;                                       // 1 Octet // [de -128 à 127]
        short petitEntier;                                          // 2 Octets // [de -32768 à 32767]
        int entier;                                                 // 4 Octets // [de -2Milliards à 2Milliards]
        long grosEntier;                                            // 8 Octets // [de -BCP à BCP]

        // Réels
        float reelPeuPrecis;                                        // 4 Octets
        double reelPrecis;                                          // 8 Octets

        // Autres
        boolean bool;                                               // 1bit
        char character;                                             // 2 Octets

        // Pas un primitif, mais s'utilise tout comme
        String chaine;                                              // Sa taille dépend du contenu // de type Objet

        // Expression littérale
        int a = 5;
        double mondouble = 1.0;
        String chaineExp = "Ma chaine de charactere";
        char charact = '5';
        boolean monBooleen = true;

        // Conversion type
        int entierConversion = 5;
        short shortConversion = (short)entierConversion;            // Conversion explicite // nécessaire si perte de données possible
        long longConversion = entierConversion;                     // Conversion implicite // pas de risque de perte de données

        //
    }
}
