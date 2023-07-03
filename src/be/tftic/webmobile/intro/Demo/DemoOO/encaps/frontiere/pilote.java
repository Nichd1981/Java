package be.tftic.webmobile.intro.Demo.DemoOO.encaps.frontiere;

import java.util.ArrayList;

public class pilote {

    private String prenom;
    private String nom;
    private int kmConduit;
    private final ArrayList<String> permis = new ArrayList<>(); // Getter oui Setter non

    public pilote(String prenom, String nom, int kmConduit) {
        this.prenom = prenom;
        this.nom = nom;
        this.setKmConduit(kmConduit);
    }

    int getKmConduit(){                             // Permet d'avoir accès à la variable qui est en private
        return kmConduit;
    }
    protected void setKmConduit(int kmConduit){
        if( kmConduit > this.kmConduit)
            this.kmConduit = kmConduit;
    }
    public String getPrenom(){
        return this.prenom;
    }
    private void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<String> getPermis() {
        return new ArrayList<>(permis);             // Crée une liste modifiable de l'extérieur sans modifier la liste originale
    }
    public void addPermis(String toAdd){
        permis.add(toAdd);                          // Crée une variable permettant de rajouter dans la liste permis originale.
    }

}
