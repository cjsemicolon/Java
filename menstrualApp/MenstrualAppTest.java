import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MenstrualAppTest {

    @Test
    void testOvulationDay() {
        assertEquals(14, MenstrualApp.calculateOvulationDay(28));
    }

    @Test
    void testFertilePeriodStart() {
        assertEquals(9, MenstrualApp.calculateFertilePeriodStart(14));
    }

    @Test
    void testFertilePeriodEnd() {
        assertEquals(15, MenstrualApp.calculateFertilePeriodEnd(14));
    }

    @Test
    void testSafePeriodBefore() {
        assertEquals(8, MenstrualApp.calculateSafePeriodBefore(9));
    }

    @Test
    void testSafePeriodAfter() {
        assertEquals(16, MenstrualApp.calculateSafePeriodAfter(15));
    }
}
