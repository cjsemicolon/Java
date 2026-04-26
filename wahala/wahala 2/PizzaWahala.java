import java.util.Scanner;

public class PizzaWahala {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        displayMenu();

        int numberOfPeople = getNumberOfPeople(input);
        int choice = getPizzaChoice(input);

        processOrder(numberOfPeople, choice);
    }

    public static void displayMenu() {
        System.out.println("1. Sapa Size    - 4 slices  - N2500");
        System.out.println("2. Small Money  - 6 slices  - N2900");
        System.out.println("3. Big Boys     - 8 slices  - N4000");
        System.out.println("4. Odogwu       - 12 slices - N5200");
    }

    public static int getNumberOfPeople(Scanner input) {
        System.out.print("Enter number of guests: ");
        return input.nextInt();
    }

    public static int getPizzaChoice(Scanner input) {
        System.out.print("Choose pizza type (1-4): ");
        return input.nextInt();
    }

    public static int getSlices(int choice) {
        if (choice == 1) return 4;
        else if (choice == 2) return 6;
        else if (choice == 3) return 8;
        else if (choice == 4) return 12;
        else return 0;
    }

    public static int getPrice(int choice) {
        if (choice == 1) return 2500;
        else if (choice == 2) return 2900;
        else if (choice == 3) return 4000;
        else if (choice == 4) return 5200;
        else return 0;
    }

    public static void processOrder(int people, int choice) {

        int slicesPerBox = getSlices(choice);
        int pricePerBox = getPrice(choice);

        if (slicesPerBox == 0) {
            System.out.println("Invalid pizza choice!");
            return;
        }

        int boxes = people / slicesPerBox;

        if (people % slicesPerBox != 0) {
            boxes = boxes + 1;
        }

        int totalSlices = boxes * slicesPerBox;
        int leftover = totalSlices - people;
        int totalPrice = boxes * pricePerBox;

        System.out.println("\nBoxes to buy: " + boxes);
        System.out.println("Leftover slices: " + leftover);
        System.out.println("Total price: N" + totalPrice);
    }
}
