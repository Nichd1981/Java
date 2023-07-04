package be.tftic.webmobile.intro.Demo.Variables;

public class DemoTableauMulti {
    public static void main(String[] args) {
        int[] tableau = {1, 2};

        int[][] tableau2Dimension = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int [][][] tableau3Dimension = {
                {{1, 2}, {3, 4}},
                {{5, 6}, {7, 8}}
        };
        int[][] tableauJeuDeDame = new int[10][10];
            tableauJeuDeDame[0][0] = 1;
            tableauJeuDeDame[9][9] = 1;

        int[][] tableauRemplissage = new int[3][3];
        int[] rangee1 = tableauRemplissage[0];

        for (int i = 0; i < tableauRemplissage.length ; i++) {
            for (int j = 0; j < tableauRemplissage[i].length; j++) {
                tableauRemplissage[i][j] = i+j;
            }
        }
        // Résultat
//        {
//            {0, 1, 2},
//            {1, 2, 3},
//            {2, 3, 4}
//        }
        //        {
//            {0, 1, 2, 3, 4},
//            {1, 2, 3, 4, 5},
//            {2, 3, 4, 5, 6},
//            {3, 4, 5, 6, 7},
//            {4, 5, 6, 7, 8}
//        }

    }
}
