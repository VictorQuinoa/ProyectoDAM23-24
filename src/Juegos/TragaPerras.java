package Juegos;
import java.util.Random;
import java.util.Scanner;

public class TragaPerras {
    private String[] simbolos = {"Cereza", "Campana", "Bar", "Siete", "Diamante"};
    private int apuesta;
    public int saldo;

    public TragaPerras() {
        saldo = 1000;
    }

    public void girar(int apuesta) {
        this.apuesta = apuesta;
        if (this.apuesta > saldo) {
            System.out.println("No tienes suficiente saldo para esa apuesta.");
            return;
        }

        saldo -= this.apuesta;
        Random rand = new Random();
        String[] resultado = {simbolos[rand.nextInt(simbolos.length)], simbolos[rand.nextInt(simbolos.length)], simbolos[rand.nextInt(simbolos.length)]};
        System.out.println("Los símbolos son: " + resultado[0] + ", " + resultado[1] + ", " + resultado[2]);

        if (resultado[0].equals(resultado[1]) && resultado[0].equals(resultado[2])) {
            saldo += apuesta * 10;
            System.out.println("¡Ganaste! Has ganado 10 veces tu apuesta.");
        } else if (resultado[0].equals(resultado[1]) || resultado[0].equals(resultado[2]) || resultado[1].equals(resultado[2])) {
            saldo += apuesta * 5;
            System.out.println("¡Ganaste! Has ganado 5 veces tu apuesta.");
        } else {
            System.out.println("No hubo coincidencias. Perdiste tu apuesta.");
        }
        System.out.println("Saldo actual: " + saldo);
    }

    /**
     * Metodo para jugar a la TragaPerras
     * @param tragaperras vuelta a empezar
     */
    public void jugar(TragaPerras tragaperras) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSaldo actual: " + tragaperras.saldo);
            System.out.print("Ingrese su apuesta (o 0 para salir): ");
            int apuesta = scanner.nextInt();
            if (apuesta == 0) {
                System.out.println("¡Gracias por jugar!");
                break;
            }
            tragaperras.girar(apuesta);
        }
        scanner.close();
    }
}