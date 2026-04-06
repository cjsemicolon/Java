import java.util.Scanner;

public class numberCalculations {
    public static void main(String[] args) {

        Scanner numberCollector = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = numberCollector.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = numberCollector.nextInt();

        if (num1 > 0 && num2 > 0) {
            int sum = num1 + num2;
            System.out.println("Sum: " + sum);

        } else if (num1 < 0 && num2 < 0) {
            int product = num1 * num2;
            System.out.println("Product: " + product);

        } else {
            int difference;

            if (num1 > num2) {
                difference = num1 - num2;
            } else {
                difference = num2 - num1;
            }

            System.out.println("Difference: " + difference);
        }

    }
}
