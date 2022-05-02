package AppareilTelecommande;

import thermos.Thermostat;

public class AdapterThermostat implements Appareil {
    private Thermostat thermostat;
    private int temperature;

    public AdapterCheminee(Thermostat t) {
        this.thermostat = t;
        this.temperature = 20;
    }

    public void allumer() {
        for (int i = 0; i<20;i++) {
            this.thermostat.monterTemperature();
        }
    }

    public void eteindre() {
        for (int i = 0; i<20;i++) {
            this.thermostat.baisserTemperature();
        }
    }

    public boolean isAllume() {
        boolean allume;
        if
    }

    public String toString(){

    }
}
