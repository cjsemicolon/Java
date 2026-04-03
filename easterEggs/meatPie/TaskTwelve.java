import java.util.Scanner;

public class TaskTwelve{

public static void main(String[] args){

    Scanner numCollector = new Scanner(System.in);
    
    System.out.println("Input the first digit");
    int num1 = numCollector.nextInt();

    System.out.println("Input the second digit");
    int num2 = numCollector.nextInt();

    System.out.printf("%d is the first number and %d is the second", num1, num2);

    }

}
