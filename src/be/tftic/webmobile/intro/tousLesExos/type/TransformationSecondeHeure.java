package be.tftic.webmobile.intro.tousLesExos.type;

import java.util.Scanner;

public class TransformationSecondeHeure {
    public static void main(String[] args) {
        // Convertisseur de seconde
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre de seconde: ");
        int secondeInput = sc.nextInt();
        int jour = secondeInput / 86400;
        int heures = (secondeInput / 3600) ;
        int minutes = (secondeInput % 3600) / 60;
        int secondes = secondeInput % 60;

        System.out.println(jour+" jour " + heures +" heures " + minutes +" minutes "+ secondes +" secondes" );

    }
}
