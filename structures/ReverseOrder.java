import java.util.Scanner;

public class ReverseOrder {

    public static void reverse(int number) {
        while (number != 0) {
            System.out.print(number % 10);
            number /= 10;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        reverse(num);
    }
}
