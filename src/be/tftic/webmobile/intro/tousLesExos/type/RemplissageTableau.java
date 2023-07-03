package be.tftic.webmobile.intro.tousLesExos.type;

import java.util.Scanner;

public class RemplissageTableau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tableau = new int[10];

        for (int i = 0; i < tableau.length ; i++) {
            System.out.println("Valeur pour la " + (i+1) + "e case: ");
            tableau[i] = sc.nextInt();
        }
        int sommes = 0;
        for (int i = 0; i < tableau.length; i++) {
            sommes += tableau[i];
        }
        System.out.println("La moyenne: " + ((double) sommes/tableau.length));
    }
}
