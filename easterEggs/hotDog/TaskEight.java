import java.util.Scanner;

public class TaskEight{

public static void main(String[] args){

    Scanner minuteCollector = new Scanner(System.in);

    System.out.println("Enter number of minutes:");
    long mins = minuteCollector.nextInt();

    long dailyMins = 24 * 60;
    long yearlyMins = 365 * dailyMins;

    long year = mins/yearlyMins;

    long leftOver = mins % yearlyMins;

    long days = leftOver/ dailyMins;
    
     

    System.out.printf("%d is the number of years and %d is the number of days",year, days);

    }

}
