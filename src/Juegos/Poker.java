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
    private int bote;
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

    //Método de reparto y baraja de cartas

    public void reparto() {
        Collections.shuffle(baraja);
        for (int i = 0; i < 5; i++) {
            manoJugador.add(baraja.remove(baraja.size() - 1));
            manoComputadora.add(baraja.remove(baraja.size() - 1));
        }
    }

//Método para apuesta inicial

    public void apuesta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su apuesta: ");
        apuestaJugador = scanner.nextInt();
        // Aquí puedes implementar la lógica de la apuesta de la computadora
        apuestaComputadora = 0;
    }

//Método para subir la apuesta entre rondas

    public void subirApuesta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a subir: ");
        int subida = scanner.nextInt();
        apuestaJugador += subida;

        apuestaComputadora = 0;
    }

//Método para igualar la ultima apuesta

    public void igualarApuesta() {
        apuestaComputadora = apuestaJugador;
        // Aquí puedes implementar la lógica de la igualación de la computadora
    }

//Método para retirase de la ronda

    public void retirarse() {
        // Asegurarse de que el jugador no se haya retirado antes de permitirle tomar una opción
        boolean jugadorRetirado=false;
        if (jugadorRetirado= false) {
            opciones();
        }else{
               System.out.println("El jugador ya se ha retirado");
            }


        }

//Método para ver tu propia mano

    public void verMano() {
        System.out.println("Tu mano: " + manoJugador);
    }

//Método para pasar de apostar.
    public void pasar() {



    }

//Switch que da el paso a las diferentes opciones segun la elección del usuario

    public void opciones() {

        int opcion = 0;

        switch (opcion) {
            case 1:

                subirApuesta();
                break;

            case 2:
                igualarApuesta();
                break;
            case 3:
                retirarse();
                break;
            case 4:
                verMano();
                break;
            case 5:
                pasar();
                break;
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
}
