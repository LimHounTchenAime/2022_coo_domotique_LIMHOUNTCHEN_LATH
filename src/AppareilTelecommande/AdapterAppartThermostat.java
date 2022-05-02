package AppareilTelecommande;

import appartement.AppareilAppartThermostat;

public class AdapterAppartThermostat {
    private AppareilAppartThermostat appareilAppartThermostat;
    private String nom;

    AdapterAppartThermostat(AppareilAppartThermostat aat, String n){
        this.appareilAppartThermostat=aat;
        this.nom=n;
    }

    public void allumer(){
        this.appareilAppartThermostat.augmenterTemperature();
    }

    public void eteindre(){
        this.appareilAppartThermostat.baisserTemperature();
    }

    public boolean isAllume(){
        return(true);
    }

    public String toString(){
        return(this.appareilAppartThermostat.toString()+" nom : "+this.nom);
    }
}
