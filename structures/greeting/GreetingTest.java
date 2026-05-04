import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GreetingTest {

    @Test
    public void testGreet() {
        assertEquals("Hello, Alice!", Greeting.greet("Alice"));
        assertEquals("Hello, World!", Greeting.greet("World"));
        assertEquals("Hello, !", Greeting.greet(""));
    }
}
