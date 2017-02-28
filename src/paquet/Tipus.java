package paquet;

import java.util.HashSet;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Tipus {
   private String nomTipus;

    public String getNomTipus() {
        return nomTipus;
    }

    public void setNomTipus(String nomTipus) {
        this.nomTipus = nomTipus;
    }

    public Tipus(String nomTipus) {
        this.nomTipus = nomTipus;
    }

    @Override
    public String toString() {
        return "Tipus{" + "nomTipus=" + nomTipus + '}';
    }
    
    public void tipusHashSet(){
        HashSet<Tipus> tipus = new HashSet<>();
        Tipus Consola = new Tipus("Consola");
        Tipus Construir = new Tipus("Construir");
        Tipus Trencaclosques = new Tipus("Trencaclosques");
        
        tipus.add(Consola);
        tipus.add(Construir);
        tipus.add(Trencaclosques);
    }
}
