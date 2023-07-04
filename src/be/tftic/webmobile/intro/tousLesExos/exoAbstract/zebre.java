package be.tftic.webmobile.intro.tousLesExos.exoAbstract;

public class zebre extends animales {

    public zebre(String nom){
        super(nom);
    }

    @Override
    public String parler() {
        return "hi Han?!";
    }
}
