package be.tftic.webmobile.intro.Demo.DemoOO.encaps.frontiere;

import be.tftic.webmobile.intro.Demo.DemoOO.encaps.Voiture;

public class main {
    public static void main(String[] args) {
        Voiture a = new Voiture();
        a.immatriculation = "BAFEA";            // Pas d'accès aux autres paramètre de la classe.

        citadine citadine = new citadine("FAFA", "Bleu", 5, 200 );

        pilote pilote = new pilote("dominique", "Blob", 10);
//        pilote.getPermis().add("Permis B");     // Ajoute à la copie => pas d'effet sur la liste interne
        pilote.addPermis("Permis B");

    }
}
