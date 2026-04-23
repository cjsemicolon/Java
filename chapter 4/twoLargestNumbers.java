import java.util.Scanner;

public class twoLargestNumbers {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int counter = 1; counter <= 10; counter++) {
            int number = inputCollector.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > second) {
                second = number;
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second largest: " + second);
    }
}
