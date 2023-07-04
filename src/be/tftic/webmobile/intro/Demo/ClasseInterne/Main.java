package be.tftic.webmobile.intro.Demo.ClasseInterne;

import be.tftic.webmobile.intro.Demo.Heritage.employe;
import be.tftic.webmobile.intro.Demo.Heritage.manager;
import be.tftic.webmobile.intro.Demo.Interface.IRouler;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {


        System.out.println("--- CLASSE INTERNE --- ");
        VehiculeMotorise vm = new VehiculeMotorise("bipboup","vrimvroum");
        VehiculeMotorise.Moteur moteur = new VehiculeMotorise.Moteur(120, "V6");

        // Le cas du builder:
        Personne.PersonneBuilder builder = Personne.builder()
                .nom("dubois");
        // faire un truc
        builder.prenom("luc");
        // faire un truc
        Personne p = builder.build();


        // Parenthèse builder
        // Exemple d'un builder interessant présent ds le JDK
        StringBuilder sb = new StringBuilder();
        String rslt = sb.append("salut")
                .append("Ca va?")
                .append("au revoir")
                .toString();
        // Avantage d'un StringBuilder: pas d'instanciation à chaque concaténation
        // seulement à l'appel de toString()
        // fin de parenthèse

        // Les classes locales
        System.out.println("--- CLASSE LOCALE ---");
        // Cette classe locale a la même portée qu'une variable locale
        class Truc {}


        // Les classes anonymes
        System.out.println("--- CLASSE ANONYME ---");
        // On crée ici un object de classe anonyme héritant de Cadre
        // Vu que la classe anonyme hérite d'une méthode abstraite,
        // elle doit la redéfinir.
        manager cadre = new manager(){
            @Override
            public void travailler() {
                System.out.println("Il bosse dure");
            }
        };
        // Grace à la classe anonyme on peut créer un object basé sur une
        // classe mais en redéfinissant le comportement de ses méthodes

        employe emp = new employe("dubois", "luc", 2000, 2){
            @Override
            public void travailler() {
                System.out.println("Moi, luc je travaille pas comme les autres");
            }
        };
        // Ca fonctionne aussi pour des classes qui ne sont pas abstraites.


        IRouler rouler = new IRouler() {
            @Override
            public void rouler() {
                System.out.println("je choisi comment rouleren live");
            }
        };
        // Ca fonctionne aussi pour les interfaces


        // Les expressions lambdas sont en réalité des instanciations de classes
        // anonymes sur base d'une interface n'ayant qu'une méthode à redéfinir
        IRouler rouler2 = () -> System.out.println("je choisi comment rouleren live");
        rouler2.rouler();

        // Les interfaces n'ayant qu'une seule methode à redéfinir sont appelées
        // interfaces fonctionnelles

        // Java défini une série d'interfaces fonctionnelles dans le package java.util.function
//        Consumer;
//        Supplier;
//        Function;
//        BiFunction;
//        Runnable;

    }
}