import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TaskSevenTest {

    @Test
    public void testSumOfEvenIndices() {
        int[] input = {10, 20, 30, 40, 50}; 
        int expected = 60;
        assertEquals(expected, TaskSeven.number(input));
    }

   
}
