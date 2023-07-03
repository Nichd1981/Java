package be.tftic.webmobile.intro.Demo.DemoOO.constructeur;

public class Velo {
    String couleur;
    boolean petiteRoues;
    String type;
    int diametreRoue;
    Velo(){}
    Velo(String couleur, boolean petiteRoues, String type, int diametreRoue){
        this.couleur = couleur;
        this.petiteRoues = petiteRoues;
        this.type = type;
        this.diametreRoue = diametreRoue;
    }
}
