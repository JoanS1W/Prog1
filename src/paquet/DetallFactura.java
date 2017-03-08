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
public class DetallFactura {
    String jugueta;
    float preu;
    int quantitat;

    public String getJugueta() {
        return jugueta;
    }

    public float getPreu() {
        return preu;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public void setJugueta(String jugueta) {
        this.jugueta = jugueta;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }

    public DetallFactura(String jugueta, float preu, int quantitat) {
        this.jugueta = jugueta;
        this.preu = preu;
        this.quantitat = quantitat;
    }

    @Override
    public String toString() {
        return "DetallFactura{" + "jugueta=" + jugueta + ", preu=" + preu + ", quantitat=" + quantitat + '}';
    }
    
}
