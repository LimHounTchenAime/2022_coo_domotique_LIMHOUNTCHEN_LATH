package LampeTelecommande;

public class Telecommande {
    //attributs
    private Lampe[] lampes;

    //constructeur
    public Telecommande(){
        lampes=new Lampe[0];
    }

    //methodes
    public void ajouterLampe(Lampe lampe){
        Lampe[] tmp=lampes;
        lampes=new Lampe[lampes.length+1];
        lampes[tmp.length]=lampe;
        for(int i=0;i<tmp.length;i++)
            lampes[i]=tmp[i];
    }

    public void activerLampe(int indiceLampe){
        lampes[indiceLampe].allumer();
    }

    public void desactiverLampe(int indiceLampe){
        lampes[indiceLampe].eteindre();
    }

    public void activerTout(){
        for(int i=0;i<lampes.length;i++)
            lampes[i].allumer();
    }

    public String toString(){
        String res="";
        for(int i=0;i<lampes.length;i++){
            res+="Lampe "+i+" :"+lampes[i].isAllume();
        }
        return res;
    }
}