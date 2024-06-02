import Model.JuegoDeCartas.Baraja;
import Model.JuegoDeCartas.Cartas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BarajaTest {

    @Test
    public void testTomarCarta() {
        // Creamos una instancia real de Baraja
        Baraja baraja = new Baraja();

        // Llamamos al método tomarCarta() para obtener una carta
        Cartas carta = baraja.tomarCarta();

        // Verificamos que la carta no sea nula
        assertNotNull(carta);
    }

    @Test
    public void testDealCard() {
        // Creamos una instancia real de Baraja
        Baraja baraja = new Baraja();

        // Llamamos al método dealCard() para obtener una carta
        Cartas carta = baraja.dealCard();

        // Verificamos que la carta no sea nula
        assertNotNull(carta);
    }
}
