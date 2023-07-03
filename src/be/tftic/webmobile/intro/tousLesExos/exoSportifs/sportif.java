package be.tftic.webmobile.intro.tousLesExos.exoSportifs;

import java.time.LocalDate;
import java.util.Objects;

public abstract class sportif {

    private String nom;
    private String prenom;
    private int dateDeNaissance = 1900;
    public abstract int performance();

    public sportif(String nom, String prenom, int dateDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
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

    public int getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(int dateDeNaissance) {
        if ( dateDeNaissance >= 1900 && dateDeNaissance <= LocalDate.now().getYear())
            this.dateDeNaissance = dateDeNaissance;
    }

    @Override
    public String toString() {
        return "sportif{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        sportif sportif = (sportif) o;
        return dateDeNaissance == sportif.dateDeNaissance &&
                Objects.equals(prenom, sportif.prenom) &&
                Objects.equals(nom, sportif.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, dateDeNaissance);
    }
}
