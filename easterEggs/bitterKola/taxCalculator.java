import java.util.Scanner;

public class taxCalculator {
    public static void main(String[] args) {

        Scanner taxData = new Scanner(System.in);

        System.out.print("Enter monthly salary : ");
        double monthlySalary = taxData.nextDouble();

        double annualSalary = monthlySalary * 12;
        double tax = 0;

        if (annualSalary <= 300000) {
            tax = 0;
        } else if (annualSalary <= 600000) {
            tax = (annualSalary - 300000) * 0.15;
        } else {
            tax = (300000 * 0) + (300000 * 0.15) + ((annualSalary - 600000) * 0.25);
        }

        System.out.printf("Annual tax owed: %.2f\n", tax);
    }
}
