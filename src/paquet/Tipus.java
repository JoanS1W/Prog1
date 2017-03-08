package paquet;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Tipus {

    private String nomTipus;

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
