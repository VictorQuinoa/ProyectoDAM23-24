package Model.JuegoDeCartas;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Clase que representa una baraja de cartas

 */
public class Baraja {
    private ArrayList<Cartas> cartas;
    private int indiceCartaActual;

    /**
     * Constructor de la clase Baraja
     */
    public Baraja() {
        this.cartas = new ArrayList<Cartas>();
        String[] palos = {"Corazones", "Diamantes", "Treboles", "Picas"};
        String[] valores = {"Ace","2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
        int[] valoresNumericos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

        for (String palo : palos) {
            for (int i = 0; i < valores.length; i++) {
                //necesario para el método de generador de path's
                String pathImagenGenerado = generacionDePaths(palo, i + 1);
                cartas.add(new Cartas(palo,valores[i],valoresNumericos[i],pathImagenGenerado));
            }
        }
        indiceCartaActual = 0;
    }

    /**
     * Metodo que baraja las cartas
     */
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
    /**
     * Metodo que da una carta de la baraja
     * @return Carta
     */
    public Cartas dealCard() {
        return this.cartas.remove(this.cartas.size() - 1);
    }

    /**
     *
     * @param palo dado en el for cuando va pasando los palo para darle el palo al path
     * @param valor valor que tiene el nombre del archivo de la imagen para
     * @return path deseado para asociarlo en el hashMap
     */
    private String generacionDePaths(String palo, int valor){
        String pathBase = "/Decorativos/Imagenes/Cartas/";
        switch (palo){
            case "Corazones":
                return pathBase + "corazones/" + valor + "corazon.png";
            case "Diamantes":
                return pathBase + "diamantes/" + valor + "diamante.png";
            case "Treboles":
                return pathBase + "trebol/" + valor + "trebol.png";
            case "Picas":
                return pathBase + "picas/" + valor + "pica.png";
            default:
                return "";
        }
    }
}
