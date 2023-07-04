package be.tftic.webmobile.intro.Demo.Heritage;

public class employe extends person {

    private int salaire;

    public employe(String nom, String prenom, int age, int salaire) {
        super(nom, prenom, age);
        this.salaire = salaire;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
    @Override   // Permet de produire une erreur de compilation si ce n'est pas une réécriture
    public String getSalutation(){
        return "Salut!";
    }

    // Methode obligatoire car elle hérite de peron et doit donc être défini
    @Override
    public void travailler() {
        System.out.println("Je travailles");
    }
}
