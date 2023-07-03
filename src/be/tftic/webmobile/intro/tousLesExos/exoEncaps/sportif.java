package be.tftic.webmobile.intro.tousLesExos.exoEncaps;

import java.time.LocalDate;

public class sportif {

    private String nom;
    private String prenom;
    private LocalDate dateNaissance = LocalDate.now();

    public sportif(String nom, String prenom, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.setDateNaissance(dateNaissance);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }
    public void setDateNaissance(LocalDate dateNaissance) {
        if( dateNaissance.getYear() >= 1900 && dateNaissance.getYear() <= LocalDate.now().getYear())
            this.dateNaissance = dateNaissance;
    }
}
