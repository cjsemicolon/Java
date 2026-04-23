import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number");
        int number = inputCollector.nextInt();

        while (number < 10000 || number > 99999) {
            System.out.println("Invalid");
            number = inputCollector.nextInt();
        }

        int original = number;
        int reversed = 0;

        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }

        if (original == reversed)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
