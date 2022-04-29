package AppareilTelecommande;

public class AdapterCheminee implements Appareil{
    private Cheminee cheminee;

    public AdapterCheminee(Cheminee cheminee2){

        this.cheminee=cheminee2;
    }

    public void allumer(){
        this.cheminee.changerIntensite(this.cheminee.getLumiere()+10);
    }

    public void eteindre(){
        this.cheminee.changerIntensite(0);
    }


}
