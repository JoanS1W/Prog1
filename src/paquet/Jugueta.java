package paquet;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Jugueta {

    //Atributs
    private float preuVentaJugueta;
    private String nomJugueta;
    private String descripcioJugueta;
    private int existencies;
    private Classificacio classificacio;
    private Marca marca;
    private Tipus tipus;

    //Metodes
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

    public Jugueta(float preuVentaJugueta, String nomJugueta, String descripcioJugueta, int existencies, Classificacio classificacio, Marca marca, Tipus tipus) {
        this.preuVentaJugueta = preuVentaJugueta;
        this.nomJugueta = nomJugueta;
        this.descripcioJugueta = descripcioJugueta;
        this.existencies = existencies;
        this.classificacio = classificacio;
        this.marca = marca;
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return "Jugueta{" + "preuVentaJugueta=" + preuVentaJugueta + ", nomJugueta=" + nomJugueta + ", descripcioJugueta=" + descripcioJugueta + ", existencies=" + existencies + ", classificacio=" + classificacio + ", marca=" + marca + ", tipus=" + tipus + '}';
    }
}
