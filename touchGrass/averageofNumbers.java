import java.util.Scanner;

public class averageofNumbers {
    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number (negative to stop): ");
            number = inputCollector.nextInt();

            if (number < 0) {
                break; 
            }

            sum += number;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of positive numbers: " + average);
        } else {
            System.out.println("No positive numbers were entered.");
        }

    }
}
