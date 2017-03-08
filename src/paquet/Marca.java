package paquet;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Marca {

    private String nomMarca;
    private Contacte contacte;

    public String getNomMarca() {
        return nomMarca;
    }

    public Contacte getContacte() {
        return contacte;
    }

    public Marca(String nomMarca, Contacte contacte) {
        this.nomMarca = nomMarca;
        this.contacte = contacte;
    }

    @Override
    public String toString() {
        return "Marca{" + "nomMarca=" + nomMarca + ", contacte=" + contacte + '}';
    }
}
