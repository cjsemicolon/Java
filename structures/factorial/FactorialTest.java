import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void testFactorial() {
        assertEquals(1, Factorial.factorial(0));
        assertEquals(1, Factorial.factorial(1));
        assertEquals(120, Factorial.factorial(5));
        assertEquals(720, Factorial.factorial(6));
    }
}
