import java.util.Scanner;

public class countDown {
    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int num = inputCollector.nextInt();

        while (num >= 1) {
            System.out.println(num);
            num--;
        }

        System.out.println("Blast off!");

    }
}
