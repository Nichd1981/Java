package be.tftic.webmobile.intro.Demo.Variables;

import java.util.Scanner;

public class DemoConditionnelle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quel âge avez-vous? ");
        int age = sc.nextInt();

        if (age >= 67) {
            System.out.println("Vous êtes à la retraite");
        } else if (age >= 18) {
            System.out.println("Vous êtes majeur");

        } else if ( age >= 0){
            System.out.println("Vous êtes mineur");
        }
        else {
            System.out.println("age invalide");
        }

        // Switch
        System.out.println("Quel est votre nom");
        String nom = sc.next();
        switch (nom){
            case "luc":
                System.out.println("Bonjour CEO");
                break;
            case "marie":
                System.out.println("Bonjour CEO");
                break;
            case "dominique":
                System.out.println("Bonjour administratif");
                break;
            default:
                System.out.println("Bonjour employé");
                break;
        }

        // Switch nouvelle version
        System.out.println("Quel est votre nom");
        String nom2 = sc.next();
        switch (nom) {
            case "luc", "marie" -> System.out.println("Bonjour CEO");
            case "dominique" -> System.out.println("Bonjour administratif");
            default -> System.out.println("Bonjour employé");
        }

        // Opérateur ternaire
        String message = age >= 18 ? "majeur" : "mineur";
    }
}
