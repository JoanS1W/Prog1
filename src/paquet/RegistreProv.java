package paquet;

import java.util.Date;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class RegistreProv {

    private int id;
    private Date dataRegistre;
    private int unitats;
    private float preuProveidor;
    private Jugueta jugueta;

    public Date getDataRegistre() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPreuProveidor(float preuProveidor) {
        this.preuProveidor = preuProveidor;
    }

    public RegistreProv(int id, Date dataRegistre, int unitats, float preuProveidor, Jugueta jugueta) {
        this.id = id;
        this.dataRegistre = dataRegistre;
        this.unitats = unitats;
        this.preuProveidor = preuProveidor;
        this.jugueta = jugueta;
    }

    @Override
    public String toString() {
        return "RegistreProv{" + "id=" + id + ", dataRegistre=" + dataRegistre + ", unitats=" + unitats + ", preuProveidor=" + preuProveidor + ", jugueta=" + jugueta + '}';
    }

}
