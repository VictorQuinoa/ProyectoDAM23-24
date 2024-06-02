package Model.JuegoDeCartas;

public class Cartas {
    private String palo;
    private String valor;
    private int valorNumerico;
    private String imagePath;

    public Cartas(String palo, String valor,int valorNumerico, String imagePath) {
        this.palo = palo;
        this.valor = valor;
        this.valorNumerico=valorNumerico;
        this.imagePath = imagePath;
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
     * Método para obtener la ruta de imagen de una carta
     * @return ruta de la imagen
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Método para poner el path de una imagen
     * @param imagePath ruta de la imagen
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    /**
     *
     * @param palo dado en el for cuando va pasando los palo para darle el palo al path
     * @param valor valor que tiene el nombre del archivo de la imagen para
     * @return path deseado para asociarlo en el hashMap
     */
    private String generacionDePaths(String palo, int valor){
        String pathBase = "/Decorativos/Imagenes/Cartas/";
        switch (palo){
            case "Corazones":
                return pathBase + "corazones/" + valor + "corazon.png";
            case "Diamantes":
                return pathBase + "diamantes/" + valor + "diamante.png";
            case "Treboles":
                return pathBase + "trebol/" + valor + "trebol.png";
            case "Picas":
                return pathBase + "picas/" + valor + "pica.png";
            default:
                return "";
        }
    }

    public String getImagePaths(){
        return generacionDePaths(this.palo, this.valorNumerico);
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
