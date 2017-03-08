package paquet;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Tipus {

    //Atributs
    private String nomTipus;

    //Metodes
    public String getNomTipus() {
        return nomTipus;
    }

    public Tipus(String nomTipus) {
        this.nomTipus = nomTipus;
    }

    @Override
    public String toString() {
        return "Tipus{" + "nomTipus=" + nomTipus + '}';
    }
}
