package paquet;

import java.util.ArrayList;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Comprador {

    //Atributs
    private String nomComprador;
    private ArrayList<RegistreComp> registre;
    private Contacte contacte;

    //Metodes
    public String getNomComprador() {
        return nomComprador;
    }

    public ArrayList<RegistreComp> getRegistre() {
        return registre;
    }

    public Contacte getContacte() {
        return contacte;
    }

    public Comprador(String nomComprador, ArrayList<RegistreComp> registre, Contacte contacte) {
        this.nomComprador = nomComprador;
        this.registre = registre;
        this.contacte = contacte;
    }

    @Override
    public String toString() {
        return "Comprador{" + "nomComprador=" + nomComprador + ", registre=" + registre + ", contacte=" + contacte + '}';
    }

}
