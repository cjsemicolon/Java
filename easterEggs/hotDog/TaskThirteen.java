import java.util.Scanner;

    public class TaskThirteen{

        public static void main(String[] args){

        Scanner savingsCollector = new Scanner(System.in);

        System.out.print("Enter monthly savings amount: ");
        double monthlySavings = savingsCollector.nextDouble();

        double currentBalance = 0;
        double monthlyRate = 0.003125;

        
        currentBalance = (currentBalance + monthlySavings) * (1 + monthlyRate);
        System.out.printf("Month 1: %.2f%n", currentBalance);

        
        currentBalance = (currentBalance + monthlySavings) * (1 + monthlyRate);
        System.out.printf("Month 2: %.2f%n", currentBalance);

       
        currentBalance = (currentBalance + monthlySavings) * (1 + monthlyRate);
        System.out.printf("Month 3: %.2f%n", currentBalance);

        
        currentBalance = (currentBalance+ monthlySavings) * (1 + monthlyRate);
        System.out.printf("Month 4: %.2f%n", currentBalance);

        
        currentBalance = (currentBalance + monthlySavings) * (1 + monthlyRate);
        System.out.printf("Month 5: %.2f%n", currentBalance);

        
        currentBalance = (currentBalance + monthlySavings) * (1 + monthlyRate);
        System.out.printf("Month 6: %.2f%n", currentBalance);
    }
}


