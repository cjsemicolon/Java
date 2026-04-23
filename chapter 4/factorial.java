import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        int number= inputCollector.nextInt();
        int factorial = 1;

        for (int counter = 1; counter <= number; counter++) {
            factorial *= counter;
        }

        System.out.println(factorial);
    }
}
