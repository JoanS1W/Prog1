package paquet;

import java.util.Date;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class RegistreComp {

    private int id;
    private Date dataRegistre;
    private int quantitat;
    private float preuReg;
    private int descompte;
    private Jugueta jugueta;

    public Date getDataRegistre() {
        return dataRegistre;
    }

    public void setDataRegistre(Date dataRegistre) {
        this.dataRegistre = dataRegistre;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }

    public float getPreuReg() {
        return preuReg;
    }

    public void setPreuReg(float preuReg) {
        this.preuReg = preuReg;
    }

    public int getDescompte() {
        return descompte;
    }

    public void setDescompte(int descompte) {
        this.descompte = descompte;
    }

    public Jugueta getJugueta() {
        return jugueta;
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

    public RegistreComp(int id, Date dataRegistre, int quantitat, float preuReg, int descompte, Jugueta jugueta) {
        this.id = id;
        this.dataRegistre = dataRegistre;
        this.quantitat = quantitat;
        this.preuReg = preuReg;
        this.descompte = descompte;
        this.jugueta = jugueta;
    }

    @Override
    public String toString() {
        return "RegistreComp{" + "id=" + id + ", dataRegistre=" + dataRegistre + ", quantitat=" + quantitat + ", preuReg=" + preuReg + ", descompte=" + descompte + ", jugueta=" + jugueta + '}';
    }

}