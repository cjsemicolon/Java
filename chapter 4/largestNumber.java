/*
Psuedocode
initialize largest number as lowest possible value
use loop to collect user input 10 times
if userinput > largest number
largest = userinput
print largest

*/



import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;

        for (int counter = 1; counter <= 10; counter++) {
            System.out.print("Enter number: ");
            int number = inputCollector.nextInt();

            if (number > largest)
                largest = number;
        }

        System.out.println("Largest number is: " + largest);
    }
}
