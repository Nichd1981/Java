package be.tftic.webmobile.intro.Demo.Variables;

import java.util.Scanner;

public class demoType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer votre nom: ");
        String inputUser = sc.nextLine();

        System.out.println("Vous vous appelez " + inputUser);
    }
}
