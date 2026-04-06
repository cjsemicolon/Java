import java.util.Scanner;

public class tempClassifier {
    public static void main(String[] args) {
        Scanner tempCollector = new Scanner(System.in);

        System.out.print("input temperature in Celsius: ");
        double temp = tempCollector.nextDouble();

        if (temp < 0) {
            System.out.println("Freezing");
        } else if (temp <= 15) { 
            System.out.println("Cold");
        } else if (temp <= 25) {
            System.out.println("Warm");
        } else { 
            System.out.println("Hot");
        }

    }
}
