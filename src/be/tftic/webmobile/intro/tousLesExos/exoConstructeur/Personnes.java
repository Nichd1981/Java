package be.tftic.webmobile.intro.tousLesExos.exoConstructeur;

public class Personnes {
    String nom;
    String prenom;
    int age = 35;

    Personnes(String prenom, String nom, int age){
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }
    Personnes(String prenom, String nom){
        this.prenom = prenom;
        this.nom = nom;
    }

    void saluer(){
        this.saluer(null, false);
    }

    void saluer(Personnes aSaluer){
        this.saluer( aSaluer, false);
    }
    void saluer( boolean sePresenter ){
        this.saluer(null, sePresenter );
    }

    void saluer( Personnes aSaluer, boolean sePresenter ){
        String message = sePresenter ?
        " je suis %s %s et j'ai %d ans".formatted(this.prenom, this.nom, this.age) : "!";

        if( aSaluer != null )
            message = "Bonjour %s %s".formatted(aSaluer.prenom, aSaluer.nom) + message;
        else
            message = "Bonjour" + message;

        System.out.println( message );

    }
}
