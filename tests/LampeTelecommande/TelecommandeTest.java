package LampeTelecommande;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class TelecommandeTest {

    @Test
    public void testAjouterLampe(){
        Lampe l1=new Lampe("l1");
        Lampe l2=new Lampe("l2");
        Telecommande telecommande=new Telecommande();
        telecommande.ajouterLampe(l1);

        assertEquals("Nom de la lampe : l1\tEtat de la lampe : false", telecommande.get(0).toString());

        telecommande.ajouterLampe(l2);

        assertEquals("Nom de la lampe : l2\tEtat de la lampe : false", telecommande.get(1).toString());
    }
}