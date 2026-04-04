import java.util.Scanner;
public class TaskOne{

public static void main(String[] args){

    Scanner unitConverter = new Scanner(System.in);

    System.out.println("Enter distance in miles:");
    int miles = unitConverter.nextInt();

    double kilometers = miles * 1.6;

    System.out.printf("The distance in Kilometers is %.2fkm%n",kilometers);

    }


}

