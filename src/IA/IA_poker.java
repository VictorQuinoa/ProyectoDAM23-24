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
    private List<Cartas> manoComputadora;
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

    public IA_poker(Economia economia) {
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

    private void tomarDecisionIA() {
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

    private int evaluarMano(List<Cartas> mano) {
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

    private void igualarApuestaComputadora() {
        apuestaComputadora = apuestaJugador;
        bote += apuestaComputadora;
        System.out.println("La computadora iguala la apuesta.");
    }

    private void subirApuestaComputadora() {
        int subida = random.nextInt(10) + 1;
        apuestaComputadora += subida;
        bote += apuestaComputadora;
        System.out.println("La computadora sube la apuesta en " + subida);
    }

    private void pasarApuestaComputadora() {
        System.out.println("La computadora pasa.");
    }

    private void retirarseComputadora() {
        jugadorRetirado = true;
        System.out.println("La computadora se retira.");
    }

    @Override
    public void opciones() {
        int opcion = sc.nextInt();
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
        bote = apuesta;
    }

    @Override
    public void subirApuesta() {
        apuesta += sc.nextInt();
    }

    @Override
    public void igualarApuesta() {
        apuestaJugador = apuestaComputadora;
        bote += apuestaJugador;
    }

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
}

