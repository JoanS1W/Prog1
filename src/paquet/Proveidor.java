package paquet;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Proveidor {

    private String nomProveidor;
    private Marca marca;
    private Contacte contacte;
    private RegistreProv registre;

    public String getNomProveidor() {
        return nomProveidor;
    }

    public Marca getMarca() {
        return marca;
    }

    public Contacte getContacte() {
        return contacte;
    }

    public RegistreProv getRegistre() {
        return registre;
    }

    public Proveidor(String nomProveidor, Marca marca, Contacte contacte, RegistreProv registre) {
        this.nomProveidor = nomProveidor;
        this.marca = marca;
        this.contacte = contacte;
        this.registre = registre;
    }

    @Override
    public String toString() {
        return "Proveidor{" + "nomProveidor=" + nomProveidor + ", marca=" + marca + ", contacte=" + contacte + ", registre=" + registre + '}';
    }

}
