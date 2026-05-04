import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LargestNumberTest {

    @Test
    public void testMax() {
        assertEquals(3, LargestNumber.max(1, 2, 3));
        assertEquals(3, LargestNumber.max(3, 2, 1));
        assertEquals(2, LargestNumber.max(2, 2, 2));
        assertEquals(-1, LargestNumber.max(-1, -2, -3));
    }
}
