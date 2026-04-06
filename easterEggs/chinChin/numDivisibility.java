import java.util.Scanner;

public class numDivisibility {
    public static void main(String[] args) {

        Scanner integerCollector = new Scanner(System.in);

        System.out.print("input integer: ");
        int number = integerCollector.nextInt();

        if (number % 4 == 0 && number % 5 == 0) {
            System.out.println("Divisible by both 4 and 5: true");
        } else {
            System.out.println("Divisible by both 4 and 5: false");
        }

        if (number % 4 == 0 || number % 5 == 0) {
            System.out.println("Divisible by 4 or 5: true");
        } else {
            System.out.println("Divisible by 4 or 5: false");
        }

        if ((number % 4 == 0 && number % 5 != 0) ||
            (number % 4 != 0 && number % 5 == 0)) {
            System.out.println("Divisible by 4 or 5 but not both: true");
        } else {
            System.out.println("Divisible by 4 or 5 but not both: false");
        }

    }
}
