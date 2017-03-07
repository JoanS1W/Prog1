package paquet;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Empresa {

    private ArrayList<Tipus> tipus = new ArrayList<>();
    private ArrayList<Contacte> contacte = new ArrayList<>();
    private ArrayList<Marca> marca = new ArrayList<>();
    private ArrayList<Jugueta> juguetes = new ArrayList<>();
    private ArrayList<RegistreComp> registreComp = new ArrayList<>();
    private ArrayList<Comprador> comprador = new ArrayList<>();
    private ArrayList<RegistreProv> registreProv = new ArrayList<>();
    private ArrayList<Proveidor> proveidor = new ArrayList<>();

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

    /*public void tornaClient(String nom, String data) {
        if (nom.equalsIgnoreCase(proveidorA.getNomProveidor()) && data.equalsIgnoreCase(registreProvA.getDataRegistre()));
        {
            System.out.println("asd");
        }
    }*/
    public Tipus trobaTipus(ArrayList<Tipus> llista, String nom) {
        int llargaria = llista.size();
        for (int i = 0; i < llargaria; i++) {
            Tipus tip = llista.get(i);
            if (tip.getNomTipus().equals(nom)) {
                return tip;
            }
        }
        return null;
    }

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

    public Jugueta trobaJugueta(ArrayList<Jugueta> llista, String nom) {
        int llargaria = llista.size();
        for (int i = 0; i < llargaria; i++) {
            Jugueta jug = llista.get(i);
            if (jug.getNomJugueta().equals(nom)) {
                return jug;
            }
        }
        return null;
    }

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

    public void tipusArrayList() {
        Tipus Consola = new Tipus("Consola");
        Tipus Construir = new Tipus("Construir");
        Tipus Trencaclosques = new Tipus("Trencaclosques");

        this.tipus.add(Consola);
        this.tipus.add(Construir);
        this.tipus.add(Trencaclosques);
    }

    public void registreProvArrayList() {
        Date a = new Date(116, 6, 24);
        Date b = new Date(116, 8, 15);
        Date c = new Date(116, 4, 18);

        Jugueta nintendoNx = trobaJugueta(juguetes, "NintendoNx");
        Jugueta playStation5 = trobaJugueta(juguetes, "PlayStation5");
        Jugueta castellPlaymobil = trobaJugueta(juguetes, "CastellPlaymobil");

        RegistreProv registreProvA = new RegistreProv(1, a, 3, 12.24f, nintendoNx);
        RegistreProv registreProvB = new RegistreProv(2, b, 3, 10.34f, playStation5);
        RegistreProv registreProvC = new RegistreProv(3, c, 3, 19.12f, castellPlaymobil);

        this.registreProv.add(registreProvA);
        this.registreProv.add(registreProvB);
        this.registreProv.add(registreProvC);
        //BORRAR
        System.out.println(registreProvC);
    }

    public void registreCompArrayList() {
        Date a = new Date(115, 6, 24);
        Date b = new Date(115, 8, 15);
        Date c = new Date(115, 4, 18);

        Jugueta nintendoNx = trobaJugueta(juguetes, "NintendoNx");
        Jugueta playStation5 = trobaJugueta(juguetes, "PlayStation5");
        Jugueta castellPlaymobil = trobaJugueta(juguetes, "CastellPlaymobil");

        RegistreComp registreCompA = new RegistreComp(1, a, 3, 12.24f, 10, nintendoNx);
        RegistreComp registreCompB = new RegistreComp(2, b, 3, 12.24f, 10, playStation5);
        RegistreComp registreCompC = new RegistreComp(3, c, 3, 12.24f, 10, castellPlaymobil);

        this.registreComp.add(registreCompA);
        this.registreComp.add(registreCompB);
        this.registreComp.add(registreCompC);
    }

    public void marcaArrayList() {
        Marca nintendo = new Marca("Nintendo", marca1);
        Marca playmobil = new Marca("Playmobil", marca2);
        Marca playstation = new Marca("Playstation", marca3);

        this.marca.add(nintendo);
        this.marca.add(playmobil);
        this.marca.add(playstation);
    }

    public void juguetaArrayList() {
        Jugueta nintendoNx = new Jugueta(320, "NintendoNx", "Jugueta molt divertida", 25, Classificacio.C8_12, Nintendo, Consola);
        Jugueta playStation5 = new Jugueta(540, "PlayStation5", "Jugueta de derrera generacio", 37, Classificacio.C19, Playmobil, Consola);
        Jugueta castellPlaymobil = new Jugueta(125, "CastellPlaymobil", "Jugueta perfecta per nins petits", 14, Classificacio.C4_8, Playstation, Construir);

        this.juguetes.add(nintendoNx);
        this.juguetes.add(playStation5);
        this.juguetes.add(castellPlaymobil);
    }

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

        this.contacte.add(marca1);
        this.contacte.add(marca2);
        this.contacte.add(marca3);
        this.contacte.add(comprador1);
        this.contacte.add(comprador2);
        this.contacte.add(comprador3);
        this.contacte.add(proveidor1);
        this.contacte.add(proveidor2);
        this.contacte.add(proveidor3);
    }

    public void compradorArrayList() {
        Comprador compradorA = new Comprador("Pere Ramon Vives", registreCompA, comprador1);
        Comprador compradorB = new Comprador("Mateu Perez Munar", registreCompB, comprador2);
        Comprador compradorC = new Comprador("Josep Quetglas Esteve", registreCompB, comprador3);

        this.comprador.add(compradorA);
        this.comprador.add(compradorB);
        this.comprador.add(compradorC);
    }

    public void proveidorArrayList() {
        Proveidor proveidorA = new Proveidor("Pep Franxesc de la Vila", Nintendo, proveidor1, registreProvA);
        Proveidor proveidorB = new Proveidor("Juanjo Ramon Catala", Playmobil, proveidor2, registreProvB);
        Proveidor proveidorC = new Proveidor("Pere Llagosta Narcis", Playstation, proveidor3, registreProvC);

        this.proveidor.add(proveidorA);
        this.proveidor.add(proveidorB);
        this.proveidor.add(proveidorC);
    }

    //BORRAR
    public static void main(String[] args) {
        Empresa o = new Empresa();
        o.registreProvArrayList();
    }
}
