import java.util.Scanner;

public class speedCheck {
    public static void main(String[] args) {

        Scanner speed = new Scanner(System.in);

        System.out.print("Enter speed (km/h): ");
        int speed = speed.nextInt();

        if (speed == 0) {
            System.out.println("Stationary");
        } else if (speed >= 1 && speed <= 40) {
            System.out.println("Slow");
        } else if (speed >= 41 && speed <= 80) {
            System.out.println("Moderate");
        } else if (speed >= 81 && speed <= 120) {speedCheck
            System.out.println("Fast");
        } else if (speed > 120) {
            System.out.println("Dangerously Fast");
        } else {
            System.out.println("Invalid speed");
        }

    }
}
