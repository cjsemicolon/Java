import java.util.Scanner;

public class TaskTwentyFive {
    public static void main(String[] args) {
        Scanner dataCollector = new Scanner(System.in);

        System.out.print("Input weight of package 1 (in kg): ");
        double weight1 = dataCollector.nextDouble();

        System.out.print("Input price of package 1: ");
        double price1 = dataCollector.nextDouble();

        System.out.print("Input weight of package 2 (in kg): ");
        double weight2 = dataCollector.nextDouble();

        System.out.print("Input price of package 2: ");
        double price2 = dataCollector.nextDouble();

        double unitPrice1 = price1 / weight1;
        double unitPrice2 = price2 / weight2;

        if (unitPrice1 < unitPrice2) {
            System.out.println("Package 1 has the better price per kg.");
        } else if (unitPrice2 < unitPrice1) {
            System.out.println("Package 2 has the better price per kg.");
        } else {
            System.out.println("Both packages have the same price per kg.");
        }
        
    }
}
