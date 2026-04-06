import java.util.Scanner;

public class rangeChecker {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = inputNumber.nextInt();

        if (number > 10 && number < 100) {
            System.out.println(number + " is between 10 and 100.");
        } else {
            System.out.println(number + " is NOT between 10 and 100.");
        }

    }
}
