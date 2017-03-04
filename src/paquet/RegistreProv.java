package paquet;

import java.util.Date;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class RegistreProv {

    private String dataRegistre;
    private int unitats;
    private float preuProveidor;
    private Jugueta jugueta;

    public String getDataRegistre() {
        return dataRegistre;
    }

    public int getUnitats() {
        return unitats;
    }

    public float getPreuProveidor() {
        return preuProveidor;
    }

    public Jugueta getJugueta() {
        return jugueta;
    }

    public void setDataRegistre(String dataRegistre) {
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

    public RegistreProv(String dataRegistre, int unitats, float preuProveidor, Jugueta jugueta) {
        this.dataRegistre = dataRegistre;
        this.unitats = unitats;
        this.preuProveidor = preuProveidor;
        this.jugueta = jugueta;
    }

    @Override
    public String toString() {
        return "RegistreProv{" + "dataRegistre=" + dataRegistre + ", unitats=" + unitats + ", preuProveidor=" + preuProveidor + ", jugueta=" + jugueta + '}';
    }
}
