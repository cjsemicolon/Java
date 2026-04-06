import java.util.Scanner;

public class pinCheck {
    public static void main(String[] args) {

        Scanner pinInput = new Scanner(System.in);

        System.out.print("Enter a 4-digit PIN: ");
        int pin = pinInput.nextInt();

        if (pin >= 1000 && pin <= 9999) {
            System.out.println("Valid PIN");
        } else {
            System.out.println("Invalid PIN");
        }

    }
}
