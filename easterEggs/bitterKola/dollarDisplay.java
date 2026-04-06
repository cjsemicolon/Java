import java.util.Scanner;

public class dollarDisplay {
    public static void main(String[] args) {

        Scanner inputAmount = new Scanner(System.in);

        System.out.print("input a dollar amount (1–10): ");
        int dollars = inputAmount.nextInt();

        if (dollars == 1) {
            System.out.println("One dollar");
        } else if (dollars == 2) {
            System.out.println("Two dollars");
        } else if (dollars == 3) {
            System.out.println("Three dollars");
        } else if (dollars == 4) {
            System.out.println("Four dollars");
        } else if (dollars == 5) {
            System.out.println("Five dollars");
        } else if (dollars == 6) {
            System.out.println("Six dollars");
        } else if (dollars == 7) {
            System.out.println("Seven dollars");
        } else if (dollars == 8) {
            System.out.println("Eight dollars");
        } else if (dollars == 9) {
            System.out.println("Nine dollars");
        } else if (dollars == 10) {
            System.out.println("Ten dollars");
        } else {
            System.out.println("Invalid amount. Enter a number between 1 and 10.");
        }

    }
}
