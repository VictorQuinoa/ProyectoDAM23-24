package Juegos;
import JuegoDeCartas.Cartas;
import JuegoDeCartas.Baraja;
public class Bacarat {
    private Baraja baraja;
    private Cartas cartaJugador;
    private Cartas cartaBanca;

    public Bacarat() {
        this.baraja = new Baraja();
    }

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
     * @return Resultado de la partida
     */
    public String jugar() {
        repartirCartas();
        int valorJugador = valorCarta(this.cartaJugador);
        int valorBanca = valorCarta(this.cartaBanca);

        if (valorJugador > valorBanca) {
            return "El jugador gana con " + valorJugador + " contra " + valorBanca;
        } else if (valorJugador < valorBanca) {
            return "La banca gana con " + valorBanca + " contra " + valorJugador;
        } else {
            return "Es un empate con " + valorJugador;
        }
    }
}
