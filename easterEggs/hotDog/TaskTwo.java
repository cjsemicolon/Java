import java.util.Scanner;

public class TaskTwo{

public static void main(String[] args){

    Scanner triangleLength = new Scanner(System.in);

    System.out.println("Enter triangle length:");
    int length = triangleLength.nextInt();

    double area = Math.sqrt(3)/4 * length * length;

    System.out.printf("%.2f",area);    

    }

}
