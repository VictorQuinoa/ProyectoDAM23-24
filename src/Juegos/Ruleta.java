package Juegos;

import javax.swing.*;

public class Ruleta{

    private int numero;
    String[] colores = {"Rojo","Negro","Verde"};
    String[] paridad = {"Par","Impar"};
    String[] valores = new String[37];
    String[][] tercios = new String[3][12];
    private int apuesta;


    public Ruleta() {
        for (int i = 0; i < valores.length; i++) {
            valores[i] = String.valueOf(i);
        }
        for (int i = 0; i < tercios.length; i++) {
            for (int j = 0; j < tercios[i].length; j++) {
                tercios[i][j] = String.valueOf(i * 12 + j + 1);
            }
        }
    }

    public void girarRuleta(){
        this.numero = (int) (Math.random() * 37);
        System.out.println("El numero ganador es: " + this.numero);
    }

    public void apuestaNumero(int numero){
        if (this.numero == numero){
            JOptionPane.showMessageDialog(null, "Felicidades, has ganado");
            //cartera= apuesta *36;
        }else{
            JOptionPane.showMessageDialog(null, "Lo siento, has perdido");
        }
    }

    public void apuestaColor(String color){
        if (this.numero % 2 == 0){
            if (color.equals("Rojo")){
                JOptionPane.showMessageDialog(null, "Felicidades, has ganado");
            }else{
                JOptionPane.showMessageDialog(null, "Lo siento, has perdido");
            }
        }else{
            if (color.equals("Negro")){
                JOptionPane.showMessageDialog(null, "Felicidades, has ganado");
            }else{
                JOptionPane.showMessageDialog(null, "Lo siento, has perdido");
            }
        }
    }

    public void apuestaTercio(int tercio){
        if (tercio == 1){
            for (int i = 0; i <= 12; i++) {
                if (this.numero == i){
                    JOptionPane.showMessageDialog(null, "Felicidades, has ganado");
                    return;
                }
            }
        }else if (tercio == 2){
            for (int i = 12; i <= 24; i++) {
                if (this.numero == i){
                    JOptionPane.showMessageDialog(null, "Felicidades, has ganado");
                    return;
                }
            }
        }else{
            for (int i = 24; i < 37; i++) {
                if (this.numero == i){
                    JOptionPane.showMessageDialog(null, "Felicidades, has ganado");

                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Lo siento, has perdido");
    }
}






