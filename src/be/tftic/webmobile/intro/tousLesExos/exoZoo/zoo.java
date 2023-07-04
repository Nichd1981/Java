package be.tftic.webmobile.intro.tousLesExos.exoZoo;

import java.util.HashSet;

    public class zoo {
        private HashSet<animales> animales = new HashSet<>();
        public void ajouter(animales animales){
            animales.add(animales);
    }
        public HashSet<animales>getAnimales(){
            return new HashSet<>(animales);
    }
}
