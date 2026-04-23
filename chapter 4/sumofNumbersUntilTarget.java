import java.util.Scanner;

public class sumofNumbersUntilTarget {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        int target = inputCollector.nextInt();
        int sum = 0;

        while (sum < target) {
            int number = inputCollector.nextInt();
            sum += number;
        }

        System.out.println("Final sum: " + sum);
    }
}
