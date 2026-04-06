import java.util.Scanner;

public class atm {
    public static void main(String[] args) {

      int savedPin = 1234;

      Scanner pin = new Scanner(System.in);
        System.out.println("Enter your pin");
        int atmPin = pin.nextInt();

        if(atmPin == savedPin) {

            System.out.println("Your balance is $1000");        
            
            }

        else {

            System.out.println("Incorrect pin");

            }
       }

}
