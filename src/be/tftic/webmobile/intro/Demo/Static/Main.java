package be.tftic.webmobile.intro.Demo.Static;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.printf("Les motos ont %s roues\n", Moto.getNbrRoue());
        Moto m = Moto.blueWith("1-AAA-000");
        Moto m2 = new Moto("", "blue");

        Moto.setNbrRoue(3);
        Moto.setNbrRoue(2);

        // quelques méthodes et variables définies comme static:
        int a = Integer.parseInt("15");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(LocalDate.now());
    }
}