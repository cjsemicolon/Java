import java.util.Scanner;

public class equationSolution {
    public static void main(String[] args) {
        Scanner coefficient = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = coefficient.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = coefficient.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = coefficient.nextDouble();

        if (a == 0) {
            System.out.println("The equation has no unique solution.");
        } else {
            double x = (c - b) / a;
            System.out.println("Solution x = " + x);
        }
    }
}
