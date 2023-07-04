package be.tftic.webmobile.intro.Demo.Heritage;

public class manager extends employe {

    public manager(){
        super("Boss","Big",52,255555);
    }
    @Override
    public String getSalutation(){
        return "Bonjour Mr";
    }

    // Methode pas obligatoire, car elle hérite des caractéristiques d'employer, mais peut-être redéfini si nécéssaire
//    @Override
//    public void travailler() {
//        System.out.println("Je ronfle");
//    }
}
