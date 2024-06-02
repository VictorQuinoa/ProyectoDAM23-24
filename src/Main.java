import Model.JuegoDeCartas.Baraja;
import Model.Juegos.Bacarat;
import View.Juegos.View_Bacarat;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(View_Bacarat::new);
        //Bacarat bacarat = new Bacarat(new Baraja());
       // bacarat.jugarBacarat(new Scanner(System.in));

    }

}