import java.util.Scanner;

public class TaskTwentyTwo{

public static void main(String[] args){

    Scanner radiusCollector = new Scanner(System.in);
    
    System.out.println("Input the radius");
    double radius = radiusCollector.nextInt();

    double product = radius * radius;

    double area = 3.14 * radius * radius;

    System.out.printf("%fcm", area);

    }

}
