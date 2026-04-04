import java.util.Scanner;

public class TaskEighteen {
    public static void main(String[] args) {
        Scanner dataCollector = new Scanner(System.in);

        System.out.print("Input the balance: ");
        double balance = dataCollector.nextDouble();

        System.out.print("input annual interest rate: ");
        double annualInterestRate = dataCollector.nextDouble();

        double interest = balance * (annualInterestRate / 1200);

        System.out.printf("The interest for the next month is %.2f",interest);
    }
}


