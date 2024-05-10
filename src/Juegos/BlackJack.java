package Juegos;

import JuegoDeCartas.Baraja;
import JuegoDeCartas.Cartas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJack {
    /**
     * Método para jugar al Blackjack
     * @param scanner Scanner para leer la entrada del usuario
     */
    public static void jugarBlackjack(Scanner scanner){
        Baraja baraja = new Baraja();
        baraja.barajar();

        List<Cartas> manoJugador = new ArrayList<>();
        List<Cartas> manoCrupier = new ArrayList<>();

        // Inicia el juego repartiendo cartas
        manoJugador.add(baraja.tomarCarta());
        manoCrupier.add(baraja.tomarCarta());
        manoJugador.add(baraja.tomarCarta());
        manoCrupier.add(baraja.tomarCarta());

        // Mostrar la mano del jugador y la carta visible del crupier
        System.out.println("Tu mano: ");
        for (Cartas carta : manoJugador) {
            System.out.println(carta);
        }
        System.out.println("Total: " + valorMano(manoJugador));
        System.out.println("\nLa carta visible del crupier es: " + manoCrupier.get(0));

        // Turno del jugador
        while (true) {
            System.out.println("\n¿Quieres pedir otra carta? (s/n)");
            String eleccion = scanner.nextLine();
            if (eleccion.equalsIgnoreCase("s")) {
                manoJugador.add(baraja.tomarCarta());
                System.out.println("Tu mano: ");
                for (Cartas carta : manoJugador) {
                    System.out.println(carta);
                }
                System.out.println("Total: " + valorMano(manoJugador));
                if (valorMano(manoJugador) > 21) {
                    System.out.println("Te has pasado de 21. ¡Has perdido!");
                    return;
                }
            } else {
                break;
            }
        }

        // Turno del crupier
        System.out.println("\nTurno del crupier:");
        System.out.println("Mano del crupier: ");
        for (Cartas carta : manoCrupier) {
            System.out.println(carta);
        }
        while (valorMano(manoCrupier) < 17) {
            manoCrupier.add(baraja.tomarCarta());
            System.out.println("Total del crupier: " + valorMano(manoCrupier));
        }

        // Determinar ganador
        int totalJugador = valorMano(manoJugador);
        int totalCrupier = valorMano(manoCrupier);
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

    /**
     * Método para calcular el valor total de la mano
     * @param mano Lista de cartas
     * @return Valor total de la mano
     */
    private static int valorMano(List<Cartas> mano) {
        try{
            int total = 0;
            int ases = 0;
            for (Cartas carta : mano) {
                if (carta.getValorNumerico() == 1) {
                    ases++;
                }
                total += carta.getValorNumerico();
            }
            while (ases > 0 && total + 10 <= 21) {
                total += 10;
                ases--;
            }
            return total;
        } catch (Exception e){
            System.out.println("Error al calcular el valor de la mano" + e.getMessage());
            return 0;
        }
    }

}
