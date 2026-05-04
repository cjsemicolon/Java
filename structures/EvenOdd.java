import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        int even = 0, odd = 0;

        for (int counter = 0; counter < 10; counter++) {

            System.out.print("Enter Number: ");            
            int number = inputCollector.nextInt();

            if (number % 2 == 0) even++;
            else odd++;
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
