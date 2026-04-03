import java.util.Scanner;

public class NumbersClassWork{

    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.println("Give the first number");
        
        int num1 = input.nextInt();

        
        System.out.println("Give the second number");
        
        int num2 = input.nextInt();

        int product = num1 * num2;

        System.out.println (product);


    }




}
