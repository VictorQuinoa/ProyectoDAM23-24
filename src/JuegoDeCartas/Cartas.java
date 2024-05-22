package JuegoDeCartas;

public class Cartas {
    private String palo;
    private String valor;
    private int valorNumerico;

    public Cartas(String palo, String valor,int valorNumerico) {
        this.palo = palo;
        this.valor = valor;
        this.valorNumerico=valorNumerico;

    }

    /**
     * Metodo que devuelve el palo de la carta
     * @return palo
     */
    public String getPalo() {
        return palo;
    }
    /**
     * Metodo que asigna el palo de la carta
     * @param suit palo
     */
    public void setPalo(String suit) {
        this.palo = suit;
    }

    /**
     * Metodo que devuelve el valor de la carta
     * @return valor
     */
    public String getValor() {
        return valor;
    }
    /**
     * Metodo que asigna el valor de la carta
     * @param value valor
     */
    public void setValor(String value) {
        this.valor = value;
    }
    /**
     * Metodo que devuelve el valor numerico de la carta
     * @return valorNumerico
     */
    public int getValorNumerico() {
        return valorNumerico;
    }
    /**
     * Metodo que asigna el valor numerico de la carta
     * @param valorNumerico valor numerico
     */
    public void setValorNumerico(int valorNumerico) {
        this.valorNumerico = valorNumerico;
    }
    /**
     * Metodo que devuelve la carta
     * @return carta
     */
    @Override
    public String toString() {
        return "Cartas{" +
                "palo='" + palo + '\'' +
                ", valor='" + valor + '\'' +
                ", valorNumerico=" + valorNumerico +
                '}';
    }
}
