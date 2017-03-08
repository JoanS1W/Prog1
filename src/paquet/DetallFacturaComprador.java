/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquet;

/**
 *
 * @author salva
 */
public class DetallFacturaComprador {
    private String jugueta;
    private float preuJugueta;
    private int quantitat;

    public String getJugueta() {
        return jugueta;
    }

    public void setJugueta(String jugueta) {
        this.jugueta = jugueta;
    }

    public float getPreuJugueta() {
        return preuJugueta;
    }

    public void setPreuJugueta(float preuJugueta) {
        this.preuJugueta = preuJugueta;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }

    public DetallFacturaComprador(String jugueta, float preuJugueta, int quantitat) {
        this.jugueta = jugueta;
        this.preuJugueta = preuJugueta;
        this.quantitat = quantitat;
    }

    @Override
    public String toString() {
        return "DetallFacturaComprador{" + "jugueta=" + jugueta + ", preuJugueta=" + preuJugueta + ", quantitat=" + quantitat + '}';
    }
    
    
}
