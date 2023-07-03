package be.tftic.webmobile.intro.Demo.DemoOO.classes;

public class Voitures {
    String immatriculation;
    String couleur;
    int nombreDePortes;
    int kmParcouru;
    void rouler(){
        rouler(100,true);
    }
    // Signature
        // la classe et l'interface définissant le méthode
        // le nom de la méthode
        // l'ordre/le type de paramètre

    // Voiture - rouler - int, boolean
    void rouler(int distance, boolean affDistance){
        System.out.printf("this.couleur: %s\n", this.couleur);
        kmParcouru += distance;
        if( affDistance )
            System.out.printf("Je roules %d km\n", distance);
        else System.out.println(" Je roules ");
    }
    Voitures comparer(Voitures acomparer){
        return kmParcouru >= acomparer.kmParcouru ? this : acomparer;
    }
}
