package be.tftic.webmobile.intro.tousLesExos.exoAbstract;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        zoo zoo = new zoo();

        Scanner sc = new Scanner(System.in);

        char input;

        do {
            System.out.println("""
                MENU
                ----
                1 - ajouter zebre
                2 - ajouter lion
                3 - faire parler
                4 - quitter
                """);
            input = sc.nextLine().charAt(0);

            switch (input) {
                case '1' -> {
                    System.out.println("Quel nom pour le zebre?");
                    String nom = sc.nextLine();
                    zoo.ajouter( new zebre(nom) );
                }
                case '2' -> {
                    System.out.println("Quel nom pour le lion?");
                    String nom = sc.nextLine();
                    zoo.ajouter( new lion(nom) );
                }
                case '3' -> {
                    for (animales animales : zoo.getAnimales()) {
                        System.out.println(animales.parler());
                    }
                }
                case '4' -> System.out.println("au revoir");
                default -> System.out.println("commande invalide");
            }

        } while( input != '4' );
    }

}
