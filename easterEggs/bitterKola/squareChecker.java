import java.util.Scanner;

public class SquareCheck {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);

        System.out.print("input a positive integer: ");
        int number = inputNumber.nextInt();

            double sqrt = Math.sqrt(number);

            if (sqrt == (int) sqrt) {
                System.out.println(number + " is a perfect square.");
            } else {
                System.out.println(number + " is NOT a perfect square.");
            }
        }

    }
}
