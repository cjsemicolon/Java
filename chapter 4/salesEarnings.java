import java.util.Scanner;

public class salesEarnings {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        double totalSales = 0;
        int item;

        System.out.print("Enter item number (1-4, 0 to stop): ");
        item = inputCollector.nextInt();

        while (item != 0) {
            switch (item) {
                case 1: totalSales += 239.99; break;
                case 2: totalSales += 129.75; break;
                case 3: totalSales += 99.95; break;
                case 4: totalSales += 350.89; break;
            }

            System.out.print("Enter item number (1-4, 0 to stop): ");
            item = inputCollector.nextInt();
        }

        double earnings = 200 + 0.09 * totalSales;
        System.out.println("Earnings: $" + earnings);
    }
}
