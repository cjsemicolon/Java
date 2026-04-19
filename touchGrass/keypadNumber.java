import java.util.Scanner;

public class keypadNumber {
    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = inputCollector.nextLine().charAt(0);

        if (Character.isLetter(letter)) {
            letter = Character.toLowerCase(letter);

            int number;

            if (letter >= 'a' && letter <= 'c') {
                number = 2;
            } else if (letter >= 'd' && letter <= 'f') {
                number = 3;
            } else if (letter >= 'g' && letter <= 'i') {
                number = 4;
            } else if (letter >= 'j' && letter <= 'l') {
                number = 5;
            } else if (letter >= 'm' && letter <= 'o') {
                number = 6;
            } else if (letter >= 'p' && letter <= 's') {
                number = 7;
            } else if (letter >= 't' && letter <= 'v') {
                number = 8;
            } else { // w, x, y, z
                number = 9;
            }

            System.out.println("The corresponding number is: " + number);

        } else {
            System.out.println("Invalid input");
        }

    }
}
