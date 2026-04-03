import java.util.Scanner;

public class TaskSixteen{

public static void main(String[] args){

    Scanner numCollector = new Scanner(System.in);
    
    System.out.println("Input digit");
    int num = numCollector.nextInt();

    int multipliedByFive = num * 5;

    System.out.println(multipliedByFive);

    }

}
