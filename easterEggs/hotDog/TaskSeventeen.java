import java.util.Scanner;

public class TaskSeventeen {
    public static void main(String[] args) {

        Scanner pointCollector = new Scanner(System.in);

        System.out.print("Input x1: ");
        double x1 = pointCollector.nextDouble();

        System.out.print("Input y1: ");
        double y1 = pointCollector.nextDouble();

     System.out.print("Input x2: ");
        double x2 = pointCollector.nextDouble();

        System.out.print("Input y2: ");
        double y2 = pointCollector.nextDouble();

       System.out.print("Input x3: ");
        double x3 = pointCollector.nextDouble();

        System.out.print("Input y3: ");
        double y3 = pointCollector.nextDouble();

        double side1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double side2 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        double side3 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));

        double s = (side1 + side2 + side3) / 2;

        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.println("The area of the triangle is: " + area);
    }
}
