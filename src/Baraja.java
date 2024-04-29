import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    private ArrayList<Cartas> cartas;

    public Baraja() {
        this.cartas = new ArrayList<Cartas>();
        String[] palos = {"Corazones", "Diamantes", "Treboles", "Picas"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        for (String palo : palos) {
            for (String valor : valores) {
                this.cartas.add(new Cartas(palo, valor));
            }
        }
        Collections.shuffle(this.cartas);
    }

    public Cartas dealCard() {
        return this.cartas.remove(this.cartas.size() - 1);
    }

}
