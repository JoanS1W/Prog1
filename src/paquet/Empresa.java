package paquet;

import java.util.HashSet;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Empresa {

    private Jugueta jugueta;
    private Comprador comprador;
    private Proveidor proveidor;
    private Contacte contacte;
    private Marca marca;
    private Tipus tipus;
    private RegistreProv registreprov;
    private RegistreComp registrecomp;
    

    public void tipusHashSet() {
        HashSet<Tipus> tipus = new HashSet<>();
        
        Tipus Consola = new Tipus("Consola");
        Tipus Construir = new Tipus("Construir");
        Tipus Trencaclosques = new Tipus("Trencaclosques");

        tipus.add(Consola);
        tipus.add(Construir);
        tipus.add(Trencaclosques);
    }

    public void registreProvHashSet(Jugueta NintendoNx, Jugueta PlayStation5, Jugueta CastellPlaymobil) {
        HashSet<RegistreProv> registreProv = new HashSet<>();
        RegistreProv registreProvA = new RegistreProv("02/04/2017", 3, 12.24f, NintendoNx);
        RegistreProv registreProvB = new RegistreProv("02/04/2017", 3, 10.34f, PlayStation5);
        RegistreProv registreProvC = new RegistreProv("02/04/2017", 3, 19.12f, CastellPlaymobil);
        registreProv.add(registreProvA);
        registreProv.add(registreProvB);
        registreProv.add(registreProvC);
    }

   public void registreCompHashSet(Jugueta NintendoNx, Jugueta PlayStation5, Jugueta CastellPlaymobil) {
        HashSet<RegistreComp> registreComp = new HashSet<>();
        RegistreComp registreCompA = new RegistreComp("02/04/2017", 3, 10, NintendoNx);
        RegistreComp registreCompB = new RegistreComp("02/04/2017", 3, 10, PlayStation5);
        RegistreComp registreCompC = new RegistreComp("02/04/2017", 3, 10, CastellPlaymobil);
        registreComp.add(registreCompA);
        registreComp.add(registreCompB);
        registreComp.add(registreCompC);
    }

    public void marcaHashSet(Contacte marca1, Contacte marca2, Contacte marca3) {
        HashSet<Marca> marca = new HashSet<>();

        Marca Nintendo = new Marca("Nintendo", marca1);
        Marca Playmobil = new Marca("Playmobil", marca2);
        Marca Playstation = new Marca("Playstation", marca3);

        marca.add(Nintendo);
        marca.add(Playmobil);
        marca.add(Playstation);
    }

    public void juguetaHashSet(Tipus Consola, Tipus Construir, Marca Nintendo, Marca Playstation, Marca Playmobil) {
        HashSet<Jugueta> juguetes = new HashSet<>();
        
        Jugueta NintendoNx = new Jugueta(320, "NintendoNx", "Jugueta molt divertida", 25, Classificacio.C8_12, Nintendo, Consola);
        Jugueta PlayStation5 = new Jugueta(540, "PlayStation5", "Jugueta de derrera generacio", 37, Classificacio.C19, Playmobil, Consola);
        Jugueta CastellPlaymobil = new Jugueta(125, "CastellPlaymobil", "Jugueta perfecta per nins petits", 14, Classificacio.C4_8, Playstation, Construir);

        juguetes.add(NintendoNx);
        juguetes.add(PlayStation5);
        juguetes.add(CastellPlaymobil);
    }

    public void contacteHashSet() {
        HashSet<Contacte> contacte = new HashSet<>();
        
        Contacte marca1 = new Contacte("971548798", "qweq@gmail.com", "07140", "C/ Jardi, 24");
        Contacte marca2 = new Contacte("971784565", "gdfd@gmail.com", "07142", "C/ Mateu, 12");
        Contacte marca3 = new Contacte("971013599", "jhgjg@gmail.com", "07113", "C/ Plaça, 48");
        Contacte comprador1 = new Contacte("971852934", "bvbxc@gmail.com", "07145", "C/ Joan, 99");
        Contacte comprador2 = new Contacte("971796454", "qwer@gmail.com", "07185", "C/ Moli, 73");
        Contacte comprador3 = new Contacte("971031456", "kfgfhjg@gmail.com", "07175", "C/ Arada, 55");
        Contacte proveidor1 = new Contacte("971795135", "pioyuio@gmail.com", "07133", "C/ Uetam, 83");
        Contacte proveidor2 = new Contacte("971221345", "qwercv@gmail.com", "07179", "C/ ACDC, 44");
        Contacte proveidor3 = new Contacte("971631545", "bvzxcvxc@gmail.com", "07166", "C/ Pollentia, 6");

        contacte.add(marca1);
        contacte.add(marca2);
        contacte.add(marca3);
        contacte.add(comprador1);
        contacte.add(comprador2);
        contacte.add(comprador3);
        contacte.add(proveidor1);
        contacte.add(proveidor2);
        contacte.add(proveidor3);
    }

    public void compradorHashSet(RegistreComp registreCompA, RegistreComp registreCompB, RegistreComp registreCompC, Contacte comprador1, Contacte comprador2, Contacte comprador3) {
        HashSet<Comprador> comprador = new HashSet<>();
        
        Comprador compradorA = new Comprador("Pere Ramon Vives", registreCompA, comprador1);
        Comprador compradorB = new Comprador("Mateu Perez Munar", registreCompB, comprador2);
        Comprador compradorC = new Comprador("Josep Quetglas Esteve", registreCompC, comprador3);

        comprador.add(compradorA);
        comprador.add(compradorB);
        comprador.add(compradorC);
    }

    public void proveidorHashSet(Marca Nintendo, Marca Playmobil, Marca Playstation, Contacte proveidor1, Contacte proveidor2, Contacte proveidor3, RegistreProv registreProvA, RegistreProv registreProvB,RegistreProv registreProvC) {
        HashSet<Proveidor> proveidor = new HashSet<>();
        
        Proveidor proveidorA = new Proveidor("Pep Franxesc de la Vila", Nintendo, proveidor1 ,registreProvA);
        Proveidor proveidorB = new Proveidor("Juanjo Ramon Catala", Playmobil, proveidor2, registreProvB);
        Proveidor proveidorC = new Proveidor("Pere Llagosta Narcis", Playstation, proveidor3, registreProvC);
        
        proveidor.add(proveidorA);
        proveidor.add(proveidorB);
        proveidor.add(proveidorC);
    }
}
