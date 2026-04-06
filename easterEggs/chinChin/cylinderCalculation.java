import java.util.Scanner;

public class cylinderCalculation {
    public static void main(String[] args) {

        Scanner dataCollector = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = dataCollector.nextDouble();

        System.out.print("Enter the height: ");
        double height = dataCollector.nextDouble();

        // Use 3.14 for pi
        double surfaceArea = 2 * 3.14 * radius * radius + 2 * 3.14 * radius * height;
        double volume = 3.14 * radius * radius * height;

        System.out.println("Surface Area = " + surfaceArea);
        System.out.println("Volume = " + volume);

    }
}
