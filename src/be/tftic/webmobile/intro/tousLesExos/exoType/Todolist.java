package be.tftic.webmobile.intro.tousLesExos.exoType;

import java.util.ArrayList;
import java.util.Scanner;

public class Todolist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> todo = new ArrayList<>();
        char input;

        do {

            System.out.println("""
                    |-------------------------|
                    |          Menu           |
                    |-------------------------|
                    | a - Ajouter au début    |
                    | A - Ajouter à la fin    |
                    | S - Supprimer une tache |
                    | p - Afficher            |
                    |-------------------------|
                    | Q - Quitter             |
                    |-------------------------|
                    """);
            input = sc.nextLine().charAt(0);

            switch (input) {
                case 'a' -> {
                    System.out.println("Nouvelle tache au début: ");
                    String toAdd = sc.nextLine();
                    todo.add(0, toAdd);
                }
                case 'A' -> {
                    System.out.println("Nouvelle tache à la fin: ");
                    String toAdd = sc.nextLine();
                    todo.add(toAdd);
                }
                case 'S' -> {
                    System.out.println("Supprimer une tache:");
                    int indexToDelete = Integer.parseInt(sc.nextLine());
                    if (indexToDelete >= 0 && indexToDelete < todo.size()) {
                        todo.remove(indexToDelete);
                    }
                }
                case 'p' -> {
                    for (int i = 0; i < todo.size(); i++) {
                        System.out.printf("%d - %s\n", i, todo.get(i));
                    }
                }
                case 'q' -> {
                    System.out.println("Au revoir");
                }
                default -> {
                    System.out.println("Commande invalide");
                }
            }
        }while (input != 'q') ;
    }
}
