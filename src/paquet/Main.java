package paquet;

import java.util.Date;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Main {

    //Metodes per a fer proves amb les classes:
    //Classificació es una enumeració, no fa falta fer proves.
    //Comprador:
    /*public void provaComprador() {
        Comprador prova = new Comprador("NomComprador", registre, contacte);
        
    }*/
    public static void main(String[] args) {

        //Primera consulta
        Date dataNecesaria = new Date(117, 1, 21);
        Empresa p = new Empresa();
        System.out.println(p.cercaRegistre("Pere Ramon Vives", dataNecesaria));

        //Segona consulta
        Date dataNecesaria2 = new Date(117, 2, 14);
        System.out.println(p.tornaNumJuguetesVenudes("PlayStation5", dataNecesaria2));

        //Tercera consulta//Intentar modificar com surt la consulta
        System.out.println(p.preuJuguetaProveidor("CastellPlaymobil"));

        //Quarta consulta
        Date dataInici = new Date(117, 1, 1);
        Date dataFinal = new Date(117, 2, 30);
        System.out.println(p.facturacioMensual("Pere Ramon Vives", dataInici, dataFinal));

        //Cinquena consulta
        Date dataSegonaInici = new Date(117, 1, 1);
        Date dataSegonaFinal = new Date(117, 1, 30);
        System.out.println(p.facturacioMesPassat("NintendoNx"));
        p.registreCompArrayList();
        //Sisena consulta
    }
}
