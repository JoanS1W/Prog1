package paquet;

import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class RegistreComp {

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

    public RegistreComp(Date dataRegistre, int quantitat, float preuReg, int descompte, Jugueta jugueta) {
        this.dataRegistre = dataRegistre;
        this.quantitat = quantitat;
        this.preuReg = preuReg;
        this.descompte = descompte;
        this.jugueta = jugueta;
    }

    @Override
    public String toString() {
        return "RegistreComp{" + "dataRegistre=" + dataRegistre + ", quantitat=" + quantitat + ", preuReg=" + preuReg + ", descompte=" + descompte + ", jugueta=" + jugueta + '}';
    }

    public void registreCompHashSet() {
        HashSet<RegistreComp> registreComp = new HashSet<>();

    }
}
