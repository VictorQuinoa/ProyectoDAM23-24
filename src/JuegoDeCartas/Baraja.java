package JuegoDeCartas;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    private ArrayList<Cartas> cartas;
    private int indiceCartaActual;


    public Baraja() {
        this.cartas = new ArrayList<Cartas>();
        String[] palos = {"Corazones", "Diamantes", "Treboles", "Picas"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int[] valoresNumericos = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 1};
        for (String palo : palos) {
            for (int i = 0; i < valores.length; i++) {
                cartas.add(new Cartas(palo, valores[i], valoresNumericos[i]));
            }
        }
        indiceCartaActual = 0;
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    /**
     * Metodo que toma una carta de la baraja
     * @return Carta
     */
    public Cartas tomarCarta() {
        return cartas.get(indiceCartaActual++);
    }
    public Cartas dealCard() {
        return this.cartas.remove(this.cartas.size() - 1);
    }

}
