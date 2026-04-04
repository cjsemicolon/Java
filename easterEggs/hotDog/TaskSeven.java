import java.util.Scanner;

public class TaskSeven{

public static void main(String[] args){

    Scanner squareCollector = new Scanner(System.in);

    System.out.println("Input first digit:");
    int num = squareCollector.nextInt();

    int square = num * num;

    System.out.println(square);

    }

}
