package Juegos;
import JuegoDeCartas.Cartas;
import JuegoDeCartas.Baraja;

import java.util.Scanner;

public class Bacarat {
    private Baraja baraja;
    private Cartas cartaJugador;
    private Cartas cartaBanca;

    public Bacarat() {
        this.baraja = new Baraja();
    }

    /**
     * Metodo para repartir cartas
     */
    public void repartirCartas() {
        try{
            this.cartaJugador = this.baraja.dealCard();
            this.cartaBanca = this.baraja.dealCard();
        } catch (Exception e){
            System.out.println("Error al repartir cartas");
        }

    }

    /**
     * Devuelve el valor de una carta en el juego de Bacarat.
     * @param carta Carta a evaluar
     * @return Valor de la carta
     */
    private int valorCarta(Cartas carta) {
        try{
            return carta.getValorNumerico();

        } catch (Exception e){
            System.out.println("Error al obtener el valor de la carta" + e.getMessage());
            return 0;
        }
    }

    /**
     * Juega una partida de Bacarat y devuelve el resultado.
     */
    public void jugarBacarat() {
        Scanner scanner = new Scanner(System.in);
        String continuar;
        do {
            try{
                repartirCartas();
                int valorJugador = valorCarta(this.cartaJugador);
                int valorBanca = valorCarta(this.cartaBanca);

                if (valorJugador > valorBanca) {
                    System.out.println("El jugador gana con " + valorJugador + " contra " + valorBanca);
                } else if (valorJugador < valorBanca) {
                    System.out.println("La banca gana con " + valorBanca + " contra " + valorJugador);
                } else {
                    System.out.println("Es un empate con " + valorJugador);
                }
            } catch (Exception e){
                System.out.println("Error al jugar" + e.getMessage());
            }

            System.out.println("¿Deseas jugar otra vez? (S/N)");
            continuar=scanner.nextLine().toUpperCase();
        } while (continuar.equalsIgnoreCase("S"));

    }
}
