package Model.Juegos;

import Model.JuegoDeCartas.Baraja;
import Model.JuegoDeCartas.Cartas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase BlackJack
 */
public class BlackJack {
    /**
     * Clase Jugador
     */
    private static class Jugador {
        private final List<Cartas> mano = new ArrayList<>();
        /**
         * Método para recibir una carta
         * @param carta Carta que recibe el jugador
         */
        public void recibirCarta(Cartas carta) {
            mano.add(carta);
        }
        /**
         * Método para obtener el valor de la mano
         * @return Valor de la mano
         */
        public int valorMano() {
            int total = 0;
            int ases = 0;
            for (Cartas carta : mano) {
                if (carta.getValorNumerico() == 1) {
                    ases++;
                }else
                total += (carta.getValorNumerico()>10)?10: carta.getValorNumerico();
            }
            while (ases > 0 && total + 10 <= 21) {
                total += 10;
                ases--;
            }
            return total;
        }
        /**
         * Método para mostrar la mano del jugador
         */
        public void mostrarMano() {
            for (Cartas carta : mano) {
                System.out.println(carta);
            }
            System.out.println("Total: " + valorMano());
        }
    }
    /**
     * Método para jugar al Blackjack
     * @param scanner Scanner para leer la entrada del usuario
     */
    public static void jugarBlackjack(Scanner scanner){
        String jugarOtraVez;
        do {
            try {
                Baraja baraja = new Baraja();
                baraja.barajar();

                Jugador jugador = new Jugador();
                Jugador crupier = new Jugador();

                jugador.recibirCarta(baraja.tomarCarta());
                crupier.recibirCarta(baraja.tomarCarta());
                jugador.recibirCarta(baraja.tomarCarta());
                crupier.recibirCarta(baraja.tomarCarta());

                System.out.println("Tu mano: ");
                jugador.mostrarMano();
                System.out.println("\nLa carta visible del crupier es: " + crupier.mano.get(0));

                pedirCartas(jugador, scanner, baraja);
                if(jugador.valorMano() > 21){
                    System.out.println("¡Has perdido!");
                } else {
                    pedirCartasCrupier(crupier, baraja);
                    determinarGanador(jugador, crupier);
                }

                jugarOtraVez = pedirEntrada(scanner, "\n¿Quieres jugar otra vez? (s/n)");
            } catch (Exception e){
                System.out.println("Error al jugar al Blackjack" + e.getMessage());
                jugarOtraVez = "n";
            }
        } while (jugarOtraVez.equalsIgnoreCase("s"));
    }

    /**
     * Método para pedir cartas al jugador
     * @param jugador Jugador al que se le piden cartas
     * @param scanner Scanner para leer la entrada del usuario
     * @param baraja Baraja de la que se toman las cartas
     */
    private static void pedirCartas(Jugador jugador, Scanner scanner, Baraja baraja) {
        boolean jugadorPerdio = false;
        while (!jugadorPerdio) {
            String eleccion = pedirEntrada(scanner, "\n¿Quieres pedir otra carta? (s/n)");
            if (eleccion.equalsIgnoreCase("s")) {
                jugador.recibirCarta(baraja.tomarCarta());
                System.out.println("Tu mano: ");
                jugador.mostrarMano();
                if (jugador.valorMano() > 21) {
                    System.out.println("Te has pasado de 21. ¡Has perdido!");
                    jugadorPerdio = true;
                }
            } else {
                break;
            }
        }
    }
    private static String pedirEntrada(Scanner scanner, String mensaje) {
        String entrada;
        do{
            System.out.println(mensaje);
            entrada = scanner.nextLine().toLowerCase();
        } while (!entrada.equals("s") && !entrada.equals("n"));
        return entrada;
    }

    /**
     * Método para pedir cartas al crupier
     * @param crupier Crupier al que se le piden cartas
     * @param baraja Baraja de la que se toman las cartas
     */
    private static void pedirCartasCrupier(Jugador crupier, Baraja baraja) {
        System.out.println("\nTurno del crupier:");
        System.out.println("Mano del crupier: ");
        crupier.mostrarMano();
        while (crupier.valorMano() < 17) {
            crupier.recibirCarta(baraja.tomarCarta());
            System.out.println("Total del crupier: " + crupier.valorMano());
        }
    }

    /**
     * Método para determinar el ganador
     * @param jugador Jugador
     * @param crupier Crupier
     */
    private static void determinarGanador(Jugador jugador, Jugador crupier) {
        int totalJugador = jugador.valorMano();
        int totalCrupier = crupier.valorMano();
        System.out.println("\nTu total: " + totalJugador);
        System.out.println("Total del crupier: " + totalCrupier);

        if (totalJugador > 21) {
            System.out.println("¡Has perdido!");
        } else if (totalCrupier > 21 || totalJugador > totalCrupier) {
            System.out.println("¡Has ganado!");
        } else if (totalJugador < totalCrupier) {
            System.out.println("¡Has perdido!");
        } else {
            System.out.println("Es un empate.");
        }
    }
}