package be.tftic.webmobile.intro.Demo.Heritage;

public abstract class person {

    private String nom;
    private String prenom;
    private int age;

    public person(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSalutation(){
        return "Bonjour!";
    }

    @Override
    public String toString() {
        return "person{nom:%s, prenom:%s, age:%s}".formatted(nom,prenom, age);
    }

    @Override
    public boolean equals(Object obj) {
        if( !(obj instanceof  person ))
            return false;
        person p = (person) obj;
        return p.prenom.equals(this.prenom) && p.nom.equals(this.nom) && p.age == this.age;
    }
    public abstract void travailler();
}
