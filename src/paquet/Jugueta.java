package paquet;

import java.util.HashSet;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Jugueta {
    private float preuVentaJugueta;
    private String nomJugueta;
    private String descripcioJugueta;
    private int existencies;
    private Classificacio classificacio;
    private Marca marca;
    private Tipus tipus;

    public float getPreuVentaJugueta() {
        return preuVentaJugueta;
    }

    public String getNomJugueta() {
        return nomJugueta;
    }

    public String getDescripcioJugueta() {
        return descripcioJugueta;
    }

    public int getExistencies() {
        return existencies;
    }

    public Classificacio getClassificacio() {
        return classificacio;
    }

    public Marca getMarca() {
        return marca;
    }

    public Tipus getTipus() {
        return tipus;
    }

    public void setPreuVentaJugueta(float preuVentaJugueta) {
        this.preuVentaJugueta = preuVentaJugueta;
    }

    public void setNomJugueta(String nomJugueta) {
        this.nomJugueta = nomJugueta;
    }

    public void setDescripcioJugueta(String descripcioJugueta) {
        this.descripcioJugueta = descripcioJugueta;
    }

    public void setExistencies(int existencies) {
        this.existencies = existencies;
    }

    public void setClassificacio(Classificacio classificacio) {
        this.classificacio = classificacio;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setTipus(Tipus tipus) {
        this.tipus = tipus;
    }
    
    
    
    public void juguetaHashSet() {
        HashSet<Jugueta> Juguetes = new HashSet<>();
        
    }
}
