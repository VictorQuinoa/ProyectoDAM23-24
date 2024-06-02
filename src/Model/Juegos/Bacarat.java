package Model.Juegos;
import Model.JuegoDeCartas.Cartas;
import Model.JuegoDeCartas.Baraja;

/**
 * Clase que representa el juego de Bacarat

 */
public class Bacarat {
    private Baraja baraja;
    private Cartas cartaJugador;
    private Cartas cartaBanca;
    private int valorJugador;
    private int valorBanca;

    /**
     * Constructor de la clase Bacarat
     * @param baraja baraja
     */
    public Bacarat(Baraja baraja) {
        this.baraja = baraja;
        this.baraja.barajar();
    }

    /**
     * Metodo de dar carta al jugador
     */
    public void darCartaJugador(){
        try{
            this.cartaJugador = this.baraja.dealCard();
            valorJugador += valorCarta(this.cartaJugador);

        }catch(Exception e){
            System.out.println("Error al repartir");
        }
    }
    public void redondearValorCarta(int valorJugador,int valorBanca){
        if(valorJugador>9){
            this.valorJugador = valorJugador%10;
        }
        if(valorBanca>9){
            this.valorBanca = valorBanca%10;
        }

    }
    /**
     * Metodo de dar carta al crupier
     */
    public void darCartaCrupier(){
        try{
            this.cartaBanca = this.baraja.dealCard();
            valorBanca += valorCarta(this.cartaBanca);


        }catch (Exception e){
            System.out.println("Error al repartir");
        }
    }

    /**
     * Metodo veirifca el valor de la carta
     * @param carta carta
     * @return valor de la carta
     */
    public int valorCarta(Cartas carta) {
        String valor = carta.getValor();
        try{
            switch (valor){
                case "Ace":
                    return 1;
                case "Jack":
                    return 0;
                case "Queen":
                    return 0;
                case "King":
                    return 0;
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
     * Metodo que juega una ronda de Bacarat
     * @param jugadorPideCarta jugador pide carta
     * @param bancaPideCarta  banca pide carta
     */
    public void jugarRonda(boolean jugadorPideCarta, boolean bancaPideCarta) {
        if (bancaPideCarta) {
            decidirCartaBanca();
        }
        if (jugadorPideCarta) {
            decidirCartaJugador();
        }
    }

    public boolean tomarCartaBanca(){
        if(valorBanca<5){
            return true;
        }
        return false;
    }

    /**
     * Metodo que reparte las cartas
     */
    public void repartirCartas() {
        darCartaJugador();
        valorJugador = valorCarta(this.cartaJugador);

        darCartaJugador();
        valorJugador =(valorJugador + valorCarta(this.cartaJugador))%10;

        darCartaCrupier();
        valorBanca = valorCarta(this.cartaBanca) ;

        darCartaCrupier();
        valorBanca = (valorBanca + valorCarta(this.cartaBanca))%10;
    }

    /**
     * Metodo que decide la carta de la banca
     */
    public void decidirCartaBanca() {
        if(valorBanca<5){
            this.cartaBanca = this.baraja.dealCard();
            valorBanca = (valorBanca + valorCarta(this.cartaBanca)) % 10;
        }
    }

    /**
     * Metodo que decide la carta del jugador
     */
    public void decidirCartaJugador() {
        this.cartaJugador = this.baraja.dealCard();
        valorJugador = (valorJugador + valorCarta(this.cartaJugador)) % 10;
    }

    /**
     * Metodo que devuelve el valor de la banca
     * @return valor de la banca
     */
    public int getValorBanca() {
        return valorBanca;
    }

    /**
     * Metodo que asigna el valor de la banca
     * @param valorBanca valor de la banca
     */
    public void setValorBanca(int valorBanca) {
        this.valorBanca = valorBanca;
    }
    /**
     * Metodo que devuelve el valor del jugador
     * @return valor del jugador
     */
    public int getValorJugador() {
        return valorJugador;
    }
    /**
     * Metodo que asigna el valor del jugador
     * @param valorJugador valor del jugador
     */
    public void setValorJugador(int valorJugador) {
        this.valorJugador = valorJugador;
    }
    /**
     * Metodo que devuelve la carta de la banca
     * @return carta de la banca
     */
    public Cartas getCartaBanca() {
        return cartaBanca;
    }
    /**
     * Metodo que asigna la carta de la banca
     * @param cartaBanca carta de la banca
     */
    public void setCartaBanca(Cartas cartaBanca) {
        this.cartaBanca = cartaBanca;
    }
    /**
     * Metodo que devuelve la carta del jugador
     * @return carta del jugador
     */
    public Cartas getCartaJugador() {
        return cartaJugador;
    }
    /**
     * Metodo que asigna la carta del jugador
     * @param cartaJugador carta del jugador
     */
    public void setCartaJugador(Cartas cartaJugador) {
        this.cartaJugador = cartaJugador;
    }
    /**
     * Metodo que devuelve la baraja
     * @return baraja
     */
    public String getRutaImagenCartaJugador(){
        return this.cartaJugador.getImagePaths();
    }
    /**
     * Metodo que devuelve la baraja
     * @return baraja
     */
    public String getRutaImagenCartaBanca(){
        return this.cartaBanca.getImagePaths();
    }
}