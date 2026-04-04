import java.util.Scanner;

public class TaskFifteen{

    public static void main(String[] args){

    Scanner pointCollector = new Scanner(System.in);
    
    System.out.println("Input x1");
    int x1 = pointCollector.nextInt();

    System.out.println("Input y1");
    int y1 = pointCollector.nextInt();

    System.out.println("Input x2");
    int x2 = pointCollector.nextInt();

    System.out.println("Input y2");
    int y2 = pointCollector.nextInt();


    double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

    System.out.println(distance);




    }

}
