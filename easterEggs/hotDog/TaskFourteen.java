import java.util.Scanner;

public class TaskFourteen{

public static void main(String[] args){

    Scanner dataCollector = new Scanner(System.in);

    System.out.println("Input weight in pounds:");
     double weight = dataCollector.nextInt();

       System.out.println("Input height in inches:");
        double height = dataCollector.nextInt();

    double bmi = weight * 703/height * height;    

    System.out.println(bmi);

    }

}
