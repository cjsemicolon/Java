import java.util.Scanner;

public class TaskFive{

public static void main(String[] args){

    Scanner numCollector = new Scanner(System.in);
    
    System.out.println("Input the first digit");
    int num1 = numCollector.nextInt();

    System.out.println("Input the second digit");
    int num2 = numCollector.nextInt();

    int product = num1 * num2;

    System.out.println(product);

    }

}
