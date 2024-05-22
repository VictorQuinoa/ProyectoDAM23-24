package Juegos;

import Bases.Economia;
import JuegoDeCartas.Cartas;
import JuegoDeCartas.ManosPoker;
import Bases.Apuestas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker extends Economia implements Apuestas{
Scanner sc = new Scanner(System.in);
    private List<Cartas> baraja;
    private static List<Cartas> manoJugador;
    private static List<Cartas> manoComputadora;
    private static List<Cartas> manoMesa;
    private static int bote;
    private static int apuestaJugador;
    private static int apuestaComputadora;
    private int ronda;
    private static boolean jugadorRetirado = false;

    private static boolean ganador = false;
    private static Economia economia;
    private static int cartera = economia.getCarteraJugador();
    private static int carteraComputadora = economia.getCarteraComputadora();

    public Poker() {
        this.baraja = new ArrayList<>();
        this.manoJugador = new ArrayList<>();
        this.manoComputadora = new ArrayList<>();
        this.manoMesa = new ArrayList<>();
        this.apuestaJugador = 0;
        this.apuestaComputadora = 0;
        // Aquí deberías inicializar tu baraja de cartas
    }

    //Método de reparto y baraja de cartas

    /**
     * Método que reparte las cartas a los jugadores y la mesa
     */
    public void reparto() {
        switch (ronda) {
            case 1:
                Collections.shuffle(baraja);
                for (int i = 0; i < 2; i++) {
                    manoJugador.add(baraja.remove(baraja.size() - 1));
                    manoComputadora.add(baraja.remove(baraja.size() - 1));
                }
                System.out.println(manoJugador);
                break;
            case 2:
                Collections.shuffle(baraja);
                for (int j = 0; j < 3; j++) {
                    manoMesa.add(baraja.remove(baraja.size() - 1));

                }
                System.out.println(manoJugador);
                System.out.println(manoMesa);
                break;
            case 3:
                for (int k = 0; k < 1; k++) {
                    manoMesa.add(baraja.remove(baraja.size() - 1));
                }
                System.out.println(manoJugador);
                System.out.println(manoMesa);
                break;
            case 4:
                for (int a = 0; a < 1; a++) {
                    manoMesa.add(baraja.remove(baraja.size() - 1));
                }
                System.out.println(manoJugador);
                System.out.println(manoMesa);

                break;
            default:
                System.out.println("Ronda inválida");
        }

    }

    /**
     * Método que permite al jugador retirarse de la partida
     */

    public void retirarse() {
        // Asegurarse de que el jugador no se haya retirado antes de permitirle tomar una opción
        boolean jugadorRetirado = false;

        if (jugadorRetirado = false) {
            opciones();
        } else {
            System.out.println("El jugador ya se ha retirado");
        }

    }

    /**
     * Método que permite al jugador tomar una decisión
     */

    public void opciones() {

        int opcion = 0;

        switch (opcion) {
            case 1:
                terminarRonda();
            case 2:
              subirApuesta();
            case 3:
                igualarApuesta();
            case 4:
                pasarApuesta();
            case 5:
                retirarse();
            default:
                System.out.println("Opción inválida");
        }
    }

    /**
     * Método que muestra las manos de los jugadores y la mesa
     */
    public void manos() {
        System.out.println("Tu mano: " + manoJugador);
        System.out.println("Mano de la computadora: " + manoComputadora);
        if (ManosPoker.esEscaleraReal(manoJugador)) {
            System.out.println("Tienes una Escalera Real!");
        } else if (ManosPoker.esEscaleraColor(manoJugador)) {
            System.out.println("Tienes una Escalera de Color!");
        } else if (ManosPoker.esPoker(manoJugador)) {
            System.out.println("Tienes un Poker!");
        } else if (ManosPoker.esFull(manoJugador)) {
            System.out.println("Tienes un Full!");
        } else if (ManosPoker.esColor(manoJugador)) {
            System.out.println("Tienes un Color!");
        } else if (ManosPoker.esEscalera(manoJugador)) {
            System.out.println("Tienes una Escalera!");
        } else if (ManosPoker.esTrio(manoJugador)) {
            System.out.println("Tienes un Trio!");
        } else if (ManosPoker.esDoblePar(manoJugador)) {
            System.out.println("Tienes un Doble Par!");
        } else if (ManosPoker.esPar(manoJugador)) {
            System.out.println("Tienes un Par!");
        } else if (ManosPoker.esCartaAlta(manoJugador)) {
            System.out.println("Tienes una Carta Alta!");

        }
    }

    /**
     * Método que termina la partida.
     */
    public static void terminarPartida() {
        // Limpia las manos de los jugadores y la mesa
        manoJugador.clear();
        manoComputadora.clear();
        manoMesa.clear();
        // Resetea las apuestas
        apuestaJugador = 0;
        apuestaComputadora = 0;
        //Bote al ganador

        if(ganador = true) {
            System.out.println("El jugador se lleva el bote");
            cartera = cartera + bote;
        }else{
            System.out.println("La computadora se lleva el bote");
            carteraComputadora = carteraComputadora + bote;
        }

        // Resetea el estado de retirado del jugador
        jugadorRetirado = false;
        System.out.println("La ronda ha terminado");
    }

    private void terminarRonda() {
        while (ronda < 5) {
            if (apuestaJugador == apuestaComputadora) {
                ronda++;
            } else {
                System.out.println("Para pasar de ronda, debes igualar la apuesta del otro jugador");
            }

        }
        if (ronda == 5) {
            System.out.println("La ronda ha terminado");
            terminarPartida();
        }
    }


    @Override
    public int getApuesta() {
        return 0;
    }

    @Override
    public void setApuesta() {

    }

    @Override
    public void apuestaInicial() {
        apuesta = sc.nextInt();
        bote =  apuesta;
    }

    @Override
    public void subirApuesta() {
        apuesta = apuesta + sc.nextInt();

    }

    @Override
    public void igualarApuesta() {
        apuestaJugador = apuestaComputadora;
        bote = bote + apuestaJugador;
    }

    @Override
    public void pasarApuesta() {
     if (apuestaJugador == apuestaComputadora) {
            System.out.println("Pasa");
        } else if (apuestaJugador < apuestaComputadora) {
            System.out.println("Debes igualar la apuesta");
        } else if (apuestaJugador > apuestaComputadora) {
          //apuestaComputador= toma decision
        }
     }


    }





