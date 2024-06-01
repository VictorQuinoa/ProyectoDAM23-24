package Model.Juegos;

import javax.swing.*;

public class Ruleta {

    private int numero;
    private String color;
    private final String[] colores = {"Rojo", "Negro", "Verde"};
    private String[] valores = new String[37];

    public Ruleta() {
        for (int i = 0; i < valores.length; i++) {
            valores[i] = String.valueOf(i);
        }
    }

    public void girarRuleta() {
        this.numero = (int) (Math.random() * 37);
        determinarColor();
        //System.out.println("El numero ganador es: " + this.numero);
        //System.out.println("El color ganador es: " + this.color);
    }

    private void determinarColor() {
        if (this.numero == 0) {
            this.color = colores[2];
        } else if (this.numero % 2 == 0) {
            this.color = colores[1];
        } else {
            this.color = colores[0];
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
