import java.util.Scanner;

public class gpaDisplay {
    public static void main(String[] args) {

        Scanner gpaInput = new Scanner(System.in);

        System.out.print("Enter a letter grade (A, B, C, D, F): ");

        String grade = gpaInput.nextLine();

        if (grade.equals("A")) {
            System.out.println("GPA: 4.0");
        } else if (grade.equals("B")) {
            System.out.println("GPA: 3.0");
        } else if (grade.equals("C")) {
            System.out.println("GPA: 2.0");
        } else if (grade.equals("D")) {
            System.out.println("GPA: 1.0");
        } else if (grade.equals("F")) {
            System.out.println("GPA: 0.0");
        } else {
            System.out.println("Error: Invalid grade entered.");
        }
    }
}
