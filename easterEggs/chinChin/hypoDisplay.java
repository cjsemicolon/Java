import java.util.Scanner;

public class hypoDisplay {
    public static void main(String[] args) {
        Scanner dataCollector = new Scanner(System.in);

        System.out.print("input length of first leg: ");
        double leg1 = dataCollector.nextDouble();

        System.out.print("input length of second leg: ");
        double leg2 = dataCollector.nextDouble();

        double hypotenuse = Math.sqrt(leg1 * leg1 + leg2 * leg2);

        System.out.printf("Hypotenuse = %.2f", hypotenuse);

    }
}
