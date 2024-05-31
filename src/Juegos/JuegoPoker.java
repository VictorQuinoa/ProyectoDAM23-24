package Juegos;

import IA.IA_poker;

import static Bases.Apuestas.apuestaJugador;

public class JuegoPoker {
    Poker pok = new Poker();
    IA_poker ia = new IA_poker();
    boolean jugar = true;

   public void jugarPoker(){

       do{
         pok.apuestaInicial();
         ia.apuestaInicial();
         while (pok.getRonda() < 4) {
             pok.reparto();
             boolean turnoJugador = true;
             while (pok.getRonda() < 4) {
                 if (turnoJugador) {
                     pok.opciones();
                     turnoJugador = false;
                 } else {
                     ia.opciones();
                     turnoJugador = true;
                 }
             }
         }

           if (pok.getCarteraJugador()<= 500 || ia.getCarteraComputadora() <= 500) {
                jugar = false; // Terminar el juego si alguno de los jugadores se queda sin dinero
               System.out.println("Uno de los jugadores no tiene fichas suficientes para seguir jugando");
           }


       }while(jugar = true);
   }
}
