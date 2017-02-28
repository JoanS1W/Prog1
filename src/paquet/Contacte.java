package paquet;

import java.util.HashSet;

/**
 *
 * @author Andreu Castell, Joan Serra, Salvador Vicens
 */
public class Contacte {
   private String telefon;
   private String email;
   private String zip;
   private String direccio;

    public String getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

    public String getZip() {
        return zip;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public Contacte(String telefon, String email, String zip, String direccio) {
        this.telefon = telefon;
        this.email = email;
        this.zip = zip;
        this.direccio = direccio;
    }

    @Override
    public String toString() {
        return "Contacte{" + "telefon=" + telefon + ", email=" + email + ", zip=" + zip + ", direccio=" + direccio + '}';
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

    }
}
