package JuegoDeCartas;

public class Cartas {
    private String palo;
    private String valor;
    private int valorNumerico;

    public Cartas(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

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

}
