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
    private double descompte;
    private double preuReg;
    private ArrayList<DetallFacturaComprador> detall;
    

    //Metodes

    public int getId() {
        return id;
    }

    public Date getDataRegistre() {
        return dataRegistre;
    }

    public double getDescompte() {
        return descompte;
    }

    public double getPreuReg() {
        return preuReg;
    }

    public ArrayList<DetallFacturaComprador> getDetall() {
        return detall;
    }

    public RegistreComp(int id, Date dataRegistre, double descompte, double preuReg, ArrayList<DetallFacturaComprador> detall) {
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