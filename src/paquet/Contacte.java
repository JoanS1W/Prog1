package paquet;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Contacte {

    private String nom;
    private String telefon;
    private String email;
    private String zip;
    private String direccio;

    public String getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

    public String getZip() {
        return zip;
    }

    public String getDireccio() {
        return direccio;
    }

    public String getNom() {
        return nom;
    }

    public Contacte(String nom, String telefon, String email, String zip, String direccio) {
        this.nom = nom;
        this.telefon = telefon;
        this.email = email;
        this.zip = zip;
        this.direccio = direccio;
    }

    @Override
    public String toString() {
        return "Contacte{" + "nom=" + nom + ", telefon=" + telefon + ", email=" + email + ", zip=" + zip + ", direccio=" + direccio + '}';
    }

}
