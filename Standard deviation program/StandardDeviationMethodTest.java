import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationMethodTest {

    @Test
    public void testThatUserInputIsCollectedAndStoredInAnArray(){

        int[] userInput = {1,2,3,4,5};

        int[] result = StandardDeviationMethod.storeNumbers();

        int[] expected = {1,2,3,4,5};

        assertArrayEquals(expected, result);

    }

    @Test
    public void testThatSUmOfIntegersInTheArrayWorks() {

        int[] userInput = {1,2,3,4,5};
    
        int result = StandardDeviationMethod.sumOfArrayElements(userInput);

        int expected = 15;

        assertEquals(expected, result);

    }

    @Test
    public void testThatMeanWorks() {
    
        int[] userInput = {1,2,3,4,5};

        double result = StandardDeviationMethod.meanOfArrayNumbers(userInput);

        double expected = 3;

        assertEquals(expected, result);


    }


    @Test
    public void testThatVarianceWorks() {
    
        int[] userInput = {1,2,3,4,5};

        double mean = 3;

        double result = StandardDeviationMethod.varianceOfNumbers(userInput, mean);

        double expected = 2;

        assertEquals(expected, result);

    }

    @Test
    public void testThatStandardDiviationWorks() {
    
        int[] userInput = {1,2,3,4,5};

        double variance = 2;

        double result = StandardDeviationMethod.standardDeviationOfNumbers(variance);

        double expected = 1.4142135623730951;

        assertEquals(expected, result);    

    }


}
