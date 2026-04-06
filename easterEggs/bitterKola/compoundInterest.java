import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {

        Scanner dataCollector = new Scanner(System.in);

        System.out.print("Enter initial bank balance: ");
        double balance = dataCollector.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double rate = dataCollector.nextDouble();

        rate = rate / 100;

        double year1 = balance * (1 + rate);
        double year2 = balance * (1 + rate) * (1 + rate);
        double year3 = balance * (1 + rate) * (1 + rate) * (1 + rate);

        System.out.printf("Balance after 1 year: %.2f\n", year1);
        System.out.printf("Balance after 2 years: %.2f\n", year2);
        System.out.printf("Balance after 3 years: %.2f\n", year3);

    }
}
