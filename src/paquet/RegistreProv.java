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
    private String jugueta;

    public Date getDataRegistre() {
        return dataRegistre;
    }

    public int getUnitats() {
        return unitats;
    }

    public float getPreuProveidor() {
        return preuProveidor;
    }

    public String getJugueta() {
        return jugueta;
    }

    public int getId() {
        return id;
    }

    public RegistreProv(int id, Date dataRegistre, int unitats, float preuProveidor, String jugueta) {
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
