import Model.JuegoDeCartas.Baraja;
import Model.JuegoDeCartas.Cartas;
import Model.Juegos.BlackJack;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BlackJackTest {
    private BlackJack blackJack;

    @Before
    public void setUp() {
        blackJack = new BlackJack(new Baraja());
    }

    @Test
    public void testValorCarta() {
        int valor = blackJack.valorCarta(new Cartas("Ace", "Spades",11,"path/to/image"));
        assertEquals(0, valor);

        valor = blackJack.valorCarta(new Cartas("2", "Spades",2,"path/to/image"));
        assertEquals(0, valor);

        valor = blackJack.valorCarta(new Cartas("King", "Spades",10,"path/to/image"));
        assertEquals(0, valor);
    }

    @Test
    public void testTomarCartaBanca() {
        blackJack.setValorBanca(16);
        assertTrue(blackJack.tomarCartaBanca());

        blackJack.setValorBanca(17);
        assertFalse(blackJack.tomarCartaBanca());
    }

    // Add more tests to cover all possible cases
}