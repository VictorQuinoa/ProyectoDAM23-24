import BaseDeDatos.ConexionBD;
import Juegos.Bacarat;
import Juegos.BlackJack;
import View.Panel_Inicio;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Bacarat bacarat = new Bacarat();
//        bacarat.jugarBacarat();

        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido al juego de Blackjack!");
        BlackJack.jugarBlackjack(scanner);
        System.out.println("Gracias por jugar al Blackjack. ¡Hasta luego!");
//        TragaPerras tragaperras = new TragaPerras();
//        tragaperras.jugarTragaperras(tragaperras);
//        ConexionBD conexionBD = new ConexionBD();
//        conexionBD.conectar();
        /**
         * Juego Ventana
         */
//        SwingUtilities.invokeLater(Panel_Inicio::new);


    }

}