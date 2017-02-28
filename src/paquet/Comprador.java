package paquet;

import java.util.HashSet;

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

    public void setNomComprador(String nomComprador) {
        this.nomComprador = nomComprador;
    }

    public void setRegistre(RegistreComp registre) {
        this.registre = registre;
    }

    public void setContacte(Contacte contacte) {
        this.contacte = contacte;
    }

    public Comprador(String nomComprador, RegistreComp registre, Contacte contacte) {
        this.nomComprador = nomComprador;
        this.registre = registre;
        this.contacte = contacte;
    }
    public void compradorHashSet(){
        HashSet<Comprador> comprador = new HashSet<>();
        Comprador comprador1 = new Comprador("Pere Ramon Vives", registre, contacte);
        Comprador comprador2 = new Comprador("Mateu Perez Munar", registre, contacte);
        Comprador comprador3 = new Comprador("Josep Quetglas Esteve", registre, contacte);
    }
}
