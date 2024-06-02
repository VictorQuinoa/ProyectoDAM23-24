import Model.JuegoDeCartas.Cartas;
import Model.Juegos.BlackJack;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlackJackTest {

    @Test
    public void testJugarBlackjack() {
        // Simular entrada del usuario
        ByteArrayInputStream in = new ByteArrayInputStream("n\n".getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);

        // Llamar al método jugarBlackjack()
        BlackJack.jugarBlackjack(scanner);

        // No hay un resultado específico para verificar ya que depende de la entrada del usuario,
        // pero este método debería ejecutarse sin lanzar excepciones para pasar el test .
    }

    @Test
    public void testValorMano() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        // Crear algunas cartas para probar
        Cartas carta1 = new Cartas("Ace", "Hearts", 1, "");
        Cartas carta2 = new Cartas("5", "Clubs", 5, "");
        Cartas carta3 = new Cartas("Queen", "Diamonds", 10, "");
        Cartas carta4 = new Cartas("10", "Spades", 10, "");

        // Crear una lista de cartas para probar
        List<Cartas> mano1 = Arrays.asList(carta1, carta2);
        List<Cartas> mano2 = Arrays.asList(carta1, carta3);
        List<Cartas> mano3 = Arrays.asList(carta1, carta4);

        // Acceder al método valorMano utilizando reflexión
        Method method = BlackJack.class.getDeclaredMethod("valorMano", List.class);
        method.setAccessible(true);

        // Verificar el valor de la mano
        assertEquals(16, method.invoke(null, mano1)); // 1 + 5 = 16
        assertEquals(21, method.invoke(null, mano2)); // 1 + 10 = 21
        assertEquals(21, method.invoke(null, mano3)); // 1 + 10 = 21
    }
}
