package IA;
import  Juegos.Poker;

public class IA_poker extends Poker {

private Poker juego;


public IA_poker(Poker juego) {
        this.juego = juego;
    }

    public void tomarDecision() {

    }

    public void deberiaRetirarse(){


    }

        private boolean deberiaSubirApuesta() {



        }

        private boolean deberiaIgualarApuesta() {

            return false;
        }

        private boolean deberiaPasarApuesta() {
            // Aquí va la lógica para decidir si el crupier debería pasar la apuesta
            return false;
        }
    }

