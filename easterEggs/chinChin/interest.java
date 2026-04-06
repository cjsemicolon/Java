import java.util.Scanner;

public class interest {
    public static void main(String[] args) {

        Scanner dataCollector = new Scanner(System.in);

        System.out.print("Input principal amount: ");
        double principal = dataCollector.nextDouble();

        System.out.print("Input annual interest rate (in %): ");
        double rate = dataCollector.nextDouble();

        System.out.print("input time in years: ");
        double time = dataCollector.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        double compoundInterest = principal * Math.pow(1 + rate / 100, time) - principal;

        System.out.printf("Simple Interest = %.2f%n", simpleInterest);
        System.out.printf("Compound Interest = %.2f%n", compoundInterest);

       }

}
