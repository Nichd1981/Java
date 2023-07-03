package be.tftic.webmobile.intro.tousLesExos.exoConstructeur;

public class Main {
    public static void main(String[] args) {
        Personnes personne1 = new Personnes("Nicolas", "Big", 42);
        Personnes personne2 = new Personnes("Nathalie", "Jolie");

        personne1.saluer();
        personne1.saluer(true);
        personne1.saluer(personne2);
        personne1.saluer(personne2, true);
    }
}
