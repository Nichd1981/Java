package be.tftic.webmobile.intro.tousLesExos.exoAbstract;

public class lion extends animales{

    public lion(String nom) {
        super(nom);
    }

    @Override
    public String parler() {
        return "Rrrrh!";
    }
}
