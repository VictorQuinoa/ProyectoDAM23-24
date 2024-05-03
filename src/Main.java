import Juegos.Bacarat;

public class Main {
    public static void main(String[] args) {
        Bacarat bacarat = new Bacarat();
        String resultado = bacarat.jugar();
        System.out.println(resultado);
    }
}