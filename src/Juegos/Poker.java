package Juegos;

import JuegoDeCartas.Cartas;
import JuegoDeCartas.ManosPoker;
import Bases.Apuestas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    private List<Cartas> baraja;
    private List<Cartas> manoJugador;
    private List<Cartas> manoComputadora;
    private List<Cartas> manoMesa;
    private int bote;
    private int apuestaJugador;
    private int apuestaComputadora;
    private int ronda;
    private boolean jugadorRetirado = false;
    Apuestas apuesta = new Apuestas();

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

//Método para retirase de la ronda

    public void retirarse() {
        // Asegurarse de que el jugador no se haya retirado antes de permitirle tomar una opción
        boolean jugadorRetirado = false;

        if (jugadorRetirado = false) {
            opciones();
        } else {
            System.out.println("El jugador ya se ha retirado");
        }


    }


//Switch que da el paso a las diferentes opciones segun la elección del usuario

    public void opciones() {

        int opcion = 0;

        switch (opcion) {
            case 1:
                terminarRonda();
                break;
            case 2:
                apuesta.subirApuesta();
            case 3:
                apuesta.igualarApuesta();
            case 4:
                apuesta.pasarApuesta();
            case 5:
                retirarse();
            default:
                System.out.println("Opción inválida");
        }
    }

    //Metodo con las manos posibles
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

    private void terminarRonda() {
        // Limpia las manos de los jugadores y la mesa
        manoJugador.clear();
        manoComputadora.clear();
        manoMesa.clear();
        // Resetea las apuestas
        apuestaJugador = 0;
        apuestaComputadora = 0;
        // Resetea el estado de retirado del jugador
        jugadorRetirado = false;
        System.out.println("La ronda ha terminado");
    }

    private void empezarRonda() {
        reparto();
        opciones();
    }
}


