package be.tftic.webmobile.intro.Demo.Methode;

public class Main {
    public static void main(String[] args) {
        Personne personne1 = new Personne();
        Personne personne2 = new Personne();

        personne1.nom = "Blob";
        personne1.prenom = "Nicolas";
        personne1.age = 42;
        personne2.nom = "Bibi";
        personne2.prenom = "Melvin";
        personne2.age = 34;

        personne1.saluer(personne2);
    }
}
