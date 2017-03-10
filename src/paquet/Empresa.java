package paquet;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Empresa {

    //Atributs
    private ArrayList<Tipus> tipus = new ArrayList<>();
    private ArrayList<Contacte> contactes = new ArrayList<>();
    private ArrayList<Marca> marques = new ArrayList<>();
    private ArrayList<Jugueta> juguetes = new ArrayList<>();
    private ArrayList<RegistreComp> registresComp = new ArrayList<>();
    private ArrayList<Comprador> compradors = new ArrayList<>();
    private ArrayList<RegistreProv> registresProv = new ArrayList<>();
    private ArrayList<Proveidor> proveidors = new ArrayList<>();

    //Metodes
    //Constructor que inicialitza tots els metodes per a tenir els ArrayLists amb totes les dades necesaries.
    public Empresa() {
        tipusArrayList();
        contacteArrayList();
        marcaArrayList();
        juguetaArrayList();
        registreCompArrayList();
        compradorArrayList();
        registreProvArrayList();
        proveidorArrayList();
    }

    //Metode per a obtenir la llista de proveidors que ens venen una jugueta i el seu preu.
    public ArrayList<String> preuJuguetaProveidor(String nomJugueta) {
        ArrayList<String> llistaJuguetaProveidor = new ArrayList<>();
        boolean trigger = false;

        int llargaria = proveidors.size();
        for (int e = 0; e < llargaria; e++) {
            Proveidor proveidor = proveidors.get(e);
            int llargaria2 = proveidor.getJuguetes().size();
            for (int i = 0; i < llargaria2; i++) {
                if (proveidor.getJuguetes().get(i).getJugueta().getNomJugueta().equals(nomJugueta)) {
                    if (proveidor.getJuguetes().get(i).getPreu() == 0) {
                        trigger = true;
                        llistaJuguetaProveidor.add("El proveidor " + proveidor.getNomProveidor() + " | Preu: no definit");
                    } else {
                        trigger = true;
                        llistaJuguetaProveidor.add("El proveidor " + proveidor.getNomProveidor() + " | Preu:" + proveidor.getJuguetes().get(i).getPreu() + "€");
                    }
                }
            }
        }
        if (trigger) {
            return llistaJuguetaProveidor;
        } else {
            return null;
        }

    }

    //Metode per a obtenir la llista de registres de compra d'un client en una data determinada.
    public ArrayList<RegistreComp> cercaRegistre(String nomProveidor, Date data) {
        boolean trigger = false;

        ArrayList<RegistreComp> registres = new ArrayList<>();
        int llargaria = compradors.size();
        for (int i = 0; i < llargaria; i++) {
            Comprador comp = compradors.get(i);
            int llargaria2 = comp.getRegistre().size();
            for (int e = 0; e < llargaria2; e++) {
                if (comp.getNomComprador().equals(nomProveidor) && comp.getRegistre().get(e).getDataRegistre().equals(data)) {
                    trigger = true;
                    registres.add(comp.getRegistre().get(e));
                }
            }
        }
        if (trigger) {
            return registres;
        } else {
            return null;
        }
    }

    //Metode per a obtenir la llista de juguetes venudes en una data determinada.
    public String tornaNumJuguetesVenudes(String nomJugueta, Date data) {
        int llargaria = registresComp.size();
        int compres = 0;
        for (int i = 0; i < llargaria; i++) {
            RegistreComp registre = registresComp.get(i);
            int llargaria2 = registre.getDetall().size();
            for (int e = 0; e < llargaria2; e++) {
                if (registre.getDetall().get(e).getJugueta().getNomJugueta().equals(nomJugueta) && registre.getDataRegistre().equals(data)) {
                    compres = compres + registre.getDetall().get(e).getQuantitat();
                }
            }
        }
        return "De " + nomJugueta + " s'han comprat " + compres + " unitats";
    }

    //Metode per a obtenir la facturacio d'una determinada jugueta en el mes passat.
    public float facturacioJuguetaMesPassat(String nomJugueta) {
        float facturacio = 0;
        int llargaria = compradors.size();
        for (int i = 0; i < llargaria; i++) {
            Comprador comp = compradors.get(i);
            int llargaria2 = comp.getRegistre().size();
            Calendar c = new GregorianCalendar();
            int meses = (c.get(Calendar.MONTH));
            int ano = (c.get(Calendar.YEAR));
            Date data = new Date((ano - 1900), (meses - 1), 1);
            Date data2 = new Date((ano - 1900), (meses - 1), 31);
            for (int e = 0; e < llargaria2; e++) {
                if (comp.getRegistre().get(i).getDataRegistre().after(data) && comp.getRegistre().get(i).getDataRegistre().before(data2) && comp.getRegistre().get(i).getDetall().get(e).getJugueta().getNomJugueta().equals(nomJugueta)) {
                    float suma = (comp.getRegistre().get(i).getDetall().get(e).getPreuJugueta() * comp.getRegistre().get(i).getDetall().get(e).getQuantitat());
                    return facturacio + suma;
                }//Aquest return hauria d'estar fora del for per que aixi s'atura quan es troba amb el primer element
            }//i per tant no suma els elements següents, pero ens dona error i no trobam manera d'arreglar-ho, aixi que el deixam aixi.
        }
        return 0;
    }

    //Metode per a obtenir la facturacio d'un determinat client en el mes actual.
    public double facturacioMensualClient(String nomComprador, Date data1, Date data2) {
        float total = 0;
        int llargaria = compradors.size();
        for (int i = 0; i < llargaria; i++) {
            Comprador comp = compradors.get(i);
            int llargaria2 = comp.getRegistre().size();
            for (int e = 0; e < llargaria2; e++) {
                if (comp.getNomComprador().equals(nomComprador) && (comp.getRegistre().get(e).getDataRegistre().after(data1) && comp.getRegistre().get(e).getDataRegistre().before(data2))) {
                    return total + comp.getRegistre().get(e).getPreuReg();
                }//Aquest return hauria d'estar fora del for per que aixi s'atura quan es troba amb el primer element
            }//i per tant no suma els elements següents, pero ens dona error i no trobam manera d'arreglar-ho, aixi que el deixam aixi.
        }
        return 0;
    }

    //Metode per a obtenir la llista de juguetes d'una determianda marca.
    public ArrayList<String> juguetesMarca(String nomMarca) {
        boolean trigger = false;

        ArrayList<String> llistaJuguetes = new ArrayList<>();
        int llargaria = juguetes.size();
        for (int i = 0; i < llargaria; i++) {
            Jugueta jugueta = juguetes.get(i);
            if (jugueta.getMarca().getNomMarca().equals(nomMarca)) {
                trigger = true;
                llistaJuguetes.add(jugueta.getNomJugueta());
            }
        }
        if (trigger) {
            return llistaJuguetes;
        } else {
            return null;
        }
    }

    //Metode per a trobar els atributs tipus de dins dels arrayList
    private Tipus trobaTipus(String nom) {
        int llargaria = tipus.size();
        for (int i = 0; i < llargaria; i++) {
            Tipus tip = tipus.get(i);
            if (tip.getNomTipus().equals(nom)) {
                return tip;
            }
        }
        return null;
    }

    //Metode per a trobar els atributs registreProv de dins dels arrayList
    private RegistreProv trobaRegistreProv(int id) {
        int llargaria = registresProv.size();
        for (int i = 0; i < llargaria; i++) {
            RegistreProv regPro = registresProv.get(i);
            if (regPro.getId() == id) {
                return regPro;
            }
        }
        return null;
    }

    //Metode per a trobar els atributs registreComp de dins dels arrayList
    private RegistreComp trobaRegistreComp(int id) {
        int llargaria = registresComp.size();
        for (int i = 0; i < llargaria; i++) {
            RegistreComp regComp = registresComp.get(i);
            if (regComp.getId() == id) {
                return regComp;
            }
        }
        return null;
    }

    //Metode per a trobar els atributs marca de dins dels arrayList
    private Marca trobaMarca(String nom) {
        int llargaria = marques.size();
        for (int i = 0; i < llargaria; i++) {
            Marca mar = marques.get(i);
            if (mar.getNomMarca().equals(nom)) {
                return mar;
            }
        }
        return null;
    }

    //Metode per a trobar els atributs jugueta de dins dels arrayList
    private Jugueta trobaJugueta(String nomJugueta) {
        int llargaria = juguetes.size();
        for (int i = 0; i < llargaria; i++) {
            Jugueta jug = juguetes.get(i);
            if (jug.getNomJugueta().equalsIgnoreCase(nomJugueta)) {
                return jug;
            }
        }
        return null;
    }

    //Metode per a trobar els atributs contacte de dins dels arrayList
    private Contacte trobaContacte(String nom) {
        int llargaria = contactes.size();
        for (int i = 0; i < llargaria; i++) {
            Contacte cont = contactes.get(i);
            if (cont.getNom().equals(nom)) {
                return cont;
            }
        }
        return null;
    }

    //Metode per a trobar els atributs comprador de dins dels arrayList
    private Comprador trobaComprador(String nom) {
        int llargaria = compradors.size();
        for (int i = 0; i < llargaria; i++) {
            Comprador comp = compradors.get(i);
            if (comp.getNomComprador().equals(nom)) {
                return comp;
            }
        }
        return null;
    }

    //Metode per a trobar els atributs proveidor de dins dels arrayList
    private Proveidor trobaProveidor(String nom) {
        int llargaria = proveidors.size();
        for (int i = 0; i < llargaria; i++) {
            Proveidor prov = proveidors.get(i);
            if (prov.getNomProveidor().equals(nom)) {
                return prov;
            }
        }
        return null;
    }

    //Metode per omplir l'arrayList tipus.
    private void tipusArrayList() {
        Tipus consola = new Tipus("Consola");
        Tipus construir = new Tipus("Construir");
        Tipus trencaclosques = new Tipus("Trencaclosques");

        this.tipus.add(consola);
        this.tipus.add(construir);
        this.tipus.add(trencaclosques);
    }

    //Metode per omplir l'arrayList registreProv.
    private void registreProvArrayList() {
        Date a = new Date(117, 6, 24);
        Date b = new Date(117, 8, 15);
        Date c = new Date(117, 4, 18);

        Jugueta nintendoNx = trobaJugueta("NintendoNx");
        Jugueta playStation5 = trobaJugueta("PlayStation5");
        Jugueta castellPlaymobil = trobaJugueta("CastellPlaymobil");

        DetallProveidor detallA = new DetallProveidor(nintendoNx, 123f, 4);
        DetallProveidor detallB = new DetallProveidor(playStation5, 345f, 3);
        DetallProveidor detallC = new DetallProveidor(castellPlaymobil, 86f, 1);

        ArrayList<DetallProveidor> detall1 = new ArrayList<>();
        detall1.add(detallA);

        ArrayList<DetallProveidor> detall2 = new ArrayList<>();
        detall2.add(detallB);

        ArrayList<DetallProveidor> detall3 = new ArrayList<>();
        detall3.add(detallC);

        RegistreProv registreProvA = new RegistreProv(1, a, detall1);
        RegistreProv registreProvB = new RegistreProv(2, b, detall2);
        RegistreProv registreProvC = new RegistreProv(3, c, detall3);

        this.registresProv.add(registreProvA);
        this.registresProv.add(registreProvB);
        this.registresProv.add(registreProvC);
    }

    //Metode per omplir l'arrayList registreComp.
    private void registreCompArrayList() {
        double descompte = 10;

        Date dataA = new Date(117, 1, 21);
        Date dataB = new Date(117, 2, 14);
        Date dataC = new Date(117, 4, 18);

        Jugueta nintendoNx = trobaJugueta("NintendoNx");
        Jugueta playStation5 = trobaJugueta("PlayStation5");
        Jugueta castellPlaymobil = trobaJugueta("CastellPlaymobil");

        DetallFacturaComprador detallA = new DetallFacturaComprador(nintendoNx, 320f, 4);
        DetallFacturaComprador detallB = new DetallFacturaComprador(playStation5, 540f, 3);
        DetallFacturaComprador detallC = new DetallFacturaComprador(castellPlaymobil, 125f, 1);

        ArrayList<DetallFacturaComprador> detall1 = new ArrayList<>();
        detall1.add(detallA);

        ArrayList<DetallFacturaComprador> detall2 = new ArrayList<>();
        detall2.add(detallB);

        ArrayList<DetallFacturaComprador> detall3 = new ArrayList<>();
        detall3.add(detallC);

        RegistreComp registreCompA = new RegistreComp(1, dataA, descompte, ((100 - descompte) / 100) * ((detallA.getPreuJugueta() * detallA.getQuantitat())), detall1);
        RegistreComp registreCompB = new RegistreComp(2, dataB, descompte, ((100 - descompte) / 100) * (detallB.getPreuJugueta() * detallB.getQuantitat()), detall2);
        RegistreComp registreCompC = new RegistreComp(3, dataC, descompte, ((100 - descompte) / 100) * (detallC.getPreuJugueta() * detallC.getQuantitat()), detall3);

        this.registresComp.add(registreCompA);
        this.registresComp.add(registreCompB);
        this.registresComp.add(registreCompC);
    }

    //Metode per omplir l'arrayList marca.
    private void marcaArrayList() {
        Contacte marca1 = trobaContacte("m1");
        Contacte marca2 = trobaContacte("m2");
        Contacte marca3 = trobaContacte("m3");

        Marca nintendo = new Marca("Nintendo", marca1);
        Marca playmobil = new Marca("Playmobil", marca2);
        Marca playstation = new Marca("Playstation", marca3);

        this.marques.add(nintendo);
        this.marques.add(playmobil);
        this.marques.add(playstation);
    }

    //Metode per omplir l'arrayList jugueta.
    private void juguetaArrayList() {
        Marca nintendo = trobaMarca("Nintendo");
        Marca playmobil = trobaMarca("Playmobil");
        Marca playstation = trobaMarca("Playstation");

        Tipus consola = trobaTipus("Consola");
        Tipus construir = trobaTipus("Construir");
        Tipus trencaclosques = trobaTipus("Trencaclosques");

        Jugueta nintendoNx = new Jugueta(320f, "NintendoNx", "Jugueta molt divertida", 25, Classificacio.C8_12, nintendo, consola);
        Jugueta playStation5 = new Jugueta(540f, "PlayStation5", "Jugueta de derrera generacio", 10, Classificacio.C8_12, playmobil, construir);
        Jugueta castellPlaymobil = new Jugueta(125f, "CastellPlaymobil", "Jugueta perfecta per nins petits", 14, Classificacio.C4_8, playstation, trencaclosques);

        this.juguetes.add(nintendoNx);
        this.juguetes.add(playStation5);
        this.juguetes.add(castellPlaymobil);
    }

    //Metode per omplir l'arrayList contacte.
    private void contacteArrayList() {
        Contacte marca1 = new Contacte("m1", "971548798", "qweq@gmail.com", "07140", "C/ Jardi, 24");
        Contacte marca2 = new Contacte("m2", "971784565", "gdfd@gmail.com", "07142", "C/ Mateu, 12");
        Contacte marca3 = new Contacte("m3", "971013599", "jhgjg@gmail.com", "07113", "C/ Plaça, 48");
        Contacte comprador1 = new Contacte("c1", "971852934", "bvbxc@gmail.com", "07145", "C/ Joan, 99");
        Contacte comprador2 = new Contacte("c2", "971796454", "qwer@gmail.com", "07185", "C/ Moli, 73");
        Contacte comprador3 = new Contacte("c3", "971031456", "kfgfhjg@gmail.com", "07175", "C/ Arada, 55");
        Contacte proveidor1 = new Contacte("p1", "971795135", "pioyuio@gmail.com", "07133", "C/ Uetam, 83");
        Contacte proveidor2 = new Contacte("p2", "971221345", "qwercv@gmail.com", "07179", "C/ ACDC, 44");
        Contacte proveidor3 = new Contacte("p3", "971631545", "bvzxcvxc@gmail.com", "07166", "C/ Pollentia, 6");

        this.contactes.add(marca1);
        this.contactes.add(marca2);
        this.contactes.add(marca3);
        this.contactes.add(comprador1);
        this.contactes.add(comprador2);
        this.contactes.add(comprador3);
        this.contactes.add(proveidor1);
        this.contactes.add(proveidor2);
        this.contactes.add(proveidor3);
    }

    //Metode per omplir l'arrayList comprador.
    private void compradorArrayList() {
        RegistreComp registreCompA = trobaRegistreComp(1);
        RegistreComp registreCompB = trobaRegistreComp(2);
        RegistreComp registreCompC = trobaRegistreComp(3);

        ArrayList<RegistreComp> registre1 = new ArrayList<>();
        registre1.add(registreCompA);
        ArrayList<RegistreComp> registre2 = new ArrayList<>();
        registre1.add(registreCompB);
        ArrayList<RegistreComp> registre3 = new ArrayList<>();
        registre1.add(registreCompC);

        Contacte comprador1 = trobaContacte("c1");
        Contacte comprador2 = trobaContacte("c2");
        Contacte comprador3 = trobaContacte("c3");

        Comprador compradorA = new Comprador("Pere Ramon Vives", registre1, comprador1);
        Comprador compradorB = new Comprador("Mateu Perez Munar", registre2, comprador2);
        Comprador compradorC = new Comprador("Josep Quetglas Esteve", registre3, comprador3);

        this.compradors.add(compradorA);
        this.compradors.add(compradorB);
        this.compradors.add(compradorC);
    }

    //Metode per omplir l'arrayList proveidor.
    private void proveidorArrayList() {
        RegistreProv registreProvA = trobaRegistreProv(1);
        RegistreProv registreProvB = trobaRegistreProv(2);
        RegistreProv registreProvC = trobaRegistreProv(3);

        Marca nintendo = trobaMarca("Nintendo");
        Marca playmobil = trobaMarca("Playmobil");
        Marca playstation = trobaMarca("Playstation");

        Jugueta nintendoNx = trobaJugueta("NintendoNx");
        Jugueta playStation5 = trobaJugueta("PlayStation5");
        Jugueta castellPlaymobil = trobaJugueta("CastellPlaymobil");

        Contacte proveidor1 = trobaContacte("p1");
        Contacte proveidor2 = trobaContacte("p2");
        Contacte proveidor3 = trobaContacte("p3");

        DetallProveidor detallA = new DetallProveidor(nintendoNx, 100, 25);
        DetallProveidor detallB = new DetallProveidor(playStation5, 200, 15);
        DetallProveidor detallC = new DetallProveidor(castellPlaymobil, 50, 3);

        ArrayList<DetallProveidor> juguetesA = new ArrayList<>();
        juguetesA.add(detallA);
        ArrayList<DetallProveidor> juguetesB = new ArrayList<>();
        juguetesB.add(detallB);
        ArrayList<DetallProveidor> juguetesC = new ArrayList<>();
        juguetesC.add(detallC);

        Proveidor proveidorA = new Proveidor("Pep Franxesc de la Vila", nintendo, proveidor1, registreProvA, juguetesA);
        Proveidor proveidorB = new Proveidor("Juanjo Ramon Catala", playmobil, proveidor2, registreProvB, juguetesB);
        Proveidor proveidorC = new Proveidor("Pere Llagosta Narcis", playstation, proveidor3, registreProvC, juguetesC);

        this.proveidors.add(proveidorA);
        this.proveidors.add(proveidorB);
        this.proveidors.add(proveidorC);
    }

}
