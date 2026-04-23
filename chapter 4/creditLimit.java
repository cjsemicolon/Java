import java.util.Scanner;

public class creditLimit {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter account number (-1 to quit): ");
        int acc = inputCollector.nextInt();

        while (acc != -1) {
            System.out.print("Enter beginning balance: ");
            int balance = inputCollector.nextInt();

            System.out.print("Enter charges: ");
            int charges = inputCollector.nextInt();

            System.out.print("Enter credits: ");
            int credits = inputCollector.nextInt();

            System.out.print("Enter credit limit: ");
            int limit = inputCollector.nextInt();

            int newBalance = balance + charges - credits;
            System.out.println("New balance: " + newBalance);

            if (newBalance > limit)
                System.out.println("Credit limit exceeded");

            System.out.print("\nEnter account number (-1 to quit): ");
            acc = inputCollector.nextInt();
        }
    }
}
