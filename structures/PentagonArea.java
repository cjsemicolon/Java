import java.util.Scanner;

public class PentagonArea {

    public static double area(double sideLength) {
        return (5 * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / 5));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side length: ");
        double sideLength = input.nextDouble();

        double pentagonArea = area(sideLength);

        System.out.println("Area of pentagon: " + pentagonArea);
    }
}
