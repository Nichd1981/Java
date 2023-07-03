package be.tftic.webmobile.intro.tousLesExos.exoEncaps;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        competition nouvelleCompetition = new competition();
        sportif sp1 = new sportif("Blob","Nicolas", LocalDate.of(2020,10, 8));
        sportif sp2 = new sportif("Jolie", "Nath", LocalDate.of(1988,11,15));
        sportif sp3 = new sportif("Match", "Melvin", LocalDate.of(2021,12,1));
        sportif sp4 = new sportif("Mitch", "Jawad", LocalDate.of(2001,5,11));
        sportif sp5 = new sportif("Moch", "Arnaud", LocalDate.of(1999,1,18));

        nouvelleCompetition.inscription(sp1);
        nouvelleCompetition.inscription(sp2);
        nouvelleCompetition.inscription(sp3);
        nouvelleCompetition.inscription(sp4);
        nouvelleCompetition.inscription(sp5);

        for (sportif participants : nouvelleCompetition.getParticipants()){
            System.out.println(participants.getPrenom());
        }
    }
}
