package Model.Juegos;
import Model.JuegoDeCartas.Cartas;
import Model.JuegoDeCartas.Baraja;

import java.util.Scanner;
/**
 * Clase Bacarat
 */
public class Bacarat {
    private Baraja baraja;
    private Cartas cartaJugador;
    private Cartas cartaBanca;
    private int valorJugador;
    private int valorBanca;

    /**
     * Constructor de la clase Bacarat
     * @param baraja Baraja con la que se va a jugar
     */
    public Bacarat(Baraja baraja) {
        this.baraja = baraja;
        this.baraja.barajar();
    }

    /**
     * Método para dar una carta al jugador
     */
    public void darCartaJugador(){
        try{
            this.cartaJugador = this.baraja.dealCard();
        }catch(Exception e){
            System.out.println("Error al repartir");
        }
    }
    /**
     * Método para dar una carta al crupier
     */
    public void darCartaCrupier(){
        try{
            this.cartaBanca = this.baraja.dealCard();
        }catch (Exception e){
            System.out.println("Error al repartir");
        }
    }
    /**
     * Método para obtener el valor de una carta
     * @param carta Carta de la que se quiere obtener el valor
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
     * Método para jugar al Bacarat
     * @param scanner Scanner para leer la entrada del usuario
     */
    public void jugarBacarat(Scanner scanner) {
        String continuar;
        do {
            try{
                jugarRonda(scanner);
            } catch (Exception e){
                System.out.println("Error al jugar: " + e.getMessage());
            }

            continuar = preguntarContinuar(scanner);
        } while (continuar.equalsIgnoreCase("S"));
    }
    /**
     * Método para jugar una ronda de Bacarat
     * @param scanner Scanner para leer la entrada del usuario
     */
    private void jugarRonda(Scanner scanner) {
        repartirCartas();
        decidirCartaBanca();
        decidirCartaJugador(scanner);
        determinarGanador();
    }
    /**
     * Método para repartir las cartas iniciales
     */
    private void repartirCartas() {
        darCartaJugador();
        valorJugador = valorCarta(this.cartaJugador);
        System.out.println("Primera carta: " + this.cartaJugador);
        System.out.println("Total hasta ahora: " + valorJugador);

        darCartaJugador();
        valorJugador =(valorJugador + valorCarta(this.cartaJugador))%10;
        System.out.println("Segunda carta: " + this.cartaJugador);
        System.out.println("Total del jugador: " + valorJugador);

        darCartaCrupier();
        valorBanca = valorCarta(this.cartaBanca) ;
        System.out.println("Primera carta de la banca: " + this.cartaBanca);
        System.out.println("Total de la banca: " + valorBanca);

        darCartaCrupier();
        valorBanca = (valorBanca + valorCarta(this.cartaBanca))%10;
        System.out.println("Segunda carta de la banca: " + this.cartaBanca);
        System.out.println("Total de la banca: " + valorBanca);
    }
    /**
     * Método para decidir si la banca pide otra carta
     */
    private void decidirCartaBanca() {
        if(valorBanca<5){
            System.out.println("La banca debe pedir otra carta");
            this.cartaBanca = this.baraja.dealCard();
            valorBanca = (valorBanca + valorCarta(this.cartaBanca)) % 10;
            System.out.println("La nueva carta de la banca es: " + this.cartaBanca);
            System.out.println("El nuevo total de la banca es: " + valorBanca);
        }else{
            System.out.println("La banca no pide carta");
        }
    }
    /**
     * Método para decidir si el jugador pide otra carta
     * @param scanner Scanner para leer la entrada del usuario
     */
    private void decidirCartaJugador(Scanner scanner) {
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
            }
        }
    }
    /**
     * Método para determinar el ganador de la ronda
     */
    private void determinarGanador() {
        if (valorJugador > valorBanca) {
            System.out.println("El jugador gana con " + valorJugador + " contra " + valorBanca);
        } else if (valorJugador < valorBanca) {
            System.out.println("La banca gana con " + valorBanca + " contra " + valorJugador);
        } else {
            System.out.println("Es un empate con " + valorJugador);
        }
    }
    /**
     * Método para preguntar al usuario si desea continuar jugando
     * @param scanner Scanner para leer la entrada del usuario
     * @return Respuesta del usuario
     */
    private String preguntarContinuar(Scanner scanner) {
        System.out.println("¿Deseas jugar otra vez? (S/N)");
        while (true) {
            String continuar = scanner.nextLine().toUpperCase();
            if (continuar.equals("S") || continuar.equals("N")) {
                return continuar;
            } else {
                System.out.println("Entrada inválida. Por favor, ingresa 'S' o 'N'.");
            }
        }
    }
    /**
     * Método para obtener el valor de la banca
     * @return Valor de la banca
     */
    public int getValorBanca() {
        return valorBanca;
    }
    /**
     * Método para asignar el valor de la banca
     * @param valorBanca Valor de la banca
     */
    public void setValorBanca(int valorBanca) {
        this.valorBanca = valorBanca;
    }
    /**
     * Método para obtener la carta del jugador
     * @return Carta del jugador
     */
    public int getValorJugador() {
        return valorJugador;
    }
    /**
     * Método para asignar el valor del jugador
     * @param valorJugador Valor del jugador
     */
    public void setValorJugador(int valorJugador) {
        this.valorJugador = valorJugador;
    }
}