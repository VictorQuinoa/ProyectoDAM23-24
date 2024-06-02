import Model.JuegoDeCartas.Baraja;
import Model.JuegoDeCartas.Cartas;
import Model.Juegos.Bacarat;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BacaratTest {
    private Bacarat bacarat;
    private Baraja baraja;

    /**
     * Este método se ejecuta antes de cada prueba.
     * Se utiliza para configurar cualquier objeto que se necesite en las pruebas.
     */
    @Before
    public void setUp() {
        baraja = new Baraja();
        bacarat = new Bacarat(baraja);
    }

    /**
     * Esta prueba verifica que el método darCartaJugador() de la clase Bacarat
     * está funcionando correctamente. Se espera que después de llamar a este método,
     * la carta del jugador no sea nula.
     */
    @Test
    public void testDarCartaJugador() {
        bacarat.darCartaJugador();
        Cartas carta = bacarat.getCartaJugador();
        assertNotNull(carta);
    }

    /**
     * Esta prueba verifica que el método darCartaCrupier() de la clase Bacarat
     * está funcionando correctamente. Se espera que después de llamar a este método,
     * la carta de la banca no sea nula.
     */
    @Test
    public void testDarCartaCrupier() {
        bacarat.darCartaCrupier();
        Cartas carta = bacarat.getCartaBanca();
        assertNotNull(carta);
    }

    /**
     * Esta prueba verifica que el método valorCarta() de la clase Bacarat
     * está funcionando correctamente. Se crea una carta con un valor conocido
     * y se verifica que el método valorCarta() devuelva el valor correcto.
     */
    @Test
    public void testValorCarta() {
        Cartas carta = new Cartas("Hearts", "Ace", 1, "");
        int valor =  bacarat.valorCarta(carta);
        assertEquals(1, valor);
    }
}