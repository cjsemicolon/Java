import java.util.Scanner;

public class TaskTwenty{

public static void main(String[] args){

    Scanner numCollector = new Scanner(System.in);
    
    System.out.println("Input the length");
    int length = numCollector.nextInt();

    System.out.println("Input the width");
    int width = numCollector.nextInt();

    int area = length * width;

    System.out.printf("%dcm", area);

    }

}
