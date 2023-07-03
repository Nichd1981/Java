package be.tftic.webmobile.intro.tousLesExos.exoSportifs;

import java.util.Objects;
import java.util.Random;

public class judoka extends sportif{

    private double poids;

    public judoka(String nom, String prenom, int dateDeNaissance, double poids) {
        super(nom, prenom, dateDeNaissance);
        this.setPoids(poids);
    }

    @Override
    public int performance(){
        int modificateur = new Random().nextInt(1,51);
        return (int)((poids / 2) + modificateur);
    }
    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        if(poids >= 1 && poids <= 10)
            this.poids = poids;
    }

    @Override
    public String toString() {
        return "judoka{" +
                "prenom='" + getPrenom() + '\'' +
                ", nom='" + getNom() + '\'' +
                ", dateDeNaissance=" + getDateDeNaissance() +
                ", poids=" + poids +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        if (!super.equals(o))
            return false;

        judoka judoka = (judoka) o;
        return Double.compare(judoka.getPoids(), getPoids()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPoids());
    }
}
