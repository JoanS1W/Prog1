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
    private ArrayList<DetallProveidor> juguetes;

    //Metodes

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


    public ArrayList<DetallProveidor> getJuguetes() {
        return juguetes;
    }


    public Proveidor(String nomProveidor, Marca marca, Contacte contacte, RegistreProv registre, ArrayList<DetallProveidor> juguetes) {
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
