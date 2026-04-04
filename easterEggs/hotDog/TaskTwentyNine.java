import java.util.Scanner;

public class TaskTwentyNine {
    public static void main(String[] args) {
        Scanner gradeCollector = new Scanner(System.in);

        System.out.print("Enter a score (0-100): ");
        int score = gradeCollector.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
        } else {
            if (score >= 90) {
                System.out.println("Grade:A");
            } else if (score >= 80) {
                System.out.println("Grade:B");
            } else if (score >= 70) {
                System.out.println("Grade:C");
            } else if (score >= 60) {
                System.out.println("Grade:D");
            } else {
                System.out.println("Grade:F");
            }
        }

    }
}
