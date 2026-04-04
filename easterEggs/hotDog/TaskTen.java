import java.util.Scanner;

public class TaskTen{

public static void main(String[] args){

    Scanner dataCollector = new Scanner(System.in);

    System.out.println("Amount of water in kg:");
    int waterMass = dataCollector.nextInt();

    System.out.println("Initial Temperature:");
     int initialTemp = dataCollector.nextInt();

    System.out.println("Final temperature:");
      int finalTemp = dataCollector.nextInt();

    double energy = waterMass * (finalTemp - initialTemp) * 4184;
    

    System.out.printf("The energy is =%.2fj",energy);

    }

}
