import View.Juegos.View_Black_Bacarat;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        Bacarat bacarat = new Bacarat();
//        bacarat.jugarBacarat();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("¡Bienvenido al juego de Blackjack!");
//        BlackJack.jugarBlackjack(scanner);
//        System.out.println("Gracias por jugar al Blackjack. ¡Hasta luego!");
//        TragaPerras tragaperras = new TragaPerras();
//        tragaperras.jugarTragaperras(tragaperras);
//        ConexionBD conexionBD = new ConexionBD();
//        conexionBD.conectar();
        SwingUtilities.invokeLater(View_Black_Bacarat::new);
    }

}