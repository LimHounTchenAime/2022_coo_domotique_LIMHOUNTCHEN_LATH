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
        s += "Nom de la lampe : " + this.nom + "\tEtat de la lampe : " + this.allume;
        return s;
    }

    public boolean isAllume() {
        return this.allume;
    }
}
