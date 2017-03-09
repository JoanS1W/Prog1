package paquet;

import java.util.ArrayList;
import java.util.Date;

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
    private ArrayList<DetallFacturaComprador> prova = new ArrayList<>();

    //Metodes
    public Empresa() {
        tipusArrayList();
        registreProvArrayList();
        registreCompArrayList();
        marcaArrayList();
        juguetaArrayList();
        contacteArrayList();
        compradorArrayList();
        proveidorArrayList();

    }

    private String sercaNom(String nomJugueta) {
        int llargaria = proveidors.size();
        for (int e = 0; e < llargaria; e++) {
            Proveidor proveidor = proveidors.get(e);
            int llargaria2 = proveidor.getJuguetes().size();
            for (int i = 0; i < llargaria2; i++) {
                if (proveidor.getJuguetes().get(i).getJugueta().getNomJugueta().equals(nomJugueta)) {
                    return proveidor.getNomProveidor();
                }
            }
        }
        return null;
    }

    private float sercaPreu(String nomJugueta) {
        int llargaria = proveidors.size();
        for (int e = 0; e < llargaria; e++) {
            Proveidor proveidor = proveidors.get(e);
            int llargaria2 = proveidor.getJuguetes().size();
            for (int i = 0; i < llargaria2; i++) {
                proveidor.getJuguetes().get(i);
                if (proveidor.getJuguetes().get(i).getJugueta().getNomJugueta().equals(nomJugueta)) {
                    return proveidor.getJuguetes().get(i).getPreuJugueta();
                }
            }
        }
        return 0;
    }

    public String juntaNomPreu(String nomJugueta) {
        int llargaria = proveidors.size();
        for (int e = 0; e < llargaria; e++) {
            Proveidor proveidor = proveidors.get(e);
            int llargaria2 = proveidor.getJuguetes().size();
            for (int i = 0; i < llargaria2; i++) {
                proveidor.getJuguetes().get(i);
                if (proveidor.getJuguetes().get(i).getJugueta().getNomJugueta().equals(nomJugueta)) {
                    if(sercaPreu(nomJugueta)==0){
                        return sercaNom(nomJugueta) + "   Preu: no definit";
                    }else {return sercaNom(nomJugueta) + "   Preu:" + sercaPreu(nomJugueta) + "€";}
                }
            }
        }
        return "No hi ha ningú que disposi del producte";
    }

    //Metode 
    public Comprador cercaRegistre(String nom, Date data) {
        int llargaria = compradors.size();
        for (int i = 0; i < llargaria; i++) {
            Comprador comp = compradors.get(i);
            if (comp.getNomComprador().equals(nom)) {
                return comp;
            }
        }
        return null;
    }

    //NOM MODIFICAR
    //Metode 
    public RegistreComp exercici11(String nom, Date data) {
        Comprador comprador = cercaRegistre(nom, data);
        return comprador.getRegistre();
    }

    /*Metode 
    private int exercici2(String nom, Date data) {
        int llargaria = registresComp.size();
        int llargaria2 = registresComp.size();
        int compres;
        for (int i = 0; i < llargaria; i++) {
            RegistreComp comp = registresComp.get(i);
            for (int e = 0; e < llargaria; e++) {
                DetallFacturaComprador compr = DetallFacturaComprador.get(e);
                if (comp.getDetall().equals(nom)) {
                    return compres = DetallFacturaComprador.getQuantitat();
                }
            }
            return 0;
        }
        //Metode per a resoldre la consulta 2
    public int exercici22(String nom, Date data) {
        int conta = exercici2(nom, data);
        return conta;
    }*/
    //Metode per a trobar els atributs tipus de dins dels arrayList
    public Tipus trobaTipus(String nom) {
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
    public RegistreProv trobaRegistreProv(int id) {
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
    public RegistreComp trobaRegistreComp(int id) {
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
    public Marca trobaMarca(String nom) {
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
    public Jugueta trobaJugueta(String nom) {
        int llargaria = juguetes.size();
        for (int i = 0; i < llargaria; i++) {
            Jugueta jug = juguetes.get(i);
            if (jug.getNomJugueta().equalsIgnoreCase(nom)) {
                return jug;
            }
        }
        return null;
    }

    //Metode per a trobar els atributs contacte de dins dels arrayList
    public Contacte trobaContacte(String nom) {
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
    public Comprador trobaComprador(String nom) {
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
    public Proveidor trobaProveidor(String nom) {
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
    public void tipusArrayList() {
        Tipus consola = new Tipus("Consola");
        Tipus construir = new Tipus("Construir");
        Tipus trencaclosques = new Tipus("Trencaclosques");

        this.tipus.add(consola);
        this.tipus.add(construir);
        this.tipus.add(trencaclosques);
    }

    //Metode per omplir l'arrayList registreProv.
    public void registreProvArrayList() {
        Date a = new Date(116, 6, 24);
        Date b = new Date(116, 8, 15);
        Date c = new Date(116, 4, 18);

        Jugueta NintendoNx = trobaJugueta("NintendoNx");
        Jugueta PlayStation5 = trobaJugueta("PlayStation5");
        Jugueta CastellPlaymobil = trobaJugueta("CastellPlaymobil");

        DetallFactura detallA = new DetallFactura(NintendoNx, 123, 4);
        DetallFactura detallB = new DetallFactura(PlayStation5, 345, 3);
        DetallFactura detallC = new DetallFactura(CastellPlaymobil, 86, 1);

        ArrayList<DetallFactura> detall1 = new ArrayList<>();
        detall1.add(detallA);

        ArrayList<DetallFactura> detall2 = new ArrayList<>();
        detall2.add(detallB);

        ArrayList<DetallFactura> detall3 = new ArrayList<>();
        detall3.add(detallC);

        RegistreProv registreProvA = new RegistreProv(1, a, detall1);
        RegistreProv registreProvB = new RegistreProv(2, b, detall2);
        RegistreProv registreProvC = new RegistreProv(3, c, detall3);

        this.registresProv.add(registreProvA);
        this.registresProv.add(registreProvB);
        this.registresProv.add(registreProvC);
    }

    //Metode per omplir l'arrayList registreComp.
    public void registreCompArrayList() {
        Date a = new Date(115, 6, 24);
        Date b = new Date(115, 8, 15);
        Date c = new Date(115, 4, 18);

        Jugueta nintendoNx = trobaJugueta("NintendoNx");
        Jugueta playStation5 = trobaJugueta("PlayStation5");
        Jugueta castellPlaymobil = trobaJugueta("CastellPlaymobil");

        DetallFacturaComprador detallA = new DetallFacturaComprador(nintendoNx, 123, 4);
        DetallFacturaComprador detallB = new DetallFacturaComprador(playStation5, 345, 3);
        DetallFacturaComprador detallC = new DetallFacturaComprador(castellPlaymobil, 86, 1);

        ArrayList<DetallFacturaComprador> detall1 = new ArrayList<>();
        detall1.add(detallA);

        ArrayList<DetallFacturaComprador> detall2 = new ArrayList<>();
        detall2.add(detallB);

        ArrayList<DetallFacturaComprador> detall3 = new ArrayList<>();
        detall3.add(detallC);

        RegistreComp registreCompA = new RegistreComp(1, a, 3, 12.24f, detall1);
        RegistreComp registreCompB = new RegistreComp(2, b, 3, 12.24f, detall2);
        RegistreComp registreCompC = new RegistreComp(3, c, 3, 12.24f, detall3);

        this.registresComp.add(registreCompA);
        this.registresComp.add(registreCompB);
        this.registresComp.add(registreCompC);
    }

    //Metode per omplir l'arrayList marca.
    public void marcaArrayList() {
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
    public void juguetaArrayList() {
        Marca nintendo = trobaMarca("Nintendo");
        Marca playmobil = trobaMarca("Playmobil");
        Marca playstation = trobaMarca("Playstation");

        Tipus consola = trobaTipus("Consola");
        Tipus construir = trobaTipus("Construir");
        Tipus trencaclosques = trobaTipus("Trencaclosques");

        Jugueta nintendoNx = new Jugueta(320f, "NintendoNx", "Jugueta molt divertida", 25, Classificacio.C8_12, nintendo, consola);
        Jugueta playStation5 = new Jugueta(540f, "PlayStation5", "Jugueta de derrera generacio", 10, Classificacio.C8_12, playmobil, construir);
        Jugueta castellPlaymobil = new Jugueta(125, "CastellPlaymobil", "Jugueta perfecta per nins petits", 14, Classificacio.C4_8, playstation, trencaclosques);

        this.juguetes.add(nintendoNx);
        this.juguetes.add(playStation5);
        this.juguetes.add(castellPlaymobil);
    }

    //Metode per omplir l'arrayList contacte.
    public void contacteArrayList() {
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
    public void compradorArrayList() {
        RegistreComp registreCompA = trobaRegistreComp(1);
        RegistreComp registreCompB = trobaRegistreComp(2);
        RegistreComp registreCompC = trobaRegistreComp(3);

        Contacte comprador1 = trobaContacte("c1");
        Contacte comprador2 = trobaContacte("c2");
        Contacte comprador3 = trobaContacte("c3");

        Comprador compradorA = new Comprador("Pere Ramon Vives", registreCompA, comprador1);
        Comprador compradorB = new Comprador("Mateu Perez Munar", registreCompB, comprador2);
        Comprador compradorC = new Comprador("Josep Quetglas Esteve", registreCompC, comprador3);

        this.compradors.add(compradorA);
        this.compradors.add(compradorB);
        this.compradors.add(compradorC);
    }

    //Metode per omplir l'arrayList proveidor.
    public void proveidorArrayList() {
        RegistreProv registreProvA = trobaRegistreProv(1);
        RegistreProv registreProvB = trobaRegistreProv(2);
        RegistreProv registreProvC = trobaRegistreProv(3);

        Marca nintendo = trobaMarca("Nintendo");
        Marca playmobil = trobaMarca("Playmobil");
        Marca playstation = trobaMarca("Playstation");

        Jugueta NintendoNx = trobaJugueta("NintendoNx");
        Jugueta PlayStation5 = trobaJugueta("PlayStation5");
        Jugueta CastellPlaymobil = trobaJugueta("CastellPlaymobil");

        Contacte proveidor1 = trobaContacte("p1");
        Contacte proveidor2 = trobaContacte("p2");
        Contacte proveidor3 = trobaContacte("p3");

        DetallFacturaComprador detallA = new DetallFacturaComprador(NintendoNx, 123, 4);
        DetallFacturaComprador detallB = new DetallFacturaComprador(PlayStation5, 345, 3);
        DetallFacturaComprador detallC = new DetallFacturaComprador(CastellPlaymobil, 86, 1);

        ArrayList<DetallFacturaComprador> juguetesA = new ArrayList<>();
        juguetesA.add(detallA);
        ArrayList<DetallFacturaComprador> juguetesB = new ArrayList<>();
        juguetesA.add(detallB);
        ArrayList<DetallFacturaComprador> juguetesC = new ArrayList<>();
        juguetesA.add(detallC);

        Proveidor proveidorA = new Proveidor("Pep Franxesc de la Vila", nintendo, proveidor1, registreProvA, juguetesA);
        Proveidor proveidorB = new Proveidor("Juanjo Ramon Catala", playmobil, proveidor2, registreProvB, juguetesB);
        Proveidor proveidorC = new Proveidor("Pere Llagosta Narcis", playstation, proveidor3, registreProvC, juguetesC);

        this.proveidors.add(proveidorA);
        this.proveidors.add(proveidorB);
        this.proveidors.add(proveidorC);
    }

}
