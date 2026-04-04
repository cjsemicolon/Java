import java.util.Scanner;
public class TaskFive{

public static void main(String[] args){

    Scanner unitConverter = new Scanner(System.in);

    System.out.println("Enter number in square meters:");
    int squareMeters = unitConverter.nextInt();

    double ping = squareMeters * 0.3025;

    System.out.printf("The number in ping is %.2f%n",ping);

    }


}

