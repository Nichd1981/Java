package be.tftic.webmobile.intro.tousLesExos.exoAbstract;

public abstract class animales {

    private String nom;

    public animales (String nom){
        this.nom = nom;
    }
    public abstract String parler();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void add(animales animales) {
    }
}
