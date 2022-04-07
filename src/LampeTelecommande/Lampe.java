package LampeTelecommande;

public class Lampe {
    private String nom;
    private boolean allume;

    Lampe(String nomLampe) {
        this.nom = nomLampe;
        this.allume = false;

    }

    public void allumer() {
        this.allume = true;
    }

    public void eteindre() {
        this.allume = false;
    }

    public String toString() {
        String s = "";
        if (this.allume)
            s += this.nom + ": " + "On";
        else
            s += this.nom + ": " + "Off";
        return s;
    }

    public boolean isAllume() {
        return this.allume;
    }
}
