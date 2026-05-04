import java.util.Scanner;

public class Pattern {

    public static void displayPattern(int numberOfRows) {

        for (int currentRow = 1; currentRow <= numberOfRows; currentRow++) {

            for (int currentValue = currentRow; currentValue >= 1; currentValue--) {
                System.out.print(currentValue + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numberOfRows = input.nextInt();

        displayPattern(numberOfRows);
    }
}
