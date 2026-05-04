import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DigitSumTest {

    @Test
    public void testSumOfDigits() {
        assertEquals(6, DigitSum.sumOfDigits(123));
        assertEquals(0, DigitSum.sumOfDigits(0));
        assertEquals(27, DigitSum.sumOfDigits(999));
        assertEquals(1, DigitSum.sumOfDigits(1000));
    }
}
