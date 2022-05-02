package AppareilTelecommande;

import thermos.Thermostat;

public class AdapterThermostat implements Appareil {
    private Thermostat thermostat;

    public AdapterThermostat(Thermostat t) {
        this.thermostat = t;
    }

    public void allumer() {
        this.thermostat.monterTemperature();
    }

    public void eteindre() {
        this.thermostat.baisserTemperature();
    }

    public boolean isAllume() {
        return(true);
    }
}
