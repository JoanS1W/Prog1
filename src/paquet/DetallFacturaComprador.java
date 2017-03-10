/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquet;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class DetallFacturaComprador {

    //Atributs
    private Jugueta jugueta;
    private float preuJugueta;
    private int quantitat;

    //Metodes
    public Jugueta getJugueta() {
        return jugueta;
    }

    public float getPreuJugueta() {
        return preuJugueta;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public DetallFacturaComprador(Jugueta jugueta, float preuJugueta, int quantitat) {
        this.jugueta = jugueta;
        this.preuJugueta = preuJugueta;
        this.quantitat = quantitat;
    }

    @Override
    public String toString() {
        return "DetallFacturaComprador{" + "jugueta=" + jugueta + ", preuJugueta=" + preuJugueta + ", quantitat=" + quantitat + '}';
    }

}
