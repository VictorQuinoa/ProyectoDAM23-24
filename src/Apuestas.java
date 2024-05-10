

public class Apuestas {

    private int apuesta;
    private int apuestaJugador;
    private int apuestaCrupier;

    public Apuestas() {
        this.apuesta = 0;
    }

    public int getApuesta() {
        return apuesta;
    }

    public void setApuesta() {
        this.apuesta = apuesta;

    }

    public void apuestaInicial() {
        apuesta== apuestaJugador+apuestaCrupier;
        this.apuesta = apuesta;

    }

    public void subirApuesta() {
        this.apuesta += apuesta;
    }

    public void igualarApuesta() {
        this.apuesta = apuesta;
    }
}