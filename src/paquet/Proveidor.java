package paquet;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Proveidor {

    //Atributs
    private String nomProveidor;
    private Marca marca;
    private Contacte contacte;
    private RegistreProv registre;
    private ArrayList<DetallFacturaComprador> juguetes;

    //Metodes

    public String getNomProveidor() {
        return nomProveidor;
    }

    public void setNomProveidor(String nomProveidor) {
        this.nomProveidor = nomProveidor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Contacte getContacte() {
        return contacte;
    }

    public void setContacte(Contacte contacte) {
        this.contacte = contacte;
    }

    public RegistreProv getRegistre() {
        return registre;
    }

    public void setRegistre(RegistreProv registre) {
        this.registre = registre;
    }

    public ArrayList<DetallFacturaComprador> getJuguetes() {
        return juguetes;
    }

    public void setJuguetes(ArrayList<DetallFacturaComprador> juguetes) {
        this.juguetes = juguetes;
    }

    public Proveidor(String nomProveidor, Marca marca, Contacte contacte, RegistreProv registre, ArrayList<DetallFacturaComprador> juguetes) {
        this.nomProveidor = nomProveidor;
        this.marca = marca;
        this.contacte = contacte;
        this.registre = registre;
        this.juguetes = juguetes;
    }

    @Override
    public String toString() {
        return "Proveidor{" + "nomProveidor=" + nomProveidor + ", marca=" + marca + ", contacte=" + contacte + ", registre=" + registre + ", juguetes=" + juguetes + '}';
    }
}
