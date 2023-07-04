package be.tftic.webmobile.intro.tousLesExos.exoType;

import java.util.Scanner;

public class NombrePremier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int nbr = sc.nextInt();

        for (int i = 2; i <= nbr; i++) {
            boolean estPremier = true;
            for (int j = 2; j < i && estPremier; j++) {
                if ( i % j  == 0){
                    estPremier = false;
                }
            }
            if ( estPremier ){
                System.out.println(i);
            }
        }
    }
}
