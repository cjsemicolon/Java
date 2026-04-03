import java.util.Scanner;

public class TaskTen{

public static void main(String[] args){

    Scanner numCollector = new Scanner(System.in);

    System.out.println("Input first digit:");
    int num = numCollector.nextInt();

    int doubleNum = num + num;

    System.out.println(doubleNum);

    }

}
