import java.util.Scanner;

public class TaskTwentyFour{

    public static void main(String[] args){

        Scanner swapText = new Scanner(System.in);
        
        System.out.println("Enter first text:");
        int firstNum = swapText.nextInt();

        System.out.println("Enter second text:");
        int secondNum =swapText.nextInt();
        
        int thirdNum = firstNum;

        System.out.printf("The first number is %d, while the second number is %d%n",firstNum, secondNum);

         firstNum = secondNum;

         secondNum = thirdNum;

        System.out.printf("The swapped first number is %d, while the swapped second number is %d%n",firstNum, secondNum);

         

    }

}
