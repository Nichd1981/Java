package be.tftic.webmobile.intro.tousLesExos.type;

import java.util.Scanner;

public class ConvertiLettreMinuscule {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Entrez un votre nom en majuscule: ");
        char inputUser = ab.nextLine().toLowerCase().charAt(0);
        System.out.println("Votre nom est " + inputUser);
    }
}
