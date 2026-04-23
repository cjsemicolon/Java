import java.util.Scanner;

public class taxCalculator {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        for (int count = 1; count <= 3; count++) {
            System.out.print("Enter name: ");
            String name = inputCollector.next();

            System.out.print("Enter earnings: ");
            double income = inputCollector.nextDouble();

            double tax;
            if (income <= 30000)
                tax = income * 0.15;
            else
                tax = 30000 * 0.15 + (income - 30000) * 0.20;

            System.out.println(name + " tax: " + tax);
        }
    }
}
