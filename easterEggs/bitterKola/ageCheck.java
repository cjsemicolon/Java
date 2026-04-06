import java.util.Scanner;

public class ageCheck {
    public static void main(String[] args) {

        Scanner dataCollector = new Scanner(System.in);

        System.out.print("input birth year: ");
        int birthYear = dataCollector.nextInt();

        System.out.print("input current year: ");
        int currentYear = dataCollector.nextInt();

        int age = currentYear - birthYear;

        System.out.println("You are " + age + " years old.");

        if (age >= 65) {
            System.out.println("Eligible for senior citizen discount.");
        } else {
            System.out.println("Not eligible for senior citizen discount.");
        }

    }
}
