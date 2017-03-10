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
public class DetallProveidor {

    //Atributs
    private Jugueta jugueta;
    private float preu;
    private int quantitat;

    //Metodes
    public Jugueta getJugueta() {
        return jugueta;
    }

    public float getPreu() {
        return preu;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public DetallProveidor(Jugueta jugueta, float preu, int quantitat) {
        this.jugueta = jugueta;
        this.preu = preu;
        this.quantitat = quantitat;
    }

    @Override
    public String toString() {
        return "DetallFactura{" + "jugueta=" + jugueta + ", preu=" + preu + ", quantitat=" + quantitat + '}';
    }

}
