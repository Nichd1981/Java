package be.tftic.webmobile.intro.Demo.DemoOO.classes;

public class Main {
    public static void main(String[] args) {
        Voitures voiture1 = new Voitures();
        Voitures voiture2 = new Voitures();

        voiture1.couleur = "rouge";
        voiture2.couleur = "vert";
        voiture1.rouler(1000, true);
        voiture2.rouler(500,false);
        System.out.println(voiture1.kmParcouru);
        System.out.println(voiture2.kmParcouru);

        System.out.printf("La voiture avec le plus de km parcouru est: %s\n", voiture1.comparer(voiture2).couleur);

    }
}
