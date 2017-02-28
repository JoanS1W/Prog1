package paquet;

import java.util.HashSet;

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
    
        public void setNomMarca(String nomMarca) {
        this.nomMarca = nomMarca;
    }

    public void setContacte(Contacte contacte) {
        this.contacte = contacte;
    }

    public Marca(String nomMarca, Contacte contacte) {
        this.nomMarca = nomMarca;
        this.contacte = contacte;
    }

    @Override
    public String toString() {
        return "Marca{" + "nomMarca=" + nomMarca + ", contacte=" + contacte + '}';
    }
    
    public void marcaHashSet(){
        HashSet<Marca> marca = new HashSet<>();
        Marca Nintendo = new Marca("Nintendo", contacte);
        Marca Playmobil = new Marca("Playmobil", contacte);
        Marca Playstation = new Marca("Playstation", contacte);
         
        marca.add(Nintendo);
        marca.add(Playmobil);
        marca.add(Playstation);
    }
}
