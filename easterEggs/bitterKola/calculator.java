import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner dataCollector = new Scanner(System.in);

        System.out.print("input price: ");
        double price = dataCollector.nextDouble();

        System.out.print("input percentage: ");
        double discountPercent = dataCollector.nextDouble();

        double discountAmount = (discountPercent / 100) * price;

        double finalPrice = price - discountAmount;

        System.out.printf("Discount Amount: %.2f\n", discountAmount);
        System.out.printf("Final Price: %.2f\n", finalPrice);

    }
}
