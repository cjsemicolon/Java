import java.util.Scanner;

public class TaskNine{

public static void main(String[] args){

    Scanner dataCollector = new Scanner(System.in);

    System.out.println("Initial Velocity in m/s:");
    int u = dataCollector.nextInt();

    System.out.println("Time span in s:");
     int t = dataCollector.nextInt();

    System.out.println("Acceleration in m/s square:");
      int a = dataCollector.nextInt();

    double distance = u * t + 0.5 * a * t * t;
    

    System.out.printf("The distance covered is %.2f",distance);

    }

}
