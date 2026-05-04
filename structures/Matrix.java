import java.util.Random;
import java.util.Scanner;

public class Matrix {

    public static void printMatrix(int matrixSize) {

        Random randomGenerator = new Random();

        for (int currentRow = 0; currentRow < matrixSize; currentRow++) {

            for (int currentColumn = 0; currentColumn < matrixSize; currentColumn++) {

                int randomValue = randomGenerator.nextInt(2);
                System.out.print(randomValue + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter matrix size (n): ");
        int matrixSize = input.nextInt();

        printMatrix(matrixSize);
    }
}
