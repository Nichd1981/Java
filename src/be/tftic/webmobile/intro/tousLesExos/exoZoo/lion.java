package be.tftic.webmobile.intro.tousLesExos.exoZoo;

public class lion extends animales{

    public lion(String nom) {
        super(nom);
    }

    @Override
    public String parler() {
        return "Rrrrh!";
    }
}
