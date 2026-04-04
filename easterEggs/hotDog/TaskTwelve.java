import java.util.Scanner;

public class TaskTwelve{

public static void main(String[] args){

    Scanner dataCollector = new Scanner(System.in);

    System.out.println("acceleration of plane");
    int acceleration = dataCollector.nextInt();

    System.out.println("velocity:");
     int velocity = dataCollector.nextInt();

    double length = velocity * velocity/2 * acceleration ;
    

    System.out.printf("The minimum length of the runway is =%.2f",length);

    }

}
