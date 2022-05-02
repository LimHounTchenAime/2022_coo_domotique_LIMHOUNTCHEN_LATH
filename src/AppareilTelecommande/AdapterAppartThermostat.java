package AppareilTelecommande;

import appartement.AppareilAppart;
import appartement.AppareilAppartThermostat;

public class AdapterAppartThermostat implements Appareil{
    private AppareilAppartThermostat appareilAppartThermostat;


    AdapterAppartThermostat(AppareilAppart aat){
        this.appareilAppartThermostat=(AppareilAppartThermostat) aat;

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
        return(this.appareilAppartThermostat.toString());
    }
}
