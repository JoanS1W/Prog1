package paquet;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class RegistreProv {

    //Atributs
    private int id;
    private Date dataRegistre;
    private ArrayList<DetallFactura> detallRegistre;

    public void setId(int id) {
        this.id = id;
    }

    public void setDataRegistre(Date dataRegistre) {
        this.dataRegistre = dataRegistre;
    }

    //Metodes
    public void setDetallRegistre(ArrayList detallRegistre) {
        this.detallRegistre = detallRegistre;
    }

    @Override
    public String toString() {
        return "RegistreProv{" + "id=" + id + ", dataRegistre=" + dataRegistre + ", detallRegistre=" + detallRegistre + '}';
    }

    public RegistreProv(int id, Date dataRegistre, ArrayList detallRegistre) {
        this.id = id;
        this.dataRegistre = dataRegistre;
        this.detallRegistre = detallRegistre;
    }

    public int getId() {
        return id;
    }

    public Date getDataRegistre() {
        return dataRegistre;
    }

    public ArrayList getDetallRegistre() {
        return detallRegistre;
    }


}
