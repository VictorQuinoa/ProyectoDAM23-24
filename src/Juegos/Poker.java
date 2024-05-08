package Juegos;

import JuegoDeCartas.Cartas;
import JuegoDeCartas.ManosPoker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    private List<Cartas> baraja;
    private List<Cartas> manoJugador;
    private List<Cartas> manoComputadora;
    private int apuestaJugador;
    private int apuestaComputadora;

    public Poker() {
        this.baraja = new ArrayList<>();
        this.manoJugador = new ArrayList<>();
        this.manoComputadora = new ArrayList<>();
        this.apuestaJugador = 0;
        this.apuestaComputadora = 0;
        // Aquí deberías inicializar tu baraja de cartas
    }

    public void reparto() {
        Collections.shuffle(baraja);
        for (int i = 0; i < 5; i++) {
            manoJugador.add(baraja.remove(baraja.size() - 1));
            manoComputadora.add(baraja.remove(baraja.size() - 1));
        }
    }

    public void apuesta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su apuesta: ");
        apuestaJugador = scanner.nextInt();
        // Aquí puedes implementar la lógica de la apuesta de la computadora
        apuestaComputadora = 0;
    }

    public void opciones() {
        // Aquí puedes implementar las opciones que el jugador puede tomar durante el juego
    }

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
}
