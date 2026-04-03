import java.util.Scanner;

public class TaskFourteen{

public static void main(String[] args){

    Scanner numCollector = new Scanner(System.in);

    System.out.println("Input first digit:");
     double num1 = numCollector.nextInt();

       System.out.println("Input second digit:");
        double num2 = numCollector.nextInt();

     System.out.println("Input third digit:");
     double num3 = numCollector.nextInt();

     double sum = num1 + num2 + num3;
    
    double average = sum/3;

    System.out.println(average);

    }

}
