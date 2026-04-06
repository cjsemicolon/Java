import java.util.Scanner;

public class divisionResponse{
    public static void main(String[] args) {

        Scanner integerCollector = new Scanner(System.in);

        System.out.print("input integer: ");
        int num = integerCollector.nextInt();

        // Check conditions
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(num);
        }

    }
}
