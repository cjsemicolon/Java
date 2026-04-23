import java.util.Scanner;

public class rightAngleTriangle {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        int userInput = inputCollector.nextInt();

        for (int row = 1; row <= userInput; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
