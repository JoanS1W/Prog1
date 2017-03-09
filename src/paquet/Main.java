package paquet;

import java.util.Date;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Main {

    public static void main(String[] args) {

        Empresa p = new Empresa();
        //Primera consulta
        System.out.println(p.juntaNomPreu("PlayStation5"));

        //Segona consulta
        //Date dataConsulta2 = new Date(115, 6, 24);
        //System.out.println(o.exercici22("PlayStation5", dataConsulta2));
    }
}
