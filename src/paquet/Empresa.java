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
   private RegistreComp registreComp;
   
    public void tipusHashSet(){
        HashSet<Tipus> tipus = new HashSet<>();
        Tipus Consola = new Tipus("Consola");
        Tipus Construir = new Tipus("Construir");
        Tipus Trencaclosques = new Tipus("Trencaclosques");
        
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
        Marca Nintendo = new Marca("Nintendo", contacte);
        Marca Playmobil = new Marca("Playmobil", contacte);
        Marca Playstation = new Marca("Playstation", contacte);
         
        marca.add(Nintendo);
        marca.add(Playmobil);
        marca.add(Playstation);
    }
         
    public void juguetaHashSet() {
        HashSet<Jugueta> juguetes = new HashSet<>();
        Jugueta NintendoNx = new Jugueta(320, "NintendoNx", "Jugueta molt divertida", 25, Classificacio.C8_12, marca, tipus);//nintendo parametre?
        Jugueta PlayStation5 = new Jugueta(540, "PlayStation5", "Jugueta de derrera generacio", 37, Classificacio.C19, marca, tipus);
        Jugueta CastellPlaymobil = new Jugueta(125, "CastellPlaymobil", "Jugueta perfecta per nins petits", 14, Classificacio.C4_8, marca, tipus);
        
        juguetes.add(NintendoNx);
        juguetes.add(PlayStation5);
        juguetes.add(CastellPlaymobil);
        
    }
    public void contacteHashSet(){
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
    public void compradorHashSet(){
        HashSet<Comprador> comprador = new HashSet<>();
        Comprador comprador1 = new Comprador("Pere Ramon Vives", registreComp, contacte);
        Comprador comprador2 = new Comprador("Mateu Perez Munar", registreComp, contacte);
        Comprador comprador3 = new Comprador("Josep Quetglas Esteve", registreComp, contacte);
        
        comprador.add(comprador1);
        comprador.add(comprador2);
        comprador.add(comprador3);
    }
}