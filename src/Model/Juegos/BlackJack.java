package Model.Juegos;
import Model.JuegoDeCartas.Cartas;
import Model.JuegoDeCartas.Baraja;

public class BlackJack {
    private Baraja baraja;
    private Cartas cartaJugador;
    private Cartas cartaBanca;
    private int valorJugador;
    private int valorBanca;

    public BlackJack(Baraja baraja) {
        this.baraja = baraja;
        this.baraja.barajar();
    }

    public void darCartaJugador(){
        try{
            this.cartaJugador = this.baraja.dealCard();
            valorJugador += valorCarta(this.cartaJugador);
        }catch(Exception e){
            System.out.println("Error al repartir");
        }
    }

    public void darCartaCrupier(){
        try{
            this.cartaBanca = this.baraja.dealCard();
            valorBanca += valorCarta(this.cartaBanca);
        }catch (Exception e){
            System.out.println("Error al repartir");
        }
    }

    public int valorCarta(Cartas carta) {
        String valor = carta.getValor();
        try{
            switch (valor){
                case "Ace":
                    return 11;
                case "Jack":
                case "Queen":
                case "King":
                    return 10;
                default:
                    return Integer.parseInt(valor);
            }
        } catch (Exception e){
            System.out.println("Error al obtener el valor de la carta" + e.getMessage());
            return 0;
        }
    }

    public void jugarRonda(boolean jugadorPideCarta, boolean bancaPideCarta) {
        if (bancaPideCarta) {
            decidirCartaBanca();
        }
        if (jugadorPideCarta) {
            decidirCartaJugador();
        }
    }

    public boolean tomarCartaBanca(){
        return valorBanca < 17;
    }

    public void repartirCartas() {
        darCartaJugador();
        darCartaJugador();
        darCartaCrupier();
        darCartaCrupier();
    }

    public void decidirCartaBanca() {
        if(tomarCartaBanca()){
            this.cartaBanca = this.baraja.dealCard();
            valorBanca += valorCarta(this.cartaBanca);
        }
    }

    public void decidirCartaJugador() {
        this.cartaJugador = this.baraja.dealCard();
        valorJugador += valorCarta(this.cartaJugador);
    }

    public int getValorBanca() {
        return valorBanca;
    }

    public void setValorBanca(int valorBanca) {
        this.valorBanca = valorBanca;
    }

    public int getValorJugador() {
        return valorJugador;
    }

    public void setValorJugador(int valorJugador) {
        this.valorJugador = valorJugador;
    }

    public Cartas getCartaBanca() {
        return cartaBanca;
    }

    public void setCartaBanca(Cartas cartaBanca) {
        this.cartaBanca = cartaBanca;
    }

    public Cartas getCartaJugador() {
        return cartaJugador;
    }

    public void setCartaJugador(Cartas cartaJugador) {
        this.cartaJugador = cartaJugador;
    }

    public String getRutaImagenCartaJugador(){
        return this.cartaJugador.getImagePaths();
    }

    public String getRutaImagenCartaBanca(){
        return this.cartaBanca.getImagePaths();
    }
}