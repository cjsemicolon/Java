import java.util.Scanner;

public class gasMileage {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        int miles;
        int gallons;
        double totalMiles = 0;
        double totalGallons = 0;

        System.out.print("Enter miles (-1 to quit): ");
        miles = inputCollector.nextInt();

        while (miles != -1) {
            System.out.print("Enter gallons: ");
            gallons = inputCollector.nextInt();

            double milesPerGallon = (double) miles / gallons;
            System.out.println("MPG: " + milesPerGallon);

            totalMiles += miles;
            totalGallons += gallons;

            System.out.println("Combined MPG: " + (totalMiles / totalGallons));

            System.out.print("Enter miles (-1 to quit): ");
            miles = inputCollector.nextInt();
        }
    }
}
