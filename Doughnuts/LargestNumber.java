import java.util.Scanner;

public class LargestNumber{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

          System.out.println("Give the first number");
        
             int num1 = input.nextInt();

        
             System.out.println("Give the second number");
        
             int num2 = input.nextInt();  

            if(num1 > num2)
                System.out.print(num1);
            else
                System.out.print(num2);
    
    }
}
