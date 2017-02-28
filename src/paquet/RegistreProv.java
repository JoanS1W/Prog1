package paquet;

import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class RegistreProv {

    private Date dataRegistre;
    private int unitats;
    private int preuProveidor;
    private Jugueta jugueta;

    public Date getDataRegistre() {
        return dataRegistre;
    }

    public int getUnitats() {
        return unitats;
    }

    public int getPreuProveidor() {
        return preuProveidor;
    }

    public Jugueta getJugueta() {
        return jugueta;
    }

    public void setDataRegistre(Date dataRegistre) {
        this.dataRegistre = dataRegistre;
    }

    public void setUnitats(int unitats) {
        this.unitats = unitats;
    }

    public void setPreuProveidor(int preuProveidor) {
        this.preuProveidor = preuProveidor;
    }

    public void setJugueta(Jugueta jugueta) {
        this.jugueta = jugueta;
    }

    public RegistreProv(Date dataRegistre, int unitats, int preuProveidor, Jugueta jugueta) {
        this.dataRegistre = dataRegistre;
        this.unitats = unitats;
        this.preuProveidor = preuProveidor;
        this.jugueta = jugueta;
    }

    @Override
    public String toString() {
        return "RegistreProv{" + "dataRegistre=" + dataRegistre + ", unitats=" + unitats + ", preuProveidor=" + preuProveidor + ", jugueta=" + jugueta + '}';
    }

    public void registreCompHashSet() {
        HashSet<RegistreProv> registreProv = new HashSet<>();

    }
}
