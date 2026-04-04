import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner sideCollector = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double side1 = sideCollector.nextDouble();

        System.out.print("Enter side 2: ");
        double side2 = sideCollector.nextDouble();

        System.out.print("Enter side 3: ");
        double side3 = sideCollector.nextDouble();

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            System.out.println("The sides form a valid triangle.");

            if (side1 == side2 && side2 == side3) {
                System.out.println("It is an equilateral triangle.");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("It is an isosceles triangle.");
            } else {
                System.out.println("It is a scalene triangle.");
            }
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }

    }
}
