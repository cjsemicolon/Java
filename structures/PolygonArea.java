import java.util.Scanner;

public class PolygonArea {

    public static double area(int numberOfSides, double sideLength) {
        return (numberOfSides * Math.pow(sideLength, 2)) /
                (4 * Math.tan(Math.PI / numberOfSides));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of sides: ");
        int numberOfSides = input.nextInt();

        System.out.print("Enter side length: ");
        double sideLength = input.nextDouble();

        double polygonArea = area(numberOfSides, sideLength);

        System.out.println("Area of polygon: " + polygonArea);
    }
}
