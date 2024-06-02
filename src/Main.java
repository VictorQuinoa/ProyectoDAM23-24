import Model.JuegoDeCartas.Baraja;
import Model.Juegos.Bacarat;
import Model.Juegos.BlackJack;
import View.Juegos.View_Bacarat;
import View.Juegos.View_BlackJack;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        SwingUtilities.invokeLater(View_Bacarat::new);
        SwingUtilities.invokeLater(View_BlackJack::new);

        //Bacarat bacarat = new Bacarat(new Baraja());
       // bacarat.jugarBacarat(new Scanner(System.in));
//        Scanner scanner = new Scanner(System.in);
//        Bacarat bacarat = new Bacarat(new Baraja());
//        bacarat.jugarBacarat(scanner);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("¡Bienvenido al juego de Blackjack!");
//        System.out.println("Gracias por jugar al Blackjack. ¡Hasta luego!");
//        TragaPerras tragaperras = new TragaPerras();
//        tragaperras.jugarTragaperras(tragaperras);
//        ConexionBD conexionBD = new ConexionBD();
//        conexionBD.conectar();
//        SwingUtilities.invokeLater(View_Black_Bacarat::new);
    }

}