package paquet;

import java.util.Date;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Main {

    public static void main(String[] args) {
        
        //Metodes per a fer proves amb les classes:
        //Classificació es una enumeració, no fa falta fer proves.
        //

        //Primera consulta
        Date dataNecesaria = new Date(115, 6, 24);
        Empresa p = new Empresa();
        p.cercaRegistre("Pep Franxesc de la Vila", dataNecesaria);

        //Segona consulta
        Date dataNecesaria2 = new Date(115, 8, 15);
        System.out.println(p.tornaNumJuguetesVenudes("PlayStation5", dataNecesaria2));

        //Tercera consulta//Intentar modificar com surt la consulta
        System.out.println(p.preuJuguetaProveidor("CastellPlaymobil"));
    }
}
