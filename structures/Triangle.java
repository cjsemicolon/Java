import java.util.Scanner;

public class Triangle {

    public static boolean isValid(double sideOne, double sideTwo, double sideThree) {
        return sideOne + sideTwo > sideThree &&
               sideOne + sideThree > sideTwo &&
               sideTwo + sideThree > sideOne;
    }

    public static double area(double sideOne, double sideTwo, double sideThree) {
        double semiPerimeter = (sideOne + sideTwo + sideThree) / 2;
        return Math.sqrt(
                semiPerimeter *
                (semiPerimeter - sideOne) *
                (semiPerimeter - sideTwo) *
                (semiPerimeter - sideThree)
        );
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double sideOne = input.nextDouble();

        System.out.print("Enter side 2: ");
        double sideTwo = input.nextDouble();

        System.out.print("Enter side 3: ");
        double sideThree = input.nextDouble();

        if (isValid(sideOne, sideTwo, sideThree)) {

            double triangleArea = area(sideOne, sideTwo, sideThree);

            System.out.println("The area of the triangle is: " + triangleArea);

        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }
    }
}
