import java.util.Scanner;

public class TaskSeventeen{

    public static void main(String[] args){

    Scanner digitCollector = new Scanner(System.in);
    
    System.out.println("Input digit");

    int num = digitCollector.nextInt(); 

    int numPlusTen = num + 10;

    System.out.print(numPlusTen);   

    }

}
