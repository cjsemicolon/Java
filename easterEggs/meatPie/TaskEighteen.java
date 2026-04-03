import java.util.Scanner;

public class TaskEighteen{

    public static void main(String[] args){

    Scanner digitCollector = new Scanner(System.in);
    
    System.out.println("Input digit");

    int num = digitCollector.nextInt(); 

    int numMinusFive = num - 5;

    System.out.print(numMinusFive);   

    }

}
