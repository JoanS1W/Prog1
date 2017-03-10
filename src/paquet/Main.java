package paquet;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Main {

    public static void main(String[] args) {

        Empresa p = new Empresa();

        //Primera consulta
        Date dataNecesaria = new Date(117, 1, 21);
        ArrayList<RegistreComp> llistaCompres = p.cercaRegistre("Pere Ramon Vives", dataNecesaria);
        if (llistaCompres != null) {
            for (RegistreComp s : llistaCompres) {
                System.out.println(s);
            }
        } else {
            System.out.println("No ha comprat cap producte aquest dia.");
        }

        //Segona consulta
        Date dataNecesaria2 = new Date(117, 2, 14);
        System.out.println(p.tornaNumJuguetesVenudes("PlayStation5", dataNecesaria2));

        //Tercera consulta
        ArrayList<String> llistaPreuProveidor = p.preuJuguetaProveidor("CastellPlaymobil");

        if (llistaPreuProveidor != null) {
            for (String s : llistaPreuProveidor) {
                System.out.println(s);
            }
        } else {
            System.out.println("No tenim cap proveidor que vengui aquesta jugueta");
        }

        //Quarta consulta
        Date dataInici = new Date(117, 1, 1);
        Date dataFinal = new Date(117, 2, 30);
        System.out.println(p.facturacioMensualClient("Pere Ramon Vives", dataInici, dataFinal) + "€");

        //Cinquena consulta
        System.out.println(p.facturacioJuguetaMesPassat("NintendoNx") + "€");

        //Sisena consulta
        ArrayList<String> llistaJuguetesMarca = p.juguetesMarca("Nintendo");
        if (llistaJuguetesMarca != null) {
            for (String s : llistaJuguetesMarca) {
                System.out.println(s);
            }
        } else {
            System.out.println("No tenim cap jugueta d'aquesta marca");
        }
    }
}
