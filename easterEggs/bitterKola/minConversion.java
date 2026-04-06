import java.util.Scanner;

public class MinConversion {
    public static void main(String[] args) {

        Scanner min = new Scanner(System.in);

        System.out.print("Enter total minutes: ");
        int totalMinutes = min.nextInt();

        int days = totalMinutes / (24 * 60);           
        int remainingMinutesAfterDays = totalMinutes % (24 * 60);

        int hours = remainingMinutesAfterDays / 60;   //
        int minutes = remainingMinutesAfterDays % 60;

        System.out.printf("%d minutes = %d days, %d hours, %d minutes\n", 
                          totalMinutes, days, hours, minutes);

   
    }
}
