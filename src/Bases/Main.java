package Bases;

import Juegos.JuegoPoker;
import Juegos.Ruleta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Ruleta rul = new Ruleta();
        JuegoPoker jp = new JuegoPoker();
    // rul.girarRuleta();
     //rul.apuestaColor("Rojo");
        jp.jugarPoker();
        }
    }
