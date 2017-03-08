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

    //Metode privat usat pel metode exercici11
    private Comprador exercici1(ArrayList<Comprador> llista, String nom, Date data) {
        int llargaria = llista.size();
        for (int i = 0; i < llargaria; i++) {
            Comprador comp = llista.get(i);
            if (comp.getNomComprador().equals(nom)) {
                return comp;
            }
        }
        return null;
    }

    //Metode per a resoldre la consulta 1
    public RegistreComp exercici11(String nom, Date data) {
        Comprador comprador = exercici1(compradors, nom, data);
        return comprador.getRegistre();
    }

    //Metode privat usat pel metode exercici22
    private int exercici2(ArrayList<RegistreComp> llista, String nom, Date data) {
        int llargaria = llista.size();
        int compres;
        for (int i = 0; i < llargaria; i++) {
            RegistreComp comp = llista.get(i);
            if (comp.getJugueta().equals(nom)) {
                return compres = comp.getQuantitat();
            }
        }
        return 0;
    }

    //Metode per a resoldre la consulta 2
    public int exercici22(String nom, Date data) {
        int registreComp = exercici2(registresComp, nom, data);
        return registreComp;
    }

    //Metode per a trobar els atributs tipus de dins dels arrayList
    public String trobaTipus(ArrayList<Tipus> llista, String nom) {
        int llargaria = llista.size();
        for (int i = 0; i < llargaria; i++) {
            Tipus tip = llista.get(i);
            if (tip.getNomTipus().equals(nom)) {
                return tip.getNomTipus();
            }
        }
        return null;
    }

    //Metode per a trobar els atributs registreProv de dins dels arrayList
    public RegistreProv trobaRegistreProv(ArrayList<RegistreProv> llista, int id) {
        int llargaria = llista.size();
        for (int i = 0; i < llargaria; i++) {
            RegistreProv regPro = llista.get(i);
            if (regPro.getId() == id) {
                return regPro;
            }
        }
        return null;
    }

    //Metode per a trobar els atributs registreComp de dins dels arrayList
    public RegistreComp trobaRegistreComp(ArrayList<RegistreComp> llista, int id) {
        int llargaria = llista.size();
        for (int i = 0; i < llargaria; i++) {
            RegistreComp regComp = llista.get(i);
            if (regComp.getId() == id) {
                return regComp;
            }
        }
        return null;
    }

    //Metode per a trobar els atributs marca de dins dels arrayList
    public Marca trobaMarca(ArrayList<Marca> llista, String nom) {
        int llargaria = llista.size();
        for (int i = 0; i < llargaria; i++) {
            Marca mar = llista.get(i);
            if (mar.getNomMarca().equals(nom)) {
                return mar;
            }
        }
        return null;
    }

    //Metode per a trobar els atributs jugueta de dins dels arrayList
    public String trobaJugueta(ArrayList<Jugueta> llista, String nom) {
        int llargaria = llista.size();
        for (int i = 0; i < llargaria; i++) {
            Jugueta jug = llista.get(i);
            if (jug.getNomJugueta().equals(nom)) {
                return jug.getNomJugueta();
            }
        }
        return null;
    }

    //Metode per a trobar els atributs contacte de dins dels arrayList
    public Contacte trobaContacte(ArrayList<Contacte> llista, String nom) {
        int llargaria = llista.size();
        for (int i = 0; i < llargaria; i++) {
            Contacte cont = llista.get(i);
            if (cont.getNom().equals(nom)) {
                return cont;
            }
        }
        return null;
    }

    //Metode per a trobar els atributs comprador de dins dels arrayList
    public Comprador trobaComprador(ArrayList<Comprador> llista, String nom) {
        int llargaria = llista.size();
        for (int i = 0; i < llargaria; i++) {
            Comprador comp = llista.get(i);
            if (comp.getNomComprador().equals(nom)) {
                return comp;
            }
        }
        return null;
    }

    //Metode per a trobar els atributs proveidor de dins dels arrayList
    public Proveidor trobaProveidor(ArrayList<Proveidor> llista, String nom) {
        int llargaria = llista.size();
        for (int i = 0; i < llargaria; i++) {
            Proveidor prov = llista.get(i);
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

        String nintendoNx = trobaJugueta(juguetes, "NintendoNx");
        String playStation5 = trobaJugueta(juguetes, "PlayStation5");
        String castellPlaymobil = trobaJugueta(juguetes, "CastellPlaymobil");

        RegistreProv registreProvA = new RegistreProv(1, a, 3, 12.24f, nintendoNx);
        RegistreProv registreProvB = new RegistreProv(2, b, 3, 10.34f, playStation5);
        RegistreProv registreProvC = new RegistreProv(3, c, 3, 19.12f, castellPlaymobil);

        this.registresProv.add(registreProvA);
        this.registresProv.add(registreProvB);
        this.registresProv.add(registreProvC);
    }

    //Metode per omplir l'arrayList registreComp.
    public void registreCompArrayList() {
        Date a = new Date(115, 6, 24);
        Date b = new Date(115, 8, 15);
        Date c = new Date(115, 4, 18);

        String nintendoNx = trobaJugueta(juguetes, "NintendoNx");
        String playStation5 = trobaJugueta(juguetes, "PlayStation5");
        String castellPlaymobil = trobaJugueta(juguetes, "CastellPlaymobil");

        RegistreComp registreCompA = new RegistreComp(1, a, 3, 12.24f, 10, nintendoNx);
        RegistreComp registreCompB = new RegistreComp(2, b, 3, 12.24f, 10, playStation5);
        RegistreComp registreCompC = new RegistreComp(3, c, 3, 12.24f, 10, castellPlaymobil);

        this.registresComp.add(registreCompA);
        this.registresComp.add(registreCompB);
        this.registresComp.add(registreCompC);
    }

    //Metode per omplir l'arrayList marca.
    public void marcaArrayList() {
        Contacte marca1 = trobaContacte(contactes, "m1");
        Contacte marca2 = trobaContacte(contactes, "m2");
        Contacte marca3 = trobaContacte(contactes, "m3");

        Marca nintendo = new Marca("Nintendo", marca1);
        Marca playmobil = new Marca("Playmobil", marca2);
        Marca playstation = new Marca("Playstation", marca3);

        this.marques.add(nintendo);
        this.marques.add(playmobil);
        this.marques.add(playstation);
    }

    //Metode per omplir l'arrayList jugueta.
    public void juguetaArrayList() {
        Marca nintendo = trobaMarca(marques, "Nintendo");
        Marca playmobil = trobaMarca(marques, "Playmobil");
        Marca playstation = trobaMarca(marques, "Playstation");

        String consola = trobaTipus(tipus, "Consola");
        String construir = trobaTipus(tipus, "Construir");
        String trencaclosques = trobaTipus(tipus, "Trencaclosques");

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
        RegistreComp registreCompA = trobaRegistreComp(registresComp, 1);
        RegistreComp registreCompB = trobaRegistreComp(registresComp, 2);
        RegistreComp registreCompC = trobaRegistreComp(registresComp, 3);

        Contacte comprador1 = trobaContacte(contactes, "c1");
        Contacte comprador2 = trobaContacte(contactes, "c2");
        Contacte comprador3 = trobaContacte(contactes, "c3");

        Comprador compradorA = new Comprador("Pere Ramon Vives", registreCompA, comprador1);
        Comprador compradorB = new Comprador("Mateu Perez Munar", registreCompB, comprador2);
        Comprador compradorC = new Comprador("Josep Quetglas Esteve", registreCompC, comprador3);

        this.compradors.add(compradorA);
        this.compradors.add(compradorB);
        this.compradors.add(compradorC);
    }

    //Metode per omplir l'arrayList proveidor.
    public void proveidorArrayList() {
        RegistreProv registreProvA = trobaRegistreProv(registresProv, 1);
        RegistreProv registreProvB = trobaRegistreProv(registresProv, 2);
        RegistreProv registreProvC = trobaRegistreProv(registresProv, 3);

        Marca nintendo = trobaMarca(marques, "Nintendo");
        Marca playmobil = trobaMarca(marques, "Playmobil");
        Marca playstation = trobaMarca(marques, "Playstation");

        Contacte proveidor1 = trobaContacte(contactes, "p1");
        Contacte proveidor2 = trobaContacte(contactes, "p2");
        Contacte proveidor3 = trobaContacte(contactes, "p3");

        Proveidor proveidorA = new Proveidor("Pep Franxesc de la Vila", nintendo, proveidor1, registreProvA);
        Proveidor proveidorB = new Proveidor("Juanjo Ramon Catala", playmobil, proveidor2, registreProvB);
        Proveidor proveidorC = new Proveidor("Pere Llagosta Narcis", playstation, proveidor3, registreProvC);

        this.proveidors.add(proveidorA);
        this.proveidors.add(proveidorB);
        this.proveidors.add(proveidorC);
    }

}
