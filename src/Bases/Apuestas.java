package Bases;

public interface Apuestas {

    int apuesta=0;
    int apuestaJugador = 0;
    int apuestaCrupier = 0;
    int subidaJugador = 0;
    int subidaCrupier = 0;

    int getApuesta();
    void setApuesta();
    void apuestaInicial();
    void subirApuesta();
    void igualarApuesta();
    void pasarApuesta();



}