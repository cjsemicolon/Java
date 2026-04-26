import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BackToSenderTest {

    @Test
    void testLessThan50Percent() {
        assertEquals(9000, BackToSender.calculatePay(25));
    }

    @Test
    void test50To59Percent() {
        assertEquals(16000, BackToSender.calculatePay(55));
    }

    @Test
    void test60To69Percent() {
        assertEquals(21250, BackToSender.calculatePay(65));
    }

    @Test
    void test70AndAbove() {
        assertEquals(45000, BackToSender.calculatePay(80));
    }
}
