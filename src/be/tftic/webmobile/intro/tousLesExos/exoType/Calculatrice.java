package be.tftic.webmobile.intro.tousLesExos.exoType;

import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre premier nombre, un opérateur et un second nombre: ");
        double nbr1 = sc.nextDouble();
        char ope = sc.next().charAt(0);
        double nbr2 = sc.nextDouble();

        switch (ope){
            case '+':
                System.out.println(nbr1 + " " + ope + " " + nbr2 + " = " + (nbr1+nbr2));
                break;
            case '-':
                System.out.println(nbr1 + " " + ope + " " + nbr2 + " = " + (nbr1-nbr2));
                break;
            case '*':
                System.out.println(nbr1 + " " + ope + " " + nbr2 + " = " + (nbr1*nbr2));
                break;
            case '/':
                if ( nbr2 == 0){
                    System.out.println("Division par 0 impossible");
                }else{
                    System.out.println(nbr1 + " " + ope + " " + nbr2 + " = " + (nbr1/nbr2));
                }
                break;
            case '%':
                if ( nbr2 == 0){
                    System.out.println("Modulo par 0 impossible");
                }else{
                    System.out.println(nbr1 + " " + ope + " " + nbr2 + " = " + (nbr1%nbr2));
                }
                break;
            default:
                System.out.println("Opérateur invalide");
        }
    }
}