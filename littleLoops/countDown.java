import java.util.Scanner;

public class countDown {
    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = inputCollector.nextInt();

        while (num >= 1) {
            System.out.print(num + " ");
            num--;   
        }

        inputCollector.close();
    }
}
