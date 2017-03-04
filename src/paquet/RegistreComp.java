package paquet;



/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class RegistreComp {

    private String dataRegistre;
    private int quantitat;
    private float preuReg;
    private int descompte;
    private Jugueta jugueta;

    public String getDataRegistre() {
        return dataRegistre;
    }

    public void setDataRegistre(String dataRegistre) {
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

    public RegistreComp(String dataRegistre, int quantitat, int descompte, Jugueta jugueta) {
        this.dataRegistre = dataRegistre;
        this.quantitat = quantitat;
        this.descompte = descompte;
        this.jugueta = jugueta;
    }

    @Override
    public String toString() {
        return "RegistreComp{" + "dataRegistre=" + dataRegistre + ", quantitat=" + quantitat + ", preuReg=" + preuReg + ", descompte=" + descompte + ", jugueta=" + jugueta + '}';
    }
}