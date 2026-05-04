import org.junit.Test;
import static org.junit.Assert.*;

public class EvenTest {

    @Test
    public void testEven() {
        assertTrue(Even.isEven(4));
        assertFalse(Even.isEven(7));
        assertTrue(Even.isEven(0));
        assertTrue(Even.isEven(-2));
    }
}
