import java.util.Scanner;

public class TaskThree{

public static void main(String[] args){

    Scanner triangleLength = new Scanner(System.in);

    System.out.println("Enter triangle length:");
    int length = triangleLength.nextInt();

    double area = Math.sqrt(3)/4 * length * length;

    System.out.printf("The area is %.2f%n",area);  

    double volume = area * length;

    System.out.printf("The Volume is %.2f%n",volume);  

    }

}
