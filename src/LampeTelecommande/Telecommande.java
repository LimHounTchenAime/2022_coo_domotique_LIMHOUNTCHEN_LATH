package LampeTelecommande;

import java.util.ArrayList;

public class Telecommande {
    //attributs
    private ArrayList<Lampe> lampes;

    //constructeur
    public Telecommande(){
        lampes=new ArrayList<Lampe>();
    }

    //methodes
    public void ajouterLampe(Lampe lampe){
        lampes.add(lampe);
    }

    public void activerLampe(int indiceLampe){
        lampes.get(indiceLampe).allumer();
    }

    public void desactiverLampe(int indiceLampe){
        lampes.get(indiceLampe).eteindre();
    }

    public void activerTout(){
        for(int i=0;i<lampes.size();i++)
            lampes.get(i).allumer();
    }

    public Lampe get(int i){
        return lampes.get(i);
    }

    public String toString(){
        String res="";
        for(int i=0;i<lampes.size();i++){
            res+=lampes.get(i).toString();
        }
        return res;
    }
}
//test