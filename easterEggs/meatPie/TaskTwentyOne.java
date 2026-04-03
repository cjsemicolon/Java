import java.util.Scanner;

public class TaskTwentyOne{

public static void main(String[] args){

    Scanner numCollector = new Scanner(System.in);
    
    System.out.println("Input the length");
    double base = numCollector.nextInt();

    System.out.println("Input the width");
    double height = numCollector.nextInt();

    double product = base * height;

    double area = product/2;

    System.out.printf("%fcm", area);

    }

}
