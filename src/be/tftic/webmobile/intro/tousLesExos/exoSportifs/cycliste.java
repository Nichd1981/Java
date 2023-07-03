package be.tftic.webmobile.intro.tousLesExos.exoSportifs;

import java.util.Objects;
import java.util.Random;

public class cycliste extends sportif{

    private int KmParcouru;

    public cycliste(String nom, String prenom, int dateDeNaissance, int kmParcouru) {
        super(nom, prenom, dateDeNaissance);
        this.setKmParcouru( kmParcouru);
    }

    @Override
    public int performance(){
        int modificateur = 0;

        if (KmParcouru >= 500)
            modificateur = 50;
        else if ( KmParcouru >= 400 )
            modificateur = 40;
        else if ( KmParcouru >= 300 )
            modificateur = 30;
        else if (KmParcouru >= 200)
            modificateur = 20;
        else if ( KmParcouru >= 100 )
            modificateur = 10;

        return new Random().nextInt(0,51)+modificateur;
    }
    public int getKmParcouru() {
        return KmParcouru;
    }

    public void setKmParcouru(int kmParcouru) {
        if(kmParcouru >= 0)
            KmParcouru = kmParcouru;
    }

    @Override
    public String toString() {
        return "cycliste{" +
                "prenom='" + getPrenom() + '\'' +
                ", nom='" + getNom() + '\'' +
                ", dateNaiss=" + getDateDeNaissance() +
                ", kmParcourus=" + KmParcouru +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        cycliste cycliste = (cycliste) o;
        return getKmParcouru() == cycliste.getKmParcouru();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getKmParcouru());
    }
}
