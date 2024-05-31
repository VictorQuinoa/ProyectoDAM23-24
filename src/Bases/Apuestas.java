package Bases;

public interface Apuestas {


    int apuestaJugador = 0;
    int apuestaCrupier = 0;
    int subidaJugador = 0;
    int subidaCrupier = 0;

    int getApuesta();
    void setApuesta();
    int apuestaInicial();
    void subirApuesta();
    void igualarApuesta();
    void pasarApuesta();
    void Apuesta();



}