import java.util.Scanner;

public class TaskTwenty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input distance: ");
        double distance = input.nextDouble();

        System.out.print("Input fuel efficiency (miles per gallon): ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Input price per gallon: ");
        double pricePerGallon = input.nextDouble();

        double gallonsNeeded = distance / milesPerGallon;

        double costOfTrip = gallonsNeeded * pricePerGallon;

        System.out.printf("The cost of the trip is %.2f", costOfTrip);
    }
}
