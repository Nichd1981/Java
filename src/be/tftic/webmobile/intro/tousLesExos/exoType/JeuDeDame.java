package be.tftic.webmobile.intro.tousLesExos.exoType;

import java.util.Scanner;

public class JeuDeDame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TailleX = 5, TailleY = 5;
        int[][] plateau = new int[TailleX][TailleY];
        int posX = 0, posY= 0;
        plateau[posX][posY] = 1;                            // 1 représente le pion
        char input;
        do{
            // afficher le tableau
            // 1er boucle lit la rangée
            for (int i = 0; i < plateau.length; i++) {
                // 2ieme boucle lit les cases de la rangée
                for (int j = 0; j < plateau[i].length; j++) {
                    System.out.print(plateau[i][j]);
                }
                System.out.println();
            }
            // Permettre le choix user et bouger le pion
            System.out.println("""
                MENU: Bouger le pion
                ---------------------
                g - aller à gauche
                d - aller à droite
                h - aller à haut
                b - aller à bas
                ---------------------
                q - quitter
                ---------------------
                """);

            input = sc.nextLine().charAt(0);
            plateau[posX][posY] = 0;                            // On retire le pion
            switch (input){
                case 'g' -> { if(posY > 0) posY--;}
                case 'd' -> { if(posY < TailleY-1) posY++;}
                case 'h' -> { if(posX > 0) posX--;}
                case 'b' -> { if(posX < TailleX - 1) posX++;}
                case 'q' -> System.out.println("Au revoir");
                default -> System.out.println("input incorrect.");
            }
            plateau[posX][posY] = 1;
        } while (input != 'q');
    }
}
