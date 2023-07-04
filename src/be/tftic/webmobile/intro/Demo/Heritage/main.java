package be.tftic.webmobile.intro.Demo.Heritage;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        employe empl1 = new employe("Blob","Nicolas",42,2000);
        person pers1 = new employe("Jolie","Nath",28, 2000);
        employe empl2 = (employe) pers1;

        ArrayList<person> liste = new ArrayList<>();
//        liste.add(new person("Luc","Dubois", 41));
        liste.add(empl1);

        for (person person : liste) {
            if(person instanceof employe) {
                System.out.println( person.getPrenom() + " - " + ((employe) person).getSalaire());
            }
        }
        System.out.println("\n------- Override -------");
        person p = new employe("Buisson", "Maurice", 27, 1500);
        System.out.println(p.getSalutation() + " " + p.getPrenom());
        p = new manager(); // On transforme employer en Manager
        System.out.println(p.getSalutation() + " " + p.getNom());

        System.out.println("\n------ toString et equals ------");
        System.out.println(p);

        System.out.println("\n------ Avec equals modifier ------");
        manager m1 = new manager();
        manager m2 = new manager();
        System.out.println( m1 == m2);
        System.out.println(m1.equals(m2));
    }
}
