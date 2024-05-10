import Juegos.Bacarat;
import Juegos.BlackJack;
import Juegos.TragaPerras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Bacarat bacarat = new Bacarat();
//        String resultado = bacarat.jugar();
//        System.out.println(resultado);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("¡Bienvenido al juego de Blackjack!");
//        BlackJack.jugarBlackjack(scanner);
//        System.out.println("Gracias por jugar al Blackjack. ¡Hasta luego!");
        TragaPerras tragaperras = new TragaPerras();
        tragaperras.jugarTragaperras(tragaperras);
    }

}