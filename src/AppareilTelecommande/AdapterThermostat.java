package AppareilTelecommande;

import thermos.Thermostat;

public class AdapterThermostat implements Appareil {
    private Thermostat thermostat;

    public AdapterCheminee(Thermostat t) {
        this.thermostat = t;
    }

    public void allumer() {
        this.thermostat.monterTemperature();
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
}
