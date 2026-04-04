import java.util.Scanner;
public class TaskFour{

public static void main(String[] args){

    Scanner unitConverter = new Scanner(System.in);

    System.out.println("Enter measurement in meters:");
    int meters = unitConverter.nextInt();

    double feet = meters * 3.2786;

    System.out.printf("The measurement in feet is %.2fft%n",feet);

    }


}

