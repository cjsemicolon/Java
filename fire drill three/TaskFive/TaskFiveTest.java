import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class TaskFiveTest {

    @Test
    public void testMixedIndices() {
        int[] input = {10, 5, 30, 3, 50}; 
        int [] actual =  {5, 3}; 
        int[] expected = TaskFive.number(input); 
        assertArrayEquals(actual , expected);
    }
}
