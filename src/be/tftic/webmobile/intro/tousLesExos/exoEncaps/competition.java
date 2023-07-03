package be.tftic.webmobile.intro.tousLesExos.exoEncaps;

import java.util.HashSet;

public class competition {

    private final int limite;
    private final HashSet<sportif> participants = new HashSet<>();

    public competition() {
        this.limite = 3;
    }

    public competition(int limite) {
        if( limite < 3 )
            this.limite = 3;
        else
            this.limite = limite;
    }

    public int getLimite() {
        return limite;
    }

    public HashSet<sportif> getParticipants() {
        return new HashSet<>(participants);
    }

    public void inscription(sportif aInscrire){
        if( participants.size() < limite )
        this.participants.add(aInscrire);
    }

    public boolean desInscription(sportif aDesinscrire){
        return this.participants.remove(aDesinscrire);
    }
}
