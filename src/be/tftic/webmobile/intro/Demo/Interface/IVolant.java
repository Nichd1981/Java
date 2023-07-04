package be.tftic.webmobile.intro.Demo.Interface;

public interface IVolant extends IPlaner {

    // static et final par défault, impossible de créer des variables
    // non static ou/et non final
    // static   => pas besoin d'instance pour appeler la var.
    // final    => constante
    static final int PRESSION_ATMOSPHERIQUE = 1;

    void voler();
}
