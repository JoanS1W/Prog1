package paquet;

import java.util.HashSet;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Empresa {
   private Jugueta NintendoNx, PlayStation5, CastellPlaymobil;
   private Comprador compradorA, compradorB, compradorC;
   private Proveidor proveidor;
   private Contacte marca1, marca2, marca3, comprador1, comprador2 ,comprador3, proveidor1, proveidor2 ,proveidor3;
   private Marca Nintendo, Playmobil, Playstation;
   private Tipus Consola, Construir, Trencaclosques;
   private RegistreComp registreComp;
   
    public void tipusHashSet(){
        HashSet<Tipus> tipus = new HashSet<>();
        Consola = new Tipus("Consola");
        Construir = new Tipus("Construir");
        Trencaclosques = new Tipus("Trencaclosques");
        
        tipus.add(Consola);
        tipus.add(Construir);
        tipus.add(Trencaclosques);
    }
    
     public void registreProvaHashSet() {
        HashSet<RegistreProv> registreProv = new HashSet<>();

    }
     
     public void registreCompHashSet() {
        HashSet<RegistreComp> registreComp = new HashSet<>();

    }
    public void marcaHashSet(){
        HashSet<Marca> marca = new HashSet<>();

        Nintendo = new Marca("Nintendo", marca1);
        Playmobil = new Marca("Playmobil", marca2);
        Playstation = new Marca("Playstation", marca3);
        
        marca.add(Nintendo);
        marca.add(Playmobil);
        marca.add(Playstation);
    }
         
    public void juguetaHashSet() {
        HashSet<Jugueta> juguetes = new HashSet<>();
        NintendoNx = new Jugueta(320, "NintendoNx", "Jugueta molt divertida", 25, Classificacio.C8_12, Nintendo, Consola);
        PlayStation5 = new Jugueta(540, "PlayStation5", "Jugueta de derrera generacio", 37, Classificacio.C19, Playmobil, Consola);
        CastellPlaymobil = new Jugueta(125, "CastellPlaymobil", "Jugueta perfecta per nins petits", 14, Classificacio.C4_8, Playstation, Construir);
        
        juguetes.add(NintendoNx);
        juguetes.add(PlayStation5);
        juguetes.add(CastellPlaymobil);
    }
        
    public void contacteHashSet(){
        HashSet<Contacte> contacte = new HashSet<>();
                
        marca1 = new Contacte("971548798", "qweq@gmail.com", "07140", "C/ Jardi, 24");
        marca2 = new Contacte("971784565", "gdfd@gmail.com", "07142", "C/ Mateu, 12");
        marca3 = new Contacte("971013599", "jhgjg@gmail.com", "07113", "C/ Plaça, 48");
        comprador1 = new Contacte("971852934", "bvbxc@gmail.com", "07145", "C/ Joan, 99");
        comprador2 = new Contacte("971796454", "qwer@gmail.com", "07185", "C/ Moli, 73");
        comprador3 = new Contacte("971031456", "kfgfhjg@gmail.com", "07175", "C/ Arada, 55");
        proveidor1 = new Contacte("971795135", "pioyuio@gmail.com", "07133", "C/ Uetam, 83");
        proveidor2 = new Contacte("971221345", "qwercv@gmail.com", "07179", "C/ ACDC, 44");
        proveidor3 = new Contacte("971631545", "bvzxcvxc@gmail.com", "07166", "C/ Pollentia, 6");

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
    public void compradorHashSet(){
        HashSet<Comprador> comprador = new HashSet<>();
        compradorA = new Comprador("Pere Ramon Vives", registreComp, comprador1);
        compradorB = new Comprador("Mateu Perez Munar", registreComp, comprador2);
        compradorC = new Comprador("Josep Quetglas Esteve", registreComp, comprador3);
        
        comprador.add(compradorA);
        comprador.add(compradorB);
        comprador.add(compradorC);
    }
}