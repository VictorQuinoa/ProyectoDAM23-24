package Bases;

import Juegos.Poker;

import java.util.HashMap;
import java.util.Scanner;



public class Economia{

    Scanner sc = new Scanner(System.in);
    private int pago = 0;
    private int carteraJugador = sc.nextInt();
    private int carteraComputadora = 10000;

    public int getCarteraJugador() {
        return carteraJugador;
    }

    public int getCarteraComputadora() {
        return carteraComputadora;
    }
}
