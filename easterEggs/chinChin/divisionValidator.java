import java.util.Scanner;

public class divisionValidator {
    public static void main(String[] args) {

        Scanner integerCollector = new Scanner(System.in);

        System.out.print("Enter m: ");
        double m = integerCollector.nextInt();

        System.out.print("Enter n: ");
        double n = integerCollector.nextInt();

        if (n == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            double result = m / n;
            System.out.println("Result = " + result);
        }
    }
}
