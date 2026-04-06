import java.util.Scanner;

public class fractionCalculator {
    public static void main(String[] args) {

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter numerator of first fraction: ");
        double num1 = inputNum.nextDouble();

        System.out.print("Enter denominator of first fraction: ");
        double den1 = inputNum.nextDouble();

        // Read second fraction
        System.out.print("Enter numerator of second fraction: ");
        double num2 = inputNum.nextDouble();

        System.out.print("Enter denominator of second fraction: ");
        double den2 = inputNum.nextDouble();

        if (den1 == 0 || den2 == 0) {
            System.out.println("Error: Denominator cannot be zero.");
        } else {
           
            double fraction1 = num1 / den1;
            double fraction2 = num2 / den2;

         
            double sum = fraction1 + fraction2;
            System.out.println("Sum: " + sum);

            
            double difference = fraction1 - fraction2;
            System.out.println("Difference: " + difference);

           
            double product = fraction1 * fraction2;
            System.out.println("Product: " + product);

         
            double quotient = fraction1 / fraction2;
            System.out.println("Quotient: " + quotient);
        }

    }
}
