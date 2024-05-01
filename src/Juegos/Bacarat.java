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
        this.cartaJugador = this.baraja.dealCard();
        this.cartaBanca = this.baraja.dealCard();
    }

    private int valorCarta(Cartas carta) {
        String valor = carta.getValor();
        switch (valor) {
            case "Ace":
                return 1;
            case "Jack":
            case "Queen":
            case "King":
                return 10;
            default:
                return Integer.parseInt(valor);
        }
    }

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
