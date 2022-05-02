package AppareilTelecommande;

import thermos.Thermostat;

public class AdapterThermostat implements Appareil {
    private Thermostat thermostat;
    private int temperature;

    AdapterThermostat(Thermostat t) {
        this.thermostat = t;
        this.temperature = 20;
    }

    public void allumer() {
        for (int i = 0; i<20;i++) {
            this.thermostat.monterTemperature();
            this.temperature+=1;
        }
    }

    public void eteindre() {
        for (int i = 0; i<20;i++) {
            this.thermostat.baisserTemperature();
            this.temperature-=1;
        }
    }

    public boolean isAllume() {
        return true;
    }

    public String toString(){
        return "Temperature : "+this.temperature;
    }
}
