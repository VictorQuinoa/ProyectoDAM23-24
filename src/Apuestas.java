

public class Apuestas {

    private int apuesta;
    private int apuestaJugador;
    private int apuestaCrupier;
    private int subidaJugador;
    private int subidaCrupier;
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
        apuesta = apuestaJugador + apuestaCrupier;
        this.apuesta = apuesta;

    }

    public void subirApuesta() {
        apuesta = subidaCrupier + subidaJugador;
        this.apuesta += apuesta;
    }

    public void igualarApuesta() {
        if (apuestaJugador == apuestaCrupier) {

        } else {
            apuesta = apuestaCrupier;
        }
        this.apuesta = apuesta;
    }
}