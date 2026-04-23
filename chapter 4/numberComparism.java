import java.util.Scanner;

public class numberComparism {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        int firstNumber = inputCollector.nextInt();
        int secondNumber = inputCollector.nextInt();

        if (firstNumber == secondNumber)
            System.out.println(0);
        else if (firstNumber > secondNumber)
            System.out.println(1);
        else
            System.out.println(-1);
    }
}
