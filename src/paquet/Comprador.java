package paquet;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Comprador {

    private String nomComprador;
    private RegistreComp registre;
    private Contacte contacte;

    public String getNomComprador() {
        return nomComprador;
    }

    public RegistreComp getRegistre() {
        return registre;
    }

    public Contacte getContacte() {
        return contacte;
    }

    public Comprador(String nomComprador, RegistreComp registre, Contacte contacte) {
        this.nomComprador = nomComprador;
        this.registre = registre;
        this.contacte = contacte;
    }

    @Override
    public String toString() {
        return "Comprador{" + "nomComprador=" + nomComprador + ", registre=" + registre + ", contacte=" + contacte + '}';
    }

}
