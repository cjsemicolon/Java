import java.util.Scanner;

public class doubleDetails {
    public static void main(String[] args) {

        Scanner doubleCollector = new Scanner(System.in);

        System.out.println("Give the first number");
        double num1 = doubleCollector.nextDouble();

        System.out.println("Give the second number");
        double num2 = doubleCollector.nextDouble();

        if (num1 > num2) {
            System.out.println("Larger value = " + num1);
            System.out.println("Smaller value = " + num2);
        } else {
            System.out.println("Larger value = " + num2);
            System.out.println("Smaller value = " + num1);
        }

        double sum = num1 + num2;

        System.out.println("Sum = " + sum);

        double difference = num1 - num2;

        System.out.println("Difference = " + difference);

        double product = num1 * num2;        

        System.out.println("Product = " + product);

        if (num2 != 0) {
            System.out.println("Quotient = " + (num1 / num2));
        } else {
            System.out.println("Quotient: Cannot divide by zero");
        }

    }
}
