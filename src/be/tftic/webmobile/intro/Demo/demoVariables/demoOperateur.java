package be.tftic.webmobile.intro.Demo.demoVariables;

public class demoOperateur {
    public static void main(String[] args) {
        // Opérateur arithmétique
        int a = 7, b = 3;
        double resultat;

        resultat = a + b;
        resultat = a - b;
        resultat = a / b;
        resultat = (double) a / b;
        resultat = a * b;
        resultat = a % b;

        // Incrémentation
        int incDec = 0;

        System.out.println(incDec++);     // 0
        System.out.println(++incDec);     // 2
        System.out.println(incDec--);     // 2
        System.out.println(--incDec);     // 0

        System.out.println(incDec);

        // Opération de comparaison
        System.out.println(a == b);     // false
        System.out.println(a != b);     // true

        System.out.println(a < b);      // false
        System.out.println(a <= b);     // false
        System.out.println(a > b);      // true
        System.out.println(a >= b);     // true

        // Opérateur logique
        // AND -- &&
        System.out.println( true && true );     // true
        System.out.println( true && false );    // false
        System.out.println( false && true );    // false
        System.out.println( false && false );   // false

        // OR -- ||
        System.out.println( true || true );     // true
        System.out.println( false || true );    // true
        System.out.println( true || false );    // true
        System.out.println( false || false );   // false

        // NOT -- !
        System.out.println(!true);      // false
        System.out.println(!false);     // true

        // XOR -- ^
        System.out.println( true ^ true);   // false
        System.out.println( true ^ false);  // true
        System.out.println( false ^ true);  // true
        System.out.println( false ^ false); // false

        // Lois De morgan
        boolean estBleu = true, estLigne = true;

        System.out.println( !(estLigne && estBleu));        // Mon sac n'est pas ligné et bleu
        System.out.println( !estLigne || !estBleu);         // mon sac n'est pas ligné ou bleu
        System.out.println( !(estLigne || estBleu));        // mon sac n'est pas ou ligné ou bleu
        System.out.println( !estLigne && !estBleu);         // mon sac n'est pas ligné et pas bleu

    }
}
