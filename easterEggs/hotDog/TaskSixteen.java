import java.util.Scanner;

public class TaskSixteen{

public static void main(String[] args){

    Scanner sideCollector = new Scanner(System.in);
    
    System.out.println("Input value of hexagon side");
    int side = sideCollector.nextInt();

    double area = (3 * Math.sqrt(3)/2) * side * side;

    System.out.println(area);

    }

}
