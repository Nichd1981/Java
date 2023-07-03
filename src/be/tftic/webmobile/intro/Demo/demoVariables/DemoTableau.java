package be.tftic.webmobile.intro.Demo.demoVariables;

public class DemoTableau {
    public static void main(String[] args) {
        int[] tableauInt = new int[5];                                  // Crée un tableau de 5 entrées
        int[] tableauInt2 = {1, 2, 3, 4, 5};                            // Initialise un tableau avec des données
        tableauInt2 = new int[]{1, 2, 3};                               // Ecrase le tableau précédent et crée un nouveau tableau

        String[] tableauChaine = new String[10];

        tableauInt[0] = 5;                                              // Donne la valeur 5 à l'index 0 du tableau
        tableauInt[1] = tableauInt[0] + 1;                              // Donne la valeur de l'index 0 + 1 à l'index 1 du tableau
        tableauInt[2] = 'A';                                            // Donne la valeur ASCI et fait une conversion implicite en int

        System.out.println("Taille du tableau" + tableauInt.length);    // Donne la taille du tableau

        for (int i = 0; i < tableauInt.length; i++) {                   // Affiche le contenu du tableau
            System.out.println(tableauInt[i]);
        }


    }
}
