import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class TaskFourTest {

    @Test
    public void testMixedIndices() {
        int[] input = {10, 5, 30, 3, 50}; 
        int [] actual =  {10, 30, 50}; 
        int[] expected = TaskFour.number(input); 
        assertArrayEquals(actual , expected);
    }
}
