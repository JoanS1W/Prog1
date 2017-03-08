package paquet;

import java.util.Date;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Main {

    public static void main(String[] args) {

        Empresa o = new Empresa();
        //Primera consulta
        Date dataConsulta = new Date(115, 6, 24);
        System.out.println(o.cercaRegistre("Pere Ramon Vives", dataConsulta));

        //Segona consulta
        //Date dataConsulta2 = new Date(115, 6, 24);
        //System.out.println(o.exercici22("PlayStation5", dataConsulta2));
    }
}
