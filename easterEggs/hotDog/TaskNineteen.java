import java.util.Scanner;

public class TaskNineteen{
    public static void main(String[] args) {
        Scanner dataCollector = new Scanner(System.in);

        System.out.print("Input investment amount: ");
        double investmentAmount = dataCollector.nextDouble();

        System.out.print("Input annual interest rate: ");
        double annualInterestRate = dataCollector.nextDouble();

        System.out.print("Input number of years: ");
        int numberOfYears = dataCollector.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200;

        double futureInvestmentValue = investmentAmount *
                Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

        System.out.printf("Future investment value: %f", futureInvestmentValue);
    }
}

