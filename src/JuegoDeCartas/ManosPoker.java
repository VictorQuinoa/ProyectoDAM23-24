package JuegoDeCartas;

import Juegos.Poker;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ManosPoker {
    /**
     * Método que evalúa la mano de poker si tiene la carta mas alta
     * @param mano
     * @return
     */
    public static boolean esCartaAlta(List<Cartas> mano) {
        return true;
    }

    /**
     * Método que evalúa la mano de poker si tiene par
     * @param mano
     * @return
     */
    public static boolean esPar(List<Cartas> mano) {
        Map<String, Integer> conteo = new HashMap<>();
        for (Cartas carta : mano) {
            conteo.put(String.valueOf(carta.getValor()), conteo.getOrDefault(carta.getValor(), 0) + 1);
        }
        for (int count : conteo.values()) {
            if (count == 2) {
                return true;
            }
        }
        return false;


    }

    /**
     * Método que evalúa la mano de poker si tiene doble par
     * @param mano
     * @return
     */
    public static boolean esDoblePar(List<Cartas> mano) {

        Map<String, Integer> conteo = new HashMap<>();
        int pares = 0;
        for (Cartas carta : mano) {
            conteo.put(String.valueOf(carta.getValor()), conteo.getOrDefault(carta.getValor(), 0) + 1);
        }
        for (int count : conteo.values()) {
            if (count == 2) {
                pares++;
            }
        }
        return pares == 2;
    }

    /**
     * Método que evalúa la mano de poker si tiene trio
     * @param mano
     * @return
     */
    public static boolean esTrio(List<Cartas> mano) {
        Map<String, Integer> conteo = new HashMap<>();
        for (Cartas carta : mano) {
            conteo.put(String.valueOf(carta.getValor()), conteo.getOrDefault(carta.getValor(), 0) + 1);
        }
        for (int count : conteo.values()) {
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método que evalúa la mano de poker si tiene escalera
     * @param mano
     * @return
     */
    public static boolean esEscalera(List<Cartas> mano) {
        List<Integer> valores = new ArrayList<>();
        for (Cartas carta : mano) {
            valores.add(Integer.valueOf(carta.getValor()));
        }
        Collections.sort(valores);
        for (int i = 0; i < valores.size() - 1; i++) {
            if (valores.get(i + 1) - valores.get(i) != 1) {
                return false;
            }
        }
        return true;
    }

    /**
     * Método que evalúa si tiene color la mano
     * @param mano
     * @return
     */
    public static boolean esColor(List<Cartas> mano) {
        Map<String, Integer> conteo = new HashMap<>();
        for (Cartas carta : mano) {
            conteo.put(carta.getPalo(), conteo.getOrDefault(carta.getPalo(), 0) + 1);
        }
        for (int count : conteo.values()) {
            if (count == 5) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método que evalúa la mano si tiene full
     * @param mano
     * @return
     */
    public static boolean esFull(List<Cartas> mano) {
        return esPar(mano) && esTrio(mano);
    }

    /**
     *Metodo que evalua si se tiene una mano con poker
     * @param mano
     * @return
     */
    public static boolean esPoker(List<Cartas> mano) {
        Map<String, Integer> conteo = new HashMap<>();
        for (Cartas carta : mano) {
            conteo.put(String.valueOf(carta.getValor()), conteo.getOrDefault(carta.getValor(), 0) + 1);
        }
        for (int count : conteo.values()) {
            if (count == 4) {
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo que evalua si se tiene una mano con escalera de color
     * @param mano
     * @return
     */
    public static boolean esEscaleraColor(List<Cartas> mano) {
        return esEscalera(mano) && esColor(mano);
    }

    /**
     * Metodo que evalua si se tiene una mano con escalera real
     * @param mano
     * @return
     */
    public static boolean esEscaleraReal(List<Cartas> mano) {
        List<Integer> valores = new ArrayList<>();
        for (Cartas carta : mano) {
            valores.add(Integer.valueOf((carta.getValor())));
        }
        Collections.sort(valores);
        return valores.get(0) == 10 && esEscaleraColor(mano);
    }
}
