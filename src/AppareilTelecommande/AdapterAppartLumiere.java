package AppareilTelecommande;

import appartement.AppareilAppart;
import appartement.AppareilAppartLampe;

public class AdapterAppartLumiere implements Appareil {

    private AppareilAppartLampe adapter;
    private String nom;

    AdapterAppartLumiere(AppareilAppart a,String piece) {
        this.adapter = (AppareilAppartLampe) a;
        this.nom=piece;
    }

    public void allumer() {
        this.adapter.allumer();
    }

    public void eteindre() {
        this.adapter.eteindre();
    }

    public boolean isAllume() {
        boolean allume;
        allume = this.adapter.toString().equals("On");
        return  allume;
    }

    public String toString(){
        return this.adapter.toString()+this.nom;
    }
}
