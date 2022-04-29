package AppareilTelecommande;

public class Main {

    public static void main(String args[]) {
        Telecommande t = new Telecommande();


        Lampe l1 = new Lampe("Lampe1");
        t.ajouterAppareil(l1);

        /****** A COMPLETER ******/
        // TODO
        Hifi h1 = new Hifi();
        t.ajouterAppareil(h1);

        Cheminee c1 = new Cheminee();
        AdapterCheminee ac1 = new AdapterCheminee(c1);
        t.ajouterAppareil(ac1);

        TelecommandeGraphique tg = new TelecommandeGraphique(t);


    }

}
