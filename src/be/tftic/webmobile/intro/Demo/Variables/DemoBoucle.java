package be.tftic.webmobile.intro.Demo.Variables;

import java.util.Scanner;

public class DemoBoucle {
    public static void main(String[] args) {
        int nbreOeuf = 5;
        while ( nbreOeuf > 0){
            System.out.println("Je lance un oeuf");
            nbreOeuf--;
        }
        System.out.println("Il n'y a plus d'oeufs dans le frigo");

        // Do ... while
        System.out.println("Entrez un nombre entre 1 et 10: ");
        Scanner sc = new Scanner(System.in);
        int nbre;
        do {
            nbre = sc.nextInt();
        }while(nbre < 1 || nbre > 10);
        System.out.println(nbre);

        // For
        int i;
        for ( i = 5; i > 0; i--) {
            System.out.println("je lance un oeuf");
        }
    }
}
