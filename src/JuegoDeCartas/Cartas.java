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

    public void setPalo(String suit) {
        this.palo = suit;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String value) {
        this.valor = value;
    }
    public int getValorNumerico() {
        return valorNumerico;
    }

    public void setValorNumerico(int valorNumerico) {
        this.valorNumerico = valorNumerico;
    }
    @Override
    public String toString() {
        return "Cartas{" +
                "palo='" + palo + '\'' +
                ", valor='" + valor + '\'' +
                ", valorNumerico=" + valorNumerico +
                '}';
    }
}
