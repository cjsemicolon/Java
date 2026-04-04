import java.util.Scanner;

public class TaskThirty {
    public static void main(String[] args) {
        Scanner timeMaster = new Scanner(System.in);

        System.out.print("Input number of seconds: ");
        int totalSeconds = timeMaster.nextInt();

        int secondsPerMinute = 60;
        int minutesPerHour = 60;
        int secondsPerHour = minutesPerHour * secondsPerMinute; 

        int hours = totalSeconds / secondsPerHour;

        int remainingSecondsAfterHours = totalSeconds % secondsPerHour;

        int minutes = remainingSecondsAfterHours / secondsPerMinute;

        int seconds = remainingSecondsAfterHours % secondsPerMinute;

        System.out.printf("%d seconds = %d hour(s), %d minute(s), %d second(s)%n",
                          totalSeconds, hours, minutes, seconds);

    }
}
