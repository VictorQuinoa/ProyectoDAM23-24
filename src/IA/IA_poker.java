package IA;
import Bases.Apuestas;
import Bases.Economia;
import JuegoDeCartas.Cartas;
import JuegoDeCartas.ManosPoker;
import Juegos.Poker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class IA_poker extends Economia implements Apuestas {
    Poker poker= new Poker();
    private Scanner sc = new Scanner(System.in);
    private List<Cartas> baraja;
    private List<Cartas> manoJugador;
    public List<Cartas> manoComputadora;
    private List<Cartas> manoMesa;
    private int bote;
    private int apuestaJugador;
    private int apuestaComputadora;
    private int ronda;
    private boolean jugadorRetirado;
    private int apuesta;
    private boolean ganador;
    private Economia economia;
    private int cartera;
    private int carteraComputadora;
    private Random random;
     boolean ciegaG;

    public IA_poker() {
        this.baraja = new ArrayList<>();
        this.manoJugador = new ArrayList<>();
        this.manoComputadora = new ArrayList<>();
        this.manoMesa = new ArrayList<>();
        this.economia = economia;
        this.cartera = economia.getCarteraJugador();
        this.carteraComputadora = economia.getCarteraComputadora();
        this.apuestaJugador = 0;
        this.apuestaComputadora = 0;
        this.ronda = 0;
        this.jugadorRetirado = false;
        this.ganador = false;
        this.random = new Random();
        // Inicializar la baraja de cartas aquí
    }

    // Resto del código...

    /**
     * Método que toma la decisión de la computadora en función de la fuerza de su mano
     *
     */
    public void tomarDecisionIA() {
        int fuerzaMano = evaluarMano(manoComputadora);
        if (fuerzaMano > 80) {  // Mano fuerte
            subirApuestaComputadora();
        } else if (fuerzaMano > 50) {  // Mano media
            if (random.nextBoolean()) {
                igualarApuestaComputadora();
            } else {
                pasarApuestaComputadora();
            }
        } else {  // Mano débil
            if (random.nextInt(100) > 75) {
                igualarApuestaComputadora();
            } else {
                retirarseComputadora();
            }
        }
    }

    private int evaluarMejorMano(List<Cartas> mano, List<Cartas> mesa) {
        List<Cartas> combinacion = new ArrayList<>(mano);
        combinacion.addAll(mesa);

        int mejorValor = 0;

        // Generar todas las combinaciones de 5 cartas
        for (int i = 0; i < combinacion.size(); i++) {
            for (int j = i + 1; j < combinacion.size(); j++) {
                for (int k = j + 1; k < combinacion.size(); k++) {
                    for (int l = k + 1; l < combinacion.size(); l++) {
                        for (int m = l + 1; m < combinacion.size(); m++) {
                            List<Cartas> manoEvaluada = new ArrayList<>();
                            manoEvaluada.add(combinacion.get(i));
                            manoEvaluada.add(combinacion.get(j));
                            manoEvaluada.add(combinacion.get(k));
                            manoEvaluada.add(combinacion.get(l));
                            manoEvaluada.add(combinacion.get(m));
                            int valor = evaluarMano(manoEvaluada);
                            if (valor > mejorValor) {
                                mejorValor = valor;
                            }
                        }
                    }
                }
            }
        }
        return mejorValor;

    }
    /**
     * Método que evalúa la fuerza de la mano de la computadora
     *
     * @param mano
     * @return
     */
    public int evaluarMano(List<Cartas> mano) {
        // Método simplificado para evaluar la fuerza de la mano de la computadora
        if (ManosPoker.esEscaleraReal(mano)) {
            return 100;
        } else if (ManosPoker.esEscaleraColor(mano)) {
            return 90;
        } else if (ManosPoker.esPoker(mano)) {
            return 80;
        } else if (ManosPoker.esFull(mano)) {
            return 70;
        } else if (ManosPoker.esColor(mano)) {
            return 60;
        } else if (ManosPoker.esEscalera(mano)) {
            return 50;
        } else if (ManosPoker.esTrio(mano)) {
            return 40;
        } else if (ManosPoker.esDoblePar(mano)) {
            return 30;
        } else if (ManosPoker.esPar(mano)) {
            return 20;
        } else {
            return 10;
        }
    }
/**
     * Método que iguala la apuesta con el jugador
     *
     */
    private void igualarApuestaComputadora() {
        apuestaComputadora = apuestaJugador;
        bote += apuestaComputadora;
        System.out.println("La computadora iguala la apuesta.");
    }

    /**
     * Método que sube la apuesta de la computadora
     */
    private void subirApuestaComputadora() {
        int subida = random.nextInt(10) + 1;
        apuestaComputadora += subida;
        bote += apuestaComputadora;
        System.out.println("La computadora sube la apuesta en " + subida);
    }

    /**
     * Método que pasa la apuesta de la computadora
     */
    private void pasarApuestaComputadora() {
        System.out.println("La computadora pasa.");
    }
/**
     * Método que retira a la computadora de la partida
     */

    public boolean retirarseComputadora() {
        jugadorRetirado = true;
        System.out.println("La computadora se retira.");
        return jugadorRetirado;
    }

    /**
     * Metodo que permite la toma de decisiones
     *
     */

    @Override
    public void opciones() {
        int opcion = sc.nextInt();
        evaluarMano(manoComputadora);
        evaluarMejorMano(manoComputadora, manoMesa);
        tomarDecisionIA();
        switch (opcion) {
            case 1:
                poker.retirarse();
                break;
            case 2:
                subirApuesta();
                break;
            case 3:
                igualarApuesta();
                break;
            case 4:
                pasarApuesta();
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
        if (!jugadorRetirado) {
            tomarDecisionIA();
        }
    }

    /**
     *
     * @return
     */
    @Override
    public int getApuesta() {
        return 0;
    }

    /**
     *
     */
    @Override
    public void setApuesta() {

    }

    /**
     * Metodo que establece una apuesta inicial
     *
     * @return
     */
    @Override
    public int apuestaInicial() {
        if (ciegaG = false) {
            apuestaComputadora = 50;
            bote = 50;
        } else {
            apuestaComputadora = 100;
            bote = 100;
        }
        return 0;
    }

    /**
     * Metodo que permite subir la apuesta
     */
    @Override
    public void subirApuesta() {

            int inc = 0;

            switch (inc) {
                case 1:
                    apuestaComputadora += 50;
                    bote = bote + apuestaComputadora;
                    break;
                case 2:
                    apuestaComputadora += 100;
                    bote = bote + apuestaComputadora;
                    break;
                case 3:
                    apuestaComputadora += 150;
                    bote = bote + apuestaComputadora;
                    break;
                case 4:
                    apuestaComputadora += 250;
                    bote = bote + apuestaComputadora;
                default:
                    System.out.println("Opción inválida");
            }



        }


    /**
     * Metodo que permite igualar la apuesta
     */
    @Override
    public void igualarApuesta() {
        apuestaJugador = apuestaComputadora;
        bote += apuestaJugador;
    }

    /**
     * Metodo que permite pasar la apuesta
     */
    @Override
    public void pasarApuesta() {
        if (apuestaJugador == apuestaComputadora) {
            System.out.println("Pasa");
        } else if (apuestaJugador < apuestaComputadora) {
            System.out.println("Debes igualar la apuesta");
        } else if (apuestaJugador > apuestaComputadora) {
            evaluarMano(manoComputadora);
            tomarDecisionIA();
        }
    }

    @Override
    public void Apuesta() {
        apuestaComputadora= 50;
        bote = apuestaComputadora + 50;
    }
}

