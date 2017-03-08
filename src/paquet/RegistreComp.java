package paquet;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class RegistreComp {

    //Atributs
    private int id;
    private Date dataRegistre;
    private int descompte;
    private float preuReg;
    private ArrayList<DetallFacturaComprador> detall;
    

    //Metodes

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataRegistre() {
        return dataRegistre;
    }

    public void setDataRegistre(Date dataRegistre) {
        this.dataRegistre = dataRegistre;
    }

    public int getDescompte() {
        return descompte;
    }

    public void setDescompte(int descompte) {
        this.descompte = descompte;
    }

    public float getPreuReg() {
        return preuReg;
    }

    public void setPreuReg(float preuReg) {
        this.preuReg = preuReg;
    }

    public ArrayList<DetallFacturaComprador> getDetall() {
        return detall;
    }

    public void setDetall(ArrayList<DetallFacturaComprador> detall) {
        this.detall = detall;
    }

    public RegistreComp(int id, Date dataRegistre, int descompte, float preuReg, ArrayList<DetallFacturaComprador> detall) {
        this.id = id;
        this.dataRegistre = dataRegistre;
        this.descompte = descompte;
        this.preuReg = preuReg;
        this.detall = detall;
    }

    @Override
    public String toString() {
        return "RegistreComp{" + "id=" + id + ", dataRegistre=" + dataRegistre + ", descompte=" + descompte + ", preuReg=" + preuReg + ", detall=" + detall + '}';
    }



}  