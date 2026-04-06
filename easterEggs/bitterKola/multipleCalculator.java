import java.util.Scanner;

public class multipleCalculator {
    public static void main(String[] args) {

        Scanner integerCollector = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = integerCollector.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = integerCollector.nextInt();

        // Check if first is a multiple of second
        if (num1 % num2 == 0) {
            System.out.println(num1 + " is a multiple of " + num2);
        } 
        else {
            System.out.println(num1 + " is NOT a multiple of " + num2);
        }

    }
}
