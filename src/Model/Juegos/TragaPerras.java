package Model.Juegos;

import java.util.Random;

public class TragaPerras {
    private String[] simbolos = {"Cereza", "Campana", "Limón", "Siete", "Diamante", "Moai", "Uva", "Pica"};

    public TragaPerras() {
    }

    /**
     * Metodo para girar la Tragaperras
     * @return Array con el resultado de los símbolos
     */
    public String[] girar() {
        Random rand = new Random();
        String[] resultado = {simbolos[rand.nextInt(simbolos.length)], simbolos[rand.nextInt(simbolos.length)], simbolos[rand.nextInt(simbolos.length)]};
        return resultado;
    }

    /**
     * Verifica si los tres símbolos son iguales.
     * @param resultado Array de símbolos resultantes del giro
     * @return true si los tres símbolos son iguales, false en caso contrario
     */
    public boolean verificarResultado(String[] resultado) {
        return resultado[0].equals(resultado[1]) && resultado[0].equals(resultado[2]);
    }
}