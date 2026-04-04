import java.util.Scanner;
public class TaskSix{

public static void main(String[] args){

    Scanner calculator = new Scanner(System.in);

    System.out.println("Enter Subtotal:");
    double subTotal = calculator.nextInt();

    System.out.println("Enter Gratuity Rate:");
    double gratuityRate = calculator.nextInt();

    double gratuity = subTotal * gratuityRate/100;

    double total = subTotal + gratuity;

    System.out.printf("Gratuity is %.2f and Total is %.2f%n",gratuity, total);

    }


}


