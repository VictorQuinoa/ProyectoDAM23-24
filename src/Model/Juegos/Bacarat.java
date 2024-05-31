package Model.Juegos;
import Model.JuegoDeCartas.Cartas;
import Model.JuegoDeCartas.Baraja;

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
        String valor = carta.getValor();
        try{
            switch (valor){
                case "Ace":
                    return 1;
                case "Jack":
                case "Queen":
                case "King":
                case "10":
                    return 0;
                default:
                    return Integer.parseInt(valor);
            }
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
                // Repartir la primera carta y mostrarla
                repartirCartas();
                int valorJugador = valorCarta(this.cartaJugador);
                System.out.println("Primera carta: " + this.cartaJugador);
                System.out.println("Total hasta ahora: " + valorJugador);

                // Repartir la segunda carta y mostrarla
                repartirCartas();
                valorJugador += valorCarta(this.cartaJugador);
                System.out.println("Segunda carta: " + this.cartaJugador);
                System.out.println("Total hasta ahora: " + valorJugador);

                int valorBanca = valorCarta(this.cartaBanca) + valorCarta(this.baraja.dealCard());

                // Si la suma es de dos dígitos, nos quedamos con el segundo dígito
                valorJugador = valorJugador % 10;
                valorBanca = valorBanca % 10;

                String respuesta;
                boolean cartaAdicionalPedida = false;
                if (!cartaAdicionalPedida) {
                    System.out.println("¿Deseas pedir otra carta? (S/N)");
                    while (true) {
                        respuesta = scanner.nextLine().toUpperCase();
                        if (respuesta.equals("S") || respuesta.equals("N")) {
                            break;
                        } else {
                            System.out.println("Entrada inválida. Por favor, ingresa 'S' o 'N'.");
                        }
                    }
                    if (respuesta.equals("S")) {
                        this.cartaJugador = this.baraja.dealCard();
                        valorJugador = (valorJugador + valorCarta(this.cartaJugador)) % 10;
                        System.out.println("Tu nueva carta es: " + this.cartaJugador);
                        System.out.println("Tu nuevo total es: " + valorJugador);
                        cartaAdicionalPedida = true;
                    }
                }

                if (valorJugador > valorBanca) {
                    System.out.println("El jugador gana con " + valorJugador + " contra " + valorBanca);
                } else if (valorJugador < valorBanca) {
                    System.out.println("La banca gana con " + valorBanca + " contra " + valorJugador);
                } else {
                    System.out.println("Es un empate con " + valorJugador);
                }
            } catch (Exception e){
                System.out.println("Error al jugar: " + e.getMessage());
            }

            System.out.println("¿Deseas jugar otra vez? (S/N)");
            while (true) {
                continuar = scanner.nextLine().toUpperCase();
                if (continuar.equals("S") || continuar.equals("N")) {
                    break;
                } else {
                    System.out.println("Entrada inválida. Por favor, ingresa 'S' o 'N'.");
                }
            }
        } while (continuar.equalsIgnoreCase("S"));
    }
}
