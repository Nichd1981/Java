package be.tftic.webmobile.intro.tousLesExos.exoBoxeur;

import java.time.LocalDate;
import java.util.Objects;

    public abstract class Sportif {

        private String nom;
        private String prenom;
        private int dateDeNaissance = 1900;
        public abstract int performance();

        public Sportif(String nom, String prenom, int dateDeNaissance) {
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
            return "Sportif{" +
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
            Sportif Sportif = (Sportif) o;
                return dateDeNaissance == Sportif.getDateDeNaissance() &&
                    Objects.equals(prenom, Sportif.getPrenom()) &&
                    Objects.equals(nom, Sportif.getNom());
        }

        @Override
        public int hashCode() {
        return Objects.hash(nom, prenom, dateDeNaissance);
    }
    }
