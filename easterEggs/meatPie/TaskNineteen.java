import java.util.Scanner;

public class TaskNineteen{

public static void main(String[] args){

    Scanner numCollector = new Scanner(System.in);

    System.out.println("Input digit:");
     double num = numCollector.nextInt();

    double numReminder = num/2;

    System.out.println(numReminder);

    }

}
