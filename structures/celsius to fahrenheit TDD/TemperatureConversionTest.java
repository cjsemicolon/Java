import org.junit.Test;
import static org.junit.Assert.*;

public class TemperatureConversionTest {

    @Test
    public void testZero() {
        assertEquals(32.0, TemperatureConversion.celsiusToFahrenheit(0), 0.001);
    }

    @Test
    public void testHundred() {
        assertEquals(212.0, TemperatureConversion.celsiusToFahrenheit(100), 0.001);
    }

    @Test
    public void testMinusForty() {
        assertEquals(-40.0, TemperatureConversion.celsiusToFahrenheit(-40), 0.001);
    }
}
