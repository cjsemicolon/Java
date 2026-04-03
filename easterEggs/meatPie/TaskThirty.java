import java.util.Scanner;

public class TaskThirty{

public static void main(String[] args){

    Scanner numCollector = new Scanner(System.in);
    
    System.out.println("Input the first digit");
    int num1 = numCollector.nextInt();

    System.out.println("Input the second digit");
    int num2 = numCollector.nextInt();

    int sum = num1 + num2;

    int product = num1 * num2;

    System.out.printf("Sum:%d%nProduct:%d%n",sum, product);

    }

}
