public class LargestNumber {

    public static int max(int firstNumber, int secondNumber, int thirdNumber) {
        int maxValue = firstNumber;

        if (secondNumber > maxValue) {
            maxValue = secondNumber;
        }
        if (thirdNumber > maxValue) {
            maxValue = thirdNumber;
        }

        return maxValue;
    }
}
