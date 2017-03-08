package paquet;

import java.util.Date;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Main {

    public static void main(String[] args) {

        Empresa o = new Empresa();
        Date dataConsulta = new Date(115, 6, 24);
        System.out.println(o.exercici11("Pere Ramon Vives", dataConsulta));

    }
}
