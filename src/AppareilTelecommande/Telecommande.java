package AppareilTelecommande;

import java.util.ArrayList;

public class Telecommande{
    //attributs
    private ArrayList<Appareil> appareils;

    //constructeur
    public Telecommande(){
        appareils=new ArrayList<Appareil>();
    }

    //methodes
    public void ajouterAppareil(Appareil appareil){
        appareils.add(appareil);
    }

    public void activerAppareil(int indiceAppareil){
        appareils.get(indiceAppareil).allumer();
    }

    public void desactiverAppareil(int indiceAppareil){
        appareils.get(indiceAppareil).eteindre();
    }

    public void activerTout(){
        for(int i=0;i<appareils.size();i++)
            appareils.get(i).allumer();
    }

    public Appareil get(int i){
        return appareils.get(i);
    }

    public String toString(){
        String res="";
        for(int i=0;i<appareils.size();i++){
            res+="Appareil "+i+" :"+appareils.get(i).isAllume();
        }
        return res;
    }
}
//test