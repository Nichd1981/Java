package be.tftic.webmobile.intro.Demo.demoVariables;

import java.util.*;

public class DemoCollection {
    public static void main(String[] args) {
        // Collection

        // List
        System.out.println("----- Liste ArrayList -----");
        ArrayList<String> string = new ArrayList<>();       // Les ArrayList doivent être des objets
        ArrayList<Integer> entiers = new ArrayList<>();

        string.add("Luc");
        string.add(0,"Dominique");
        string.add(1,"true");
        entiers.add(15);

            // Pour récupérer la liste
        for (int i = 0; i < string.size(); i++) {
            System.out.println(string.get(i));
        }

            // Pour supprimer un élément
        if (string.remove("luc"))
            System.out.println("Luc est supprimé");
        else
            System.out.println("Luc est absent de la liste");

        String elementSupprimer = string.remove(0);     // Dans cette methode, on récupère l'élément supprimé dans une variable

            // Utilitaires
        boolean contientLuc = string.contains("Luc");         // Affiche si la liste contient Luc
        int indexOfTrue = string.indexOf("true");             // Me donne l'index de l'élément choisi
        boolean  vide = string.isEmpty();                     // Indique si la liste est vide
        string.clear();                                       // Vide la liste

        for (String chaine: string) {
            System.out.println(chaine);
        }

        // Set - pas de doublon, pas d'ordre, pas de récupération par index
        HashSet<String> monSet = new HashSet<>();

        monSet.add("Salut");
        monSet.add("Salut");

        System.out.println("----- Set -----");
        for (String s : monSet) {
            System.out.println(s);
        }
        monSet.remove("salut");
        monSet.size();

        // Queue FIFO (first in, first out)
        System.out.println("----- Le queue -----");
        Queue<String> queue = new LinkedList<>();
        queue.add("à la fin");
        queue.remove(); // Supprime le premier, erreur si vide
        queue.poll();   // Supprime le premier
        String CheckPremier = queue.peek(); // Regard qui est le premier

        // Stack LIFO (Last in , Last out)
        System.out.println("----- Le stack -----");
        Stack<String> iron = new Stack<>();
        iron.push("à la fin");      // Supprime et récupère le dernier
        String leDernier = iron.pop();   // Check le dernier sans le supprimer

        // Map
        System.out.println("----- Le map -----");
        HashMap<String, Integer> notes = new HashMap<>();           // En premier la clé suivi de la valeur
        notes.put("marie", 15);
        notes.put("marie", 17);
        notes.put("Luc", 12);
        System.out.println( notes.get("marie"));        // Résultat => 17
        notes.remove("marie");
        boolean marieExist = notes.containsKey("marie");     // False
        boolean lanote12 = notes.containsValue(12);       // True

        for (String s : notes.keySet()) {
            System.out.printf("%s -> %d\n", s, notes.get(s));
        }
        for (Map.Entry<String, Integer> entry : notes.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
