package be.tftic.webmobile.intro.tousLesExos.exoSportifs;

import java.util.Objects;
import java.util.Random;

public class basketteur extends sportif{

    private int precision = 1;


    public basketteur(String nom, String prenom, int dateDeNaissance, int precision) {
        super(nom, prenom, dateDeNaissance);
        this.precision = precision;
    }
    @Override
    public int performance(){
        return new Random().nextInt(1,11) * precision;
    }
    public int getPrecision() {
        return precision;
    }
    public void setPrecision(int precision){
            if( precision >= 1 && precision <= 10 )
                this.precision = precision;
    }
    @Override
    public String toString() {
        return "Basketteur{" +
                "prenom='" + getPrenom() + '\'' +
                ", nom='" + getNom() + '\'' +
                ", dateDeNaissance=" + getDateDeNaissance() +
                ", precision=" + precision +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        basketteur that = (basketteur) o;
        return getPrecision() == that.getPrecision();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPrecision());
    }
}
