import java.util.Scanner;

public class TaskTwentyFour {
    public static void main(String[] args) {
        Scanner dataCollector = new Scanner(System.in);

        System.out.print("input exchange rate from USD to RMB: ");
        double exchangeRate = dataCollector.nextDouble();

        System.out.print("input 0 to convert from USD to RMB or 1 to convert from RMB to USD: ");
        int choice = dataCollector.nextInt();

        if (choice == 0) {
            System.out.print("input amount in USD: ");
            double usd = dataCollector.nextDouble();
            double rmb = usd * exchangeRate;
            System.out.println("$" + usd + " is " + rmb + " RMB.");
        } else if (choice == 1) {
            System.out.print("input amount in RMB: ");
            double rmb = dataCollector.nextDouble();
            double usd = rmb / exchangeRate;
            System.out.println(rmb + " RMB is $" + usd + ".");
        } else {
            System.out.println("Error: invalid conversion code.");
        }
    }
}
