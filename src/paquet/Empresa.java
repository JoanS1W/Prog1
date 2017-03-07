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

    public void tornaClient(String nom, String data) {
        if (nom.equalsIgnoreCase(proveidorA.getNomProveidor()) && data.equalsIgnoreCase(registreProvA.getDataRegistre()));
        {
            System.out.println("asd");
        }
    }

    public Tipus trobaTipus(ArrayList<Tipus> llista, String nom) {
        
        for (int i = 0; i < 10; i++) {
            if (llista.getNomTipus().equals(nom)) {
                return 
            }
        }
    }

    public RegistreProv trobaRegistreProv(ArrayList<RegistreProv> llista, int id) {

    }

    public RegistreComp trobaRegistreComp(ArrayList<RegistreComp> llista, int id) {

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
        Date a = new Date(2016, 6, 24);
        Date b = new Date(2016, 8, 15);
        Date c = new Date(2016, 4, 18);
        
        nintendoNx = trobaRegistreProv(1);

        RegistreProv registreProvA = new RegistreProv(1, a, 3, 12.24f, nintendoNx);
        RegistreProv registreProvB = new RegistreProv(2, b, 3, 10.34f, playStation5);
        RegistreProv registreProvC = new RegistreProv(3, c, 3, 19.12f, castellPlaymobil);

        this.registreProv.add(registreProvA);
        this.registreProv.add(registreProvB);
        this.registreProv.add(registreProvC);
    }

    public void registreCompArrayList() {
        Date a = new Date(2015, 6, 24);
        Date b = new Date(2015, 8, 15);
        Date c = new Date(2015, 4, 18);

        RegistreComp registreCompA = new RegistreComp(1, a, 3, 10, NintendoNx);
        RegistreComp registreCompB = new RegistreComp(2, b, 3, 10, PlayStation5);
        RegistreComp registreCompC = new RegistreComp(3, c, 3, 10, CastellPlaymobil);

        this.registreComp.add(registreCompA);
        this.registreComp.add(registreCompB);
        this.registreComp.add(registreCompC);
    }

    public void marcaArrayList() {
        Marca Nintendo = new Marca("Nintendo", marca1);
        Marca Playmobil = new Marca("Playmobil", marca2);
        Marca Playstation = new Marca("Playstation", marca3);

        this.marca.add(Nintendo);
        this.marca.add(Playmobil);
        this.marca.add(Playstation);
    }

    public void juguetaArrayList() {
        Jugueta NintendoNx = new Jugueta(320, "NintendoNx", "Jugueta molt divertida", 25, Classificacio.C8_12, Nintendo, Consola);
        Jugueta PlayStation5 = new Jugueta(540, "PlayStation5", "Jugueta de derrera generacio", 37, Classificacio.C19, Playmobil, Consola);
        Jugueta CastellPlaymobil = new Jugueta(125, "CastellPlaymobil", "Jugueta perfecta per nins petits", 14, Classificacio.C4_8, Playstation, Construir);

        this.juguetes.add(NintendoNx);
        this.juguetes.add(PlayStation5);
        this.juguetes.add(CastellPlaymobil);
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
}
