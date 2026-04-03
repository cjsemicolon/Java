import java.util.Scanner;

public class TaskEight{

public static void main(String[] args){

    Scanner squareCollector = new Scanner(System.in);

    System.out.println("Input first digit:");
    int num = squareCollector.nextInt();

    int cube = num * num * num;

    System.out.println(cube);

    }

}
